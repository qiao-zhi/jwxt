package cn.xm.jwxt.aspect;

import cn.xm.jwxt.annotation.MyLogAnnotation;
import cn.xm.jwxt.bean.system.Logtable;
import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.service.system.LogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Date;

/**
 * @Author: qlq
 * @Description 日志记录切面(拦截自定义注解进行日志记录)
 * @Date: 11:46 2018/5/14
 */
@Component
@Aspect
public class LogAspect {
    @Autowired
    private LogService logService;// 日志Service
    /**
     * 环绕通知记录日志通过注解匹配到需要增加日志功能的方法
     *
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("@annotation(cn.xm.jwxt.annotation.MyLogAnnotation)")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        // 1.方法执行前的处理，相当于前置通知
        // 获取方法签名
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        // 获取方法
        Method method = methodSignature.getMethod();
        // 获取方法上面的注解
        MyLogAnnotation logAnno= method.getAnnotation(MyLogAnnotation.class);
        // 获取到类名
        String targetName = pjp.getTarget().getClass().getName();
        //获取到方法名字
        String methodName = method.getName();
        // 获取操作描述的属性值
        String operateDescription = logAnno.operateDescription();
        // 创建一个日志对象(准备记录日志)
        Logtable logtable = new Logtable();
        logtable.setOperateclass(targetName);//类名
        logtable.setOperatemethod(methodName);
        logtable.setOperatedescription(operateDescription);// 操作说明
        //获取request与session
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession(false);
        //获取request与session中的东西保存到日志中
        String ip = LogAspect.getIpAddress(request);//获取发出请求的IP地址
        User user = (User) session.getAttribute("userinfo");//获取session中的user对象进而获取操作人名字
        logtable.setOperateip(ip);//设置IP地址
        logtable.setOperatorname(user.getUsername());// 设置操作人名称
        logtable.setOperatorid(user.getUsercode());// 设置操作人学号或者教工编号
        logtable.setOperatortype(user.getUsersort());//用户类型
        logtable.setOperatorunitname(user.getUserunitname());//所属机构
        Object result = null;
        try {
            //让代理方法执行
            result = pjp.proceed();
            // 2.相当于后置通知(方法成功执行之后走这里)
            logtable.setOperateresult("正常");// 设置操作结果
        } catch (SQLException e) {
            // 3.相当于异常通知部分
            logtable.setOperateresult("异常");// 设置操作结果
        } finally {
            // 4.相当于最终通知
            logtable.setOperatedate(new Date());// 设置操作日期
            logService.addLogtable(logtable);// 添加日志记录
        }
        return result;
    }

    /**
     * 获取IP地址的方法
     * @param request   传一个request对象下来
     * @return
     */
    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
