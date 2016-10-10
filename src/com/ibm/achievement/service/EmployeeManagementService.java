//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package com.ibm.achievement.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "EmployeeManagementService", targetNamespace = "http://service.achievement.ibm.com/", wsdlLocation = "WEB-INF/wsdl/EmployeeManagementService.wsdl")
public class EmployeeManagementService
    extends Service
{

    private final static URL EMPLOYEEMANAGEMENTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.ibm.achievement.service.EmployeeManagementService.class.getName());

    static {
        URL url = null;
        try {
            url = com.ibm.achievement.service.EmployeeManagementService.class.getResource("/WEB-INF/wsdl/EmployeeManagementService.wsdl");
            if (url == null) throw new MalformedURLException("/WEB-INF/wsdl/EmployeeManagementService.wsdl does not exist in the module.");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'WEB-INF/wsdl/EmployeeManagementService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        EMPLOYEEMANAGEMENTSERVICE_WSDL_LOCATION = url;
    }

    public EmployeeManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmployeeManagementService() {
        super(EMPLOYEEMANAGEMENTSERVICE_WSDL_LOCATION, new QName("http://service.achievement.ibm.com/", "EmployeeManagementService"));
    }

    /**
     * 
     * @return
     *     returns EmployeeManagement
     */
    @WebEndpoint(name = "EmployeeManagementPort")
    public EmployeeManagement getEmployeeManagementPort() {
        return super.getPort(new QName("http://service.achievement.ibm.com/", "EmployeeManagementPort"), EmployeeManagement.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmployeeManagement
     */
    @WebEndpoint(name = "EmployeeManagementPort")
    public EmployeeManagement getEmployeeManagementPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.achievement.ibm.com/", "EmployeeManagementPort"), EmployeeManagement.class, features);
    }

}
