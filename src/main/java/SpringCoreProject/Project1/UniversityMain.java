package SpringCoreProject.Project1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("U1")
public class UniversityMain implements DisposableBean {   //DisposableBean is to call destroy method
	
	
	public UniversityMain() {
		super();
		System.out.println("university Cponstructor called");
	}
	@Value("Annotation university")
	private String universityName;
	@Value("Annotation Id")
	private String universityId;
	@Value("#{5<9?10:20}")   				//Spring Expression Language(SPEL) we can write java code within it.
	private Integer rollId;
	@Autowired
	@Qualifier("D1J")						//it searches bean with given id from xml file.
	private Department department;
	@Autowired
	@Qualifier("T1C")
	private Teacher teacher;
	
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public void setUniversityId(String universityId) {
		this.universityId = universityId;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "UniversityMain [universityName=" + universityName + ", universityId=" + universityId + ", rollId="
				+ rollId + ", department=" + department + ", teacher=" + teacher + "]";
	}

	public void init() {
		System.out.println("init method called");
		
	}
	@Override
	public void destroy() {
		System.out.println("destroy method called");
		
	}		
}

@Component("D1J")   //use @Component To create bean in java file/alternative of xml <bean></bean>.
class Department{
	
	public Department() {	
		
		super();
		System.out.println("Dept cons called");
		
	}
	@Value("Btech_Annotation")
	private String deptName;
	@Value("d102_Annotation")
	private String deptId;
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptId=" + deptId + "]";
	}
	
}

//@Component("T1J")
class Teacher{
	
	public Teacher() {
		super();
		System.out.println("Techer cons called");
	}
//	@Value("Tname_J")
	private String tecName;
//	@Value("Tid_J")
	private String tecId;
	public void setTecName(String tecName) {
		this.tecName = tecName;
	}
	public void setTecId(String tecId) {
		this.tecId = tecId;
	}
	@Override
	public String toString() {
		return "Teacher [tecName=" + tecName + ", tecId=" + tecId + "]";
	}
	
	
}
