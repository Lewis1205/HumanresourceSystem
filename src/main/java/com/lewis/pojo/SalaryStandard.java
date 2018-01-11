package com.lewis.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SalaryStandard {
    private Integer standardId;

    private Double totalsalary;

    private String num;

    private String name;

    private String compiler;

    private String register;


	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registerTime;

    private Boolean status;

    private String comment;

    public Integer getStandardId() {
        return standardId;
    }

    public void setStandardId(Integer standardId) {
        this.standardId = standardId;
    }

    public Double getTotalsalary() {
        return totalsalary;
    }

    public void setTotalsalary(Double totalsalary) {
        this.totalsalary = totalsalary;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCompiler() {
        return compiler;
    }

    public void setCompiler(String compiler) {
        this.compiler = compiler == null ? null : compiler.trim();
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register == null ? null : register.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}