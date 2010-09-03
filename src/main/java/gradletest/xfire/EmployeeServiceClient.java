
package gradletest.xfire;

import java.net.MalformedURLException;
import java.util.Collection;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.codehaus.xfire.XFireRuntimeException;
import org.codehaus.xfire.aegis.AegisBindingProvider;
import org.codehaus.xfire.annotations.AnnotationServiceFactory;
import org.codehaus.xfire.annotations.jsr181.Jsr181WebAnnotations;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.jaxb2.JaxbTypeRegistry;
import org.codehaus.xfire.service.Endpoint;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.soap.AbstractSoapBinding;
import org.codehaus.xfire.transport.TransportManager;

public class EmployeeServiceClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public EmployeeServiceClient() {
        create0();
        Endpoint EmployeeServicePortTypeLocalEndpointEP = service0 .addEndpoint(new QName("http://berinle.com", "EmployeeServicePortTypeLocalEndpoint"), new QName("http://berinle.com", "EmployeeServicePortTypeLocalBinding"), "xfire.local://EmployeeService");
        endpoints.put(new QName("http://berinle.com", "EmployeeServicePortTypeLocalEndpoint"), EmployeeServicePortTypeLocalEndpointEP);
        Endpoint EmployeeServiceHttpPortEP = service0 .addEndpoint(new QName("http://berinle.com", "EmployeeServiceHttpPort"), new QName("http://berinle.com", "EmployeeServiceHttpBinding"), "http://localhost:8080/sample-xfire/services/employeeService");
        endpoints.put(new QName("http://berinle.com", "EmployeeServiceHttpPort"), EmployeeServiceHttpPortEP);
    }

    public Object getEndpoint(Endpoint endpoint) {
        try {
            return proxyFactory.create((endpoint).getBinding(), (endpoint).getUrl());
        } catch (MalformedURLException e) {
            throw new XFireRuntimeException("Invalid URL", e);
        }
    }

    public Object getEndpoint(QName name) {
        Endpoint endpoint = ((Endpoint) endpoints.get((name)));
        if ((endpoint) == null) {
            throw new IllegalStateException("No such endpoint!");
        }
        return getEndpoint((endpoint));
    }

    public Collection getEndpoints() {
        return endpoints.values();
    }

    private void create0() {
        TransportManager tm = (org.codehaus.xfire.XFireFactory.newInstance().getXFire().getTransportManager());
        HashMap props = new HashMap();
        props.put("annotations.allow.interface", true);
        AnnotationServiceFactory asf = new AnnotationServiceFactory(new Jsr181WebAnnotations(), tm, new AegisBindingProvider(new JaxbTypeRegistry()));
        asf.setBindingCreationEnabled(false);
        service0 = asf.create((gradletest.xfire.EmployeeServicePortType.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://berinle.com", "EmployeeServicePortTypeLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://berinle.com", "EmployeeServiceHttpBinding"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public EmployeeServicePortType getEmployeeServicePortTypeLocalEndpoint() {
        return ((EmployeeServicePortType)(this).getEndpoint(new QName("http://berinle.com", "EmployeeServicePortTypeLocalEndpoint")));
    }

    public EmployeeServicePortType getEmployeeServicePortTypeLocalEndpoint(String url) {
        EmployeeServicePortType var = getEmployeeServicePortTypeLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public EmployeeServicePortType getEmployeeServiceHttpPort() {
        return ((EmployeeServicePortType)(this).getEndpoint(new QName("http://berinle.com", "EmployeeServiceHttpPort")));
    }

    public EmployeeServicePortType getEmployeeServiceHttpPort(String url) {
        EmployeeServicePortType var = getEmployeeServiceHttpPort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

}
