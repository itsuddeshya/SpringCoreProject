package SpringCoreProject.Project1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Gatherer.Integrator;

class EmpParent{
	
	private List<Integer> empProjectsId;
	private String [] teamMem;
	private Map<Integer,String> projectName;
	public void setEmpProjectsId(List<Integer> empProjectsId) {
		this.empProjectsId = empProjectsId;
	}
	public void setTeamMem(String[] teamMem) {
		this.teamMem = teamMem;
	}
	public void setProjectName(Map<Integer, String> projectName) {
		this.projectName = projectName;
	}
	@Override
	public String toString() {
		return "EmpParent [empProjectsId=" + empProjectsId + ", teamMem=" + Arrays.toString(teamMem) + ", projectName="
				+ projectName + "]";
	}
	
}

class Address{
	private Integer addId;
	private String city;
	public void setAddId(Integer addId) {
		this.addId = addId;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + "]";
	}
	
}

public class EmpCollection {	//main class
	
	private Designation designation; //Inner associated object
	private Address address; //associated object	
	private String empName;
	private Integer empId;
	private List<Integer> empProjectsId;
	private String [] teamMem;
	private Map<Integer,String> projectName;
	
	
	
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setProjectName(Map<Integer, String> projectName) {
		this.projectName = projectName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public void setEmpProjectsId(List<Integer> empProjectsId) {
		this.empProjectsId = empProjectsId;
	}



	public void setTeamMem(String[] teamMem) {
		this.teamMem = teamMem;
	}

	@Override
	public String toString() {
		return "EmpCollection [designation=" + designation + ", address=" + address + ", empName=" + empName
				+ ", empId=" + empId + ", empProjectsId=" + empProjectsId + ", teamMem=" + Arrays.toString(teamMem)
				+ ", projectName=" + projectName + "]";
	}

}
class Designation{
	private Integer degId;
	private String degName;
	public void setDegId(Integer degId) {
		this.degId = degId;
	}
	public void setDegName(String degName) {
		this.degName = degName;
	}
	@Override
	public String toString() {
		return "Designation [degId=" + degId + ", degName=" + degName + "]";
	}
	
	
	
}
