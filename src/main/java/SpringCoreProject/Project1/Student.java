package SpringCoreProject.Project1;

public class Student {
	
	private Integer id;
	private String name;
	private Integer rollNo;
	private Integer hId;
	private String hName;
	private String hType;

	/* For Constructor Injection
	
	public Student(Integer id, String name, Integer rollNo) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		System.out.println("3 Arg cons called");
	}

	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("2 arg cons");
	}
*/


	public void setId(Integer id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	


	public Integer gethId() {
		return hId;
	}


	public void sethId(Integer hId) {
		this.hId = hId;
	}


	public String gethName() {
		return hName;
	}


	public void sethName(String hName) {
		this.hName = hName;
	}


	public String gethType() {
		return hType;
	}


	public void sethType(String hType) {
		this.hType = hType;
	}


	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public Integer getRollNo() {
		return rollNo;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", hId=" + hId + ", hName=" + hName
				+ ", hType=" + hType + "]";
	}


	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("No arg cons called");
	}

}
