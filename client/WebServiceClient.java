package jwspackage;

public class WebServiceClient {
    public static void main(String[] args) {
        WelcomeWebServiceService client=new WelcomeWebServiceService();
        WelcomeWebService msg_service = client.getWelcomeWebServicePort();
        String reply = msg_service.msg("Hi Joel!");
        System.out.println(reply);
        
        System.out.println("----------Stack Example-----------");
        reply = msg_service.pushStack(1);
        System.out.println(reply);
        
        reply = msg_service.pushStack(2);
        System.out.println(reply);
        
        reply = msg_service.pushStack(3);
        System.out.println(reply);
        
        reply = msg_service.popStack();
        System.out.println(reply);
        
        reply = msg_service.popStack();
        System.out.println(reply);
        
        reply = msg_service.popStack();
        System.out.println(reply);
        
        System.out.println("----------Queue Example-----------");
        reply = msg_service.enQueue(1);
        System.out.println(reply);
        
        reply = msg_service.enQueue(2);
        System.out.println(reply);
        
        reply = msg_service.enQueue(3);
        System.out.println(reply);
        
        reply = msg_service.deQueue();
        System.out.println(reply);
        
        reply = msg_service.deQueue();
        System.out.println(reply);
        
        reply = msg_service.deQueue();
        System.out.println(reply);
    }
}
