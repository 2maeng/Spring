package test;

public class IPhone implements Phone {

	private Watch watch; // 의존관계를 가진 멤버변수
	private String name; // 의존관계를 가진 멤버변수 X
	
	public void setWatch(Watch watch) {
		this.watch = watch;
		System.out.println("setter 호출됨");
	}
	
	public void setName(String name) {
		this.name= name;
	}

	public IPhone() {
		System.out.println("생성자가 호출됨");
	}

	public void destroyMehtod() {
		System.out.println("객체 소멸할때에 호출될 메서드");
		// 보통 .close()와 같은 연결해제 코드가 작성되어 있음
	}

	@Override
	public void powerOn() {
		System.out.println("아이폰 켜짐");
	}
	
	@Override
	public void powerOff() {
		System.out.println("아이폰 꺼짐");
	}
	
	@Override
	public void volumeUP() {
		watch.volumeUP();
		System.out.println("name: " + name);
	}
	
	@Override
	public void volumeDown() {
		watch.volumeDown();
	}
}