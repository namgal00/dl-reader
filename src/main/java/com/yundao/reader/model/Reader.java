package com.yundao.reader.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;







@Table(name = "reader")

public class Reader implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id

	private Long id; //读者ID
	
	@NotNull
	@JoinColumn(name = "reader_type_id")
	@ManyToOne(fetch=FetchType.LAZY)
	private Long readerType; //读者类型编号
	
	@Column(name = "reader_type_code")
	private String readerTypeCode; //读者类型代码
	
	@NotEmpty
	private String barcode; //读者条形码
	
	@NotNull
	@JoinColumn(name = "school_dept_id")
	@ManyToOne
	private Long schoolDept; //读者组织Id
	
	@Column(name = "school_code")
	private String schoolCode; //学校代码
	
	private String account; //登录账号
	
	@NotEmpty
	private String password; //密码
	
	@NotEmpty
	private String name; //名字
	
	@Column(name = "identify_code")
	private String identifyCode; //身份证号
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday; //出生日期
	
	private String sex; //性别
	
	@NotNull
	private Integer status; //读者证状态   1:有效  2：验证  3：挂失 4：暂停 5注销
	
	@Column(name = "start_date")
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate; //读者证有效启用日期
	
	@Column(name = "end_date")
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate; //读者证有效期终止日期
	
	private String address; //读者住址
	
	private String postCode; //邮编
	
	private String email; //邮箱
	
	@Column(name = "phone_number")
	private String phoneNumber; //电话号码
	
	private String nation; //民族
	
	@Column(name = "reader_native")
	private String readerNative; //籍贯
	
	@NotNull
	@JoinColumn(name = "sys_user_id")
	@ManyToOne
	private Long sysUser; //操作者ID
	
	@Column(name = "create_date")
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createDate; //办证时间
	
	@NotNull
	@JoinColumn(name = "school_id")
	@ManyToOne
	private Long school; //学校Id
	
	private String photo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getReaderType() {
		return readerType;
	}

	public void setReaderType(Long readerType) {
		this.readerType = readerType;
	}

	public String getReaderTypeCode() {
		return readerTypeCode;
	}

	public void setReaderTypeCode(String readerTypeCode) {
		this.readerTypeCode = readerTypeCode;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Long getSchoolDept() {
		return schoolDept;
	}

	public void setSchoolDept(Long schoolDept) {
		this.schoolDept = schoolDept;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentifyCode() {
		return identifyCode;
	}

	public void setIdentifyCode(String identifyCode) {
		this.identifyCode = identifyCode;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getReaderNative() {
		return readerNative;
	}

	public void setReaderNative(String readerNative) {
		this.readerNative = readerNative;
	}

	public Long getSysUser() {
		return sysUser;
	}

	public void setSysUser(Long sysUser) {
		this.sysUser = sysUser;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getSchool() {
		return school;
	}

	public void setSchool(Long school) {
		this.school = school;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
}

	

