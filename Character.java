package br.com.marcelo.strategy;

public abstract class Character {
	WeaponBehavior weapon;
	
	
	public void fight() {
		System.out.println("Character Fighting\n");
	}
	
	public Character (WeaponBehavior w) {
		this.weapon = w;	
	}
	
	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}
	
	public WeaponBehavior getWeapon() {
		return weapon;
	}
	

	
}