package webservices;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class WelcomeWebService {
	private Stack<Integer> stack;
	private Queue<Integer> queue;
	
	public WelcomeWebService(){
		stack = new Stack<Integer>(); 
		queue = new LinkedList<Integer>();
	}
	
    @WebMethod
    public String msg(String input) {            
    	return input+" Welcome to Web Service ";
    }
    
    @WebMethod
    public String pushStack(Integer input) {
    	stack.push(input);
		return "Pushed : "+input;
    }
    
    @WebMethod
    public String popStack() {
    	Integer item = stack.pop();
		return "Popped : "+item;
    }
    
    @WebMethod
    public String enQueue(Integer input) {
    	queue.add(input);
		return "Enqueued : "+input;
    }
    
    @WebMethod
    public String deQueue() {
    	Integer item = queue.remove();
		return "Dequeued : "+item;
    }
    
}

