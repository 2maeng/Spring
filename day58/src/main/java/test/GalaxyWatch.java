package test;

import org.springframework.stereotype.Component;

@Component("gw")
public class GalaxyWatch implements Watch{

	public GalaxyWatch() {
		System.out.println("갤럭시 워치 객체 생성됨");
	}

	public void volumeUP() {
		System.out.println("갤럭시 워치로 음량 ++");
	}

	public void volumeDown() {
		System.out.println("갤럭시 워치로 음량 --");
	}
}
