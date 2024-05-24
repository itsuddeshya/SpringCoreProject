package SpringCoreProject.Project1;

public class Human {
	
	
	
	
	private Integer hId;
	private String hName;
	private String hType;
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(Integer hId, String hName, String hType) {
		super();
		this.hId = hId;
		this.hName = hName;
		this.hType = hType;
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

	@Override
	public String toString() {
		return "Human [hId=" + hId + ", hName=" + hName + ", hType=" + hType + "]";
	}
	
}
