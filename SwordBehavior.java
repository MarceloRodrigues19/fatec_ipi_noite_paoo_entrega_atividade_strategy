package br.com.marcelo.strategy;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void UseWeapon() {
		System.out.println("Swinging with a sword");
		
	}

}
