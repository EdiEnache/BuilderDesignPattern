package builder_v4;


//interfata care asigura prezenta setterelor in clasa "Character"

public interface CharacterPlan {
	public void setHealth(int health);
	public void setArmor(int Armor);
	public void setSkill(Skill skill);
	public void setPet(Pet pet);
	public void setWeapon(Weapon weapon);
}
