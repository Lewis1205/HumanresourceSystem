package com.lewis.pojo;

public class SalaryRecord {
    private Integer recordId;

    private String recordNum;

    private Integer staffId;

    private Integer standardId;

    private Double bonus;

    private Double deduction;

    private Boolean status;

    
    
    @Override
	public String toString() {
		return "SalaryRecord [recordId=" + recordId + ", recordNum="
				+ recordNum + ", staffId=" + staffId + ", standardId="
				+ standardId + ", bonus=" + bonus + ", deduction=" + deduction
				+ ", status=" + status + "]";
	}

	public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getRecordNum() {
        return recordNum;
    }

    public void setRecordNum(String recordNum) {
        this.recordNum = recordNum == null ? null : recordNum.trim();
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getStandardId() {
        return standardId;
    }

    public void setStandardId(Integer standardId) {
        this.standardId = standardId;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Double getDeduction() {
        return deduction;
    }

    public void setDeduction(Double deduction) {
        this.deduction = deduction;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}