package com.example.spring.freemark.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;
import java.util.Date;

public class MsgClient implements Serializable {

    private java.lang.String id;
    // 电话号码(主键)
    @Excel(name = "电话号码")
    private String clientPhone = null;
    // 客户姓名
    @Excel(name = "姓名")
    private String clientName = null;
    // 备注
    @Excel(name = "备注")
    private String remark = null;
    // 生日
    @Excel(name = "出生日期", format = "yyyy-MM-dd", width = 20)
    private Date birthday = null;
    // 创建人
    private String createBy = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
