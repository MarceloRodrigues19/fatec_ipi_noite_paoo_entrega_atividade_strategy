package br.com.marcelo.strategy;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void UseWeapon() {
		System.out.println("shooting arrow with a bow");
		
	}

}
