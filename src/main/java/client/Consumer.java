package client;

import com.berinle.*;
import java.util.*;
import java.text.*;

public class Consumer {
	public static void main(String[] a){
		
		System.out.println("about to call web service");
		EmployeeServiceClient svc =  new EmployeeServiceClient();
		EmployeeServicePortType port = svc.getEmployeeServiceHttpPort();
		Employee e = new Employee();
		e.setFirstName("John");
		e.setLastName("Doe");
		e.setUserName("jdoe");
		
		//giving error Caused by: org.codehaus.xfire.fault.XFireFault: Could not parse xs:dateTime: Format.parseObject(String) failed
		//e.setDob(Calendar.getInstance());
		
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
		e.setDobAsString(df.format(d));
		port.addEmployee(e);
		System.out.println("Done invocation!");
	}
}
