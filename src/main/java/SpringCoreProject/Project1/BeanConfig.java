package SpringCoreProject.Project1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("SpringCoreProject.Project1")
public class BeanConfig {
	@Bean("T1C")
	public Teacher getTeacher() {
		Teacher teacher=new Teacher();
		teacher.setTecId("Tid1C");
		teacher.setTecName("TNameC");
		return teacher;
	}
	public BeanConfig() {
		// TODO Auto-generated constructor stub
	}

}
