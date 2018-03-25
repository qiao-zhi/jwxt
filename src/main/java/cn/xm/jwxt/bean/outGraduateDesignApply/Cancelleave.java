package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.Date;

public class Cancelleave {
    private Integer cancelleaveid;

    private Integer leaveid;

    private Date canceltime;

    private Date passstarttime;

    private Date passendtime;

    public Integer getCancelleaveid() {
        return cancelleaveid;
    }

    public void setCancelleaveid(Integer cancelleaveid) {
        this.cancelleaveid = cancelleaveid;
    }

    public Integer getLeaveid() {
        return leaveid;
    }

    public void setLeaveid(Integer leaveid) {
        this.leaveid = leaveid;
    }

    public Date getCanceltime() {
        return canceltime;
    }

    public void setCanceltime(Date canceltime) {
        this.canceltime = canceltime;
    }

    public Date getPassstarttime() {
        return passstarttime;
    }

    public void setPassstarttime(Date passstarttime) {
        this.passstarttime = passstarttime;
    }

    public Date getPassendtime() {
        return passendtime;
    }

    public void setPassendtime(Date passendtime) {
        this.passendtime = passendtime;
    }
}