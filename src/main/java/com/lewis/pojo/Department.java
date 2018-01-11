package com.lewis.pojo;

public class Department {
    private Integer deptId;

    private String deptNum;

    private String deptName;

    private Integer parentDept;

    
    @Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptNum=" + deptNum
				+ ", deptName=" + deptName + ", parentDept=" + parentDept + "]";
	}

	public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptNum() {
        return deptNum;
    }

    public void setDeptNum(String deptNum) {
        this.deptNum = deptNum == null ? null : deptNum.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getParentDept() {
        return parentDept;
    }

    public void setParentDept(Integer parentDept) {
        this.parentDept = parentDept;
    }
}