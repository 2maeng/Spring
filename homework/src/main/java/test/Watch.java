package test;

public class Watch implements Weapon{
	public Watch() {
		System.out.println("존야 아이템");
	}
	
	public void skillOn() {
		System.out.println("존야 사용!");
	}
	
	public void skillOff() {
		System.out.println("존야 끝!");
	}
}
