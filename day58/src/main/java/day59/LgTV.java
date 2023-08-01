package day59;

import org.springframework.stereotype.Component;

@Component("lTV")
public class LgTV implements TV {
	
	private Remote remote;
	
	@Override
	public void funcA() {
		remote.funcA();
		System.out.println("LG TV 전원 ON OFF");
		
	}

	@Override
	public void funcB() {
		remote.funcB();
		System.out.println("LG TV 음량");
		
	}

}
