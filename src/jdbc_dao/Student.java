package jdbc_dao;

public class Student {
	
	private int id;
	private String name;
	private int mobileNo;
	private int age;
	private String dob;
	
	public Student() {
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public int getMobileNo() {
		return mobileNo;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setDOB(String dob) {
		this.dob = dob;
	}
	
	public String getDOB() {
		return dob;
	}
}
