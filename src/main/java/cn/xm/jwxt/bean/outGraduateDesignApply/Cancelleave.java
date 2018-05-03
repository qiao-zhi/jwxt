package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.Date;

public class Cancelleave {
    private String cancelleaveid;

    private String leaveid;

    private Date canceltime;

    private Date passstarttime;

    private Date passendtime;

    public String getCancelleaveid() {
        return cancelleaveid;
    }

    public void setCancelleaveid(String cancelleaveid) {
        this.cancelleaveid = cancelleaveid == null ? null : cancelleaveid.trim();
    }

    public String getLeaveid() {
        return leaveid;
    }

    public void setLeaveid(String leaveid) {
        this.leaveid = leaveid == null ? null : leaveid.trim();
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