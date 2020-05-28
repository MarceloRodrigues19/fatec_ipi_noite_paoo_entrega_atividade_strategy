package br.com.marcelo.strategy;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void UseWeapon() {
		System.out.println("Chopping with a axe");
		
	}

}
