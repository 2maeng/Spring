package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
	
		Champ champ = (Champ)factory.getBean("tm");
		
		champ.q();
		champ.w();
		champ.e();
		champ.r();
		champ.skillOn();
		champ.skillOff();
		
		Champ champ2 = (Champ)factory.getBean("a");
		
		champ2.q();
		champ2.w();
		champ2.e();
		champ2.r();
		champ2.skillOn();
		champ2.skillOff();
		
		factory.close();
	}
	
}
