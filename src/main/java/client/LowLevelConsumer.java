package client;

import com.berinle.*;

import java.util.*;
import java.text.*;

import org.codehaus.xfire.XFire;
import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;

public class LowLevelConsumer {
	public static void main(String[] a) throws Exception{
		
		System.out.println("about to call web service");
		
		Service svc = new ObjectServiceFactory().create(EmployeeServicePortType.class);
		XFire xfire = XFireFactory.newInstance().getXFire();
		XFireProxyFactory factory = new XFireProxyFactory(xfire);
		
		Employee e = new Employee();
		e.setFirstName("John");
		e.setLastName("Doe");
		e.setUserName("jdoe");		
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
		e.setDobAsString(df.format(d));
		
		
		//String svcURL = "http://localhost:7070/sample-xfire/services/employeeService";
		String svcURL = "http://localhost:8080/sample-xfire/services/employeeService"; //jetty
		EmployeeServicePortType port = null;
		port = (EmployeeServicePortType) factory.create(svc, svcURL);						
		port.addEmployee(e);
		
		svcURL = "http://localhost:7070/sample-xfire/services/employeeService"; //WLS
		port = 	(EmployeeServicePortType) factory.create(svc, svcURL);	
		port.addEmployee(e);
		
		System.out.println("Done invocation!");
	}
}
