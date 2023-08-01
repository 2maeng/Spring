package test;

public class IceBreak implements Weapon{
	
	public IceBreak() {
		System.out.println("만년서리 아이템");
	}
	
	public void skillOn() {
		System.out.println("만년서리 사용!");
	}
	
	public void skillOff() {
		System.out.println("만년서리 끝!");
	}
}
