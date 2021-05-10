package jwspackage;

import javax.xml.ws.Endpoint; 

public class WebServiceServer {
    public static void main(String[] args) {
        String bindingURI = "http://localhost:9898/welcome_user";
        WelcomeWebService webService = new WelcomeWebService();
        Endpoint.publish(bindingURI, webService);
        System.out.println("Server started at: " + bindingURI);
    }
}

