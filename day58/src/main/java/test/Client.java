package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
//		BeanFactory bf = new BeanFactory();
//		Phone phone = (Phone)bf.getBean(args[0]);
//		phone.powerOn();
		
//		phone.volumeUP();
//		phone.volumeDown();
		
		// Spring 컨테이너가 동작할 수 있도록 해야함
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		Phone phone = (Phone)factory.getBean("gp"); // LookUp(룩업) == 객체를 이름으로 찾는 행위
		
		phone.powerOn();
		phone.volumeUP();
		phone.volumeDown();
		
//		TestBean tb = (TestBean)factory.getBean("tb");
//		List<String> list = tb.getTestList();
//		
//		for(String data : list) {
//			System.out.println(data);
//		}
		
		factory.close();
	}
}
