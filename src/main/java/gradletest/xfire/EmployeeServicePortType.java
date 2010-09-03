
package gradletest.xfire;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import com.berinle.Employee;

@WebService(name = "EmployeeServicePortType", targetNamespace = "http://berinle.com")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface EmployeeServicePortType {


    @WebMethod(operationName = "addEmployee", action = "")
    public void addEmployee(
        @WebParam(name = "in0", targetNamespace = "http://berinle.com")
        Employee in0);

}
