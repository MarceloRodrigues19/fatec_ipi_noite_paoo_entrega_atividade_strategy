package br.com.marcelo.strategy;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void UseWeapon() {
		System.out.println("Cutting with a knife");
		
	}

}
