package bing.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import bing.server.IHelloService;

/**
 * <p>
 * WebService调用方-客户端
 * </p>
 * 
 * @author IceWee
 * @date 2012-7-6
 * @version 1.0
 */
public class HelloServiceClient {

	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext-client.xml");
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
				"file:/Users/pud/git/cxf/cxf-test/src/main/webapp/WEB-INF/spring/root-context.xml");
		IHelloService helloService = (IHelloService) context.getBean("client");
		String response = helloService.sayHello("Peter");
		System.out.println(response);
	}

}