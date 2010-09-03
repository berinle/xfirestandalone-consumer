
package gradletest.xfire;

import javax.jws.WebService;
import com.berinle.Employee;

@WebService(serviceName = "EmployeeService", targetNamespace = "http://berinle.com", endpointInterface = "gradletest.xfire.EmployeeServicePortType")
public class EmployeeServiceImpl
    implements EmployeeServicePortType
{


    public void addEmployee(Employee in0) {
        throw new UnsupportedOperationException();
    }

}
