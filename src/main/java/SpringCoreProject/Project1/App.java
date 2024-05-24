package SpringCoreProject.Project1;

import java.lang.annotation.Annotation;
import java.lang.invoke.WrongMethodTypeException;
import java.util.Arrays;
import java.util.function.ToDoubleBiFunction;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@Configuration 	
@ComponentScan(basePackages ="SpringCoreProject.Project1")
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// Student student = new Student(2,"Raj",101);
		// System.out.println(student);
		/*
		 * //For config.xml ClassPathXmlApplicationContext
		 * classPathXmlApplicationContext = new
		 * ClassPathXmlApplicationContext("Config.xml"); Student s1 =
		 * (Student)classPathXmlApplicationContext.getBean("s1"); Human h1 =
		 * (Human)classPathXmlApplicationContext.getBean("h1"); System.out.println(s1);
		 * System.out.println(h1);
		 */

		/*
		 * for EmpCollection ClassPathXmlApplicationContext
		 * classPathXmlApplicationContext= new
		 * ClassPathXmlApplicationContext("empColl.xml"); // EmpCollection e1 =
		 * (EmpCollection)classPathXmlApplicationContext.getBean("emp1");
		 * 
		 * //For type safety EmpCollection e1 =
		 * classPathXmlApplicationContext.getBean("emp1",EmpCollection.class);
		 * System.out.println(e1);
		 * 
		 * // String[] e1 =classPathXmlApplicationContext.getAliases("empalis"); //
		 * for(String id:e1) //
		 * System.out.println(classPathXmlApplicationContext.getBean(id,EmpCollection.
		 * class)); // System.out.println(Arrays.toString(e1));
		 */
		
				/*For Autowire*/	
		
//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("autowireConfig.xml");
//		UniversityMain u1= classPathXmlApplicationContext.getBean("U1",UniversityMain.class);
//		UniversityMain u2= classPathXmlApplicationContext.getBean("U1",UniversityMain.class);
//		System.out.println(u1);
//		System.out.println(u2);
//		classPathXmlApplicationContext.close();
		
//					 To remove xml file completely
				
		AnnotationConfigApplicationContext classPathXmlApplicationContext = new AnnotationConfigApplicationContext(App.class);
		UniversityMain u1 = classPathXmlApplicationContext.getBean("U1",UniversityMain.class);
		System.out.println(u1);
		classPathXmlApplicationContext.close();
		
		
	}
			//TO define java bean by using class
//	@Bean("T1C")
//	public Teacher getTeacher() {
//		Teacher teacher=new Teacher();
//		teacher.setTecId("Tid1C");
//		teacher.setTecName("TNameC");
//		return teacher;
//	}
}
