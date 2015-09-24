package cn.edu.hdu.zmj.TransFtlToWordDoc;

/**
 * 
 * @author zero
 * @Date 2015年9月23日
 */
public class Resume {

	private String jobIntention;
	
	private String name;
	
	private String sex;
	
	private Integer age;
	
	private String nation;
	
	private String origin;
	
	private String 	healthy;
	
	private String phone;
	
	private String address;
	
	private String email;
	
	private String education;
	
	private String skill;
	
	private String workEx;

	public String getJobIntention() {
		return jobIntention;
	}

	public void setJobIntention(String jobIntention) {
		this.jobIntention = jobIntention;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getHealthy() {
		return healthy;
	}

	public void setHealthy(String healthy) {
		this.healthy = healthy;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getWorkEx() {
		return workEx;
	}

	public void setWorkEx(String workEx) {
		this.workEx = workEx;
	}

	@Override
	public String toString() {
		return "Resume [jobIntention=" + jobIntention + ", name=" + name
				+ ", sex=" + sex + ", age=" + age + ", nation=" + nation
				+ ", origin=" + origin + ", healthy=" + healthy + ", phone="
				+ phone + ", address=" + address + ", email=" + email
				+ ", education=" + education + ", skill=" + skill + ", workEx="
				+ workEx + "]";
	}
}
