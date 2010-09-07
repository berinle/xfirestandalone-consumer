
package com.berinle;

import javax.jws.WebService;

@WebService(serviceName = "EmployeeService", targetNamespace = "http://berinle.com", endpointInterface = "com.berinle.EmployeeServicePortType")
public class EmployeeServiceImpl
    implements EmployeeServicePortType
{


    public void addEmployee(Employee in0) {
        throw new UnsupportedOperationException();
    }

}
