package com.lewis.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Staff {
	private Integer staffId;

	private Integer status;

	private String num;

	private String principleDept;

	private String seniorDept;
	
	private String juniorDept;

	private String posCategory;

	private String posName;

	private String name;

	private String gender;

	private String email;

	private String telephone;

	private String qq;

	private String address;

	private String citizenship;

	private String born;

	private Date birth;

	private String nationality;

	private String religion;

	private String politicsStatus;

	private String identification;

	private String socialInsurance;

	private Integer age;

	private String education;

	private String profession;

	private Integer standardId;

	private String bank;

	private String bankAccount;

	private String characters;

	private String hobby;

	private String register;

	private Date registerTime;

	private String imgUrl;

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", status=" + status + ", num="
				+ num + ", principleDept=" + principleDept + ", seniorDept="
				+ seniorDept + ", juniorDept=" + juniorDept + ", posCategory="
				+ posCategory + ", posName=" + posName + ", name=" + name
				+ ", gender=" + gender + ", email=" + email + ", telephone="
				+ telephone + ", qq=" + qq + ", address=" + address
				+ ", citizenship=" + citizenship + ", born=" + born
				+ ", birth=" + birth + ", nationality=" + nationality
				+ ", religion=" + religion + ", politicsStatus="
				+ politicsStatus + ", identification=" + identification
				+ ", socialInsurance=" + socialInsurance + ", age=" + age
				+ ", education=" + education + ", profession=" + profession
				+ ", standardId=" + standardId + ", bank=" + bank
				+ ", bankAccount=" + bankAccount + ", characters=" + characters
				+ ", hobby=" + hobby + ", register=" + register
				+ ", registerTime=" + registerTime + ", imgUrl=" + imgUrl + "]";
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num == null ? null : num.trim();
	}

	public String getPrincipleDept() {
		return principleDept;
	}

	public void setPrincipleDept(String principleDept) {
		this.principleDept = principleDept == null ? null : principleDept
				.trim();
	}

	public String getSeniorDept() {
		return seniorDept;
	}

	public void setSeniorDept(String seniorDept) {
		this.seniorDept = seniorDept == null ? null : seniorDept.trim();
	}

	public String getJuniorDept() {
		return juniorDept;
	}

	public void setJuniorDept(String juniorDept) {
		this.juniorDept = juniorDept == null ? null : juniorDept.trim();
	}

	public String getPosCategory() {
		return posCategory;
	}

	public void setPosCategory(String posCategory) {
		this.posCategory = posCategory == null ? null : posCategory.trim();
	}

	public String getPosName() {
		return posName;
	}

	public void setPosName(String posName) {
		this.posName = posName == null ? null : posName.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender == null ? null : gender.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone == null ? null : telephone.trim();
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq == null ? null : qq.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship == null ? null : citizenship.trim();
	}

	public String getBorn() {
		return born;
	}

	public void setBorn(String born) {
		this.born = born == null ? null : born.trim();
	}

	public Date getBirth() {
		return birth;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	// 取日期格式
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	// 存日期的格式
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality == null ? null : nationality.trim();
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion == null ? null : religion.trim();
	}

	public String getPoliticsStatus() {
		return politicsStatus;
	}

	public void setPoliticsStatus(String politicsStatus) {
		this.politicsStatus = politicsStatus == null ? null : politicsStatus
				.trim();
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification == null ? null : identification
				.trim();
	}

	public String getSocialInsurance() {
		return socialInsurance;
	}

	public void setSocialInsurance(String socialInsurance) {
		this.socialInsurance = socialInsurance == null ? null : socialInsurance
				.trim();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education == null ? null : education.trim();
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession == null ? null : profession.trim();
	}

	public Integer getStandardId() {
		return standardId;
	}

	public void setStandardId(Integer standardId) {
		this.standardId = standardId;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank == null ? null : bank.trim();
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount == null ? null : bankAccount.trim();
	}

	public String getCharacters() {
		return characters;
	}

	public void setCharacters(String characters) {
		this.characters = characters == null ? null : characters.trim();
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby == null ? null : hobby.trim();
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

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	// 取日期格式
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	// 存日期的格式
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl == null ? null : imgUrl.trim();
	}
}