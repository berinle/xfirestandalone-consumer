
package com.berinle;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.berinle package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmployeeUserName_QNAME = new QName("http://berinle.com", "userName");
    private final static QName _EmployeeEmployeeNo_QNAME = new QName("http://berinle.com", "employeeNo");
    private final static QName _EmployeeLastName_QNAME = new QName("http://berinle.com", "lastName");
    private final static QName _EmployeeFirstName_QNAME = new QName("http://berinle.com", "firstName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.berinle
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddEmployeeResponse }
     * 
     */
    public AddEmployeeResponse createAddEmployeeResponse() {
        return new AddEmployeeResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link AddEmployee }
     * 
     */
    public AddEmployee createAddEmployee() {
        return new AddEmployee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://berinle.com", name = "userName", scope = Employee.class)
    public JAXBElement<String> createEmployeeUserName(String value) {
        return new JAXBElement<String>(_EmployeeUserName_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://berinle.com", name = "employeeNo", scope = Employee.class)
    public JAXBElement<String> createEmployeeEmployeeNo(String value) {
        return new JAXBElement<String>(_EmployeeEmployeeNo_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://berinle.com", name = "lastName", scope = Employee.class)
    public JAXBElement<String> createEmployeeLastName(String value) {
        return new JAXBElement<String>(_EmployeeLastName_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://berinle.com", name = "firstName", scope = Employee.class)
    public JAXBElement<String> createEmployeeFirstName(String value) {
        return new JAXBElement<String>(_EmployeeFirstName_QNAME, String.class, Employee.class, value);
    }

}
