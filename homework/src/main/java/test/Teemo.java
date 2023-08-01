package test;

public class Teemo implements Champ{
	
	private Weapon weapon;
	
	public Teemo() {
		System.out.println("티모 대위");
	}
	
	public Teemo(Weapon weapon) {
		this.weapon = weapon;
		System.out.println("티모 무기 대위");
	}
	
	public void q() {
		System.out.println("q평");
	}
	
	public void w() {
		System.out.println("w평");
	}
	
	public void e() {
		System.out.println("e평");
	}
	
	public void r() {
		System.out.println("r평");
	}
	
	public void skillOn() {
		weapon.skillOn();
	}
	
	public void skillOff() {
		weapon.skillOff();
	}
	
	
}
