package builder_v4;

//Interfata Builder pentru a asigura prezenta metodelor necesare in clasele derivate

public interface Builder {

	public void buildHealth();
	public void buildArmor();
	public void buildSkill();
	public void buildPet();
	public void buildWeapon();
	public Character build();
}
