package test;

public class Ari implements Champ{
	
	private Weapon weapon;
	
	public Ari() {
		System.out.println("아리 생성자가 호출됨");
	}
	
	public Ari(Weapon weapon) {
		this.weapon = weapon;
		System.out.println("아리 무기 등장~~");
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
