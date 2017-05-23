package edu.bjtu.invoker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InvokerClient {
	public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("invoker-client.xml");
        IHelloService service = 
            (IHelloService) context.getBean("helloServiceProxy");
        System.out.println(service.doHelloService("qwerty"));
    }
}
