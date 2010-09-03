package client;

import gradletest.xfire.*;
import com.berinle.*;

public class Consumer {
	public static void main(String[] a){
		
		System.out.println("about to call web service");
		EmployeeServiceClient svc =  new EmployeeServiceClient();
		EmployeeServicePortType port = svc.getEmployeeServiceHttpPort();
		port.addEmployee(new Employee());
		System.out.println("Done invocation!");
	}
}
