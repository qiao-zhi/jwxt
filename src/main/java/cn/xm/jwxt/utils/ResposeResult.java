package cn.xm.jwxt.utils;

import java.io.Serializable;

/**
 * 返回ajax请求的工具类
 *
 * @param <T>   需要封装的数据
 */
public class ResposeResult<T> implements Serializable {
    private int status = 200;//返回状态码,默认是200代表成功
    private boolean success = true;//默认是成功
    private String msg;//返回的信息
    private T data;//返回携带的数据

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "ResposeResult{" +
                "status=" + status +
                ", success=" + success +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
