package builder_v4;

public class Character implements CharacterPlan{

	
	//Clasa "Character" este clasa pe care vrem sa o construim cu ajutorul Builderului.
	//Ne-am imaginat acest program ca un algoritm de implementare pentru personaje din jocuri video.
	//Se poate observa lipsa constructorului.
	
	
	private int health;
	private int armor;
	private Skill skill;
	private Pet pet;
	private Weapon weapon;
	
	
	
	
	@Override
	public void setHealth(int health) {
		this.health = health;
		
	}
	@Override
	public void setArmor(int armor) {
		this.armor = armor;
		
	}
	@Override
	public void setSkill(Skill skill) {
		this.skill = skill;
		
	}
	@Override
	public void setPet(Pet pet) {
		this.pet = pet;
		
	}
	@Override
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
		
	}
	
	//Override la metoda "toString() pentru a usura afisarea obiectelor
	
	@Override
	public String toString() {
		  return getClass().getSimpleName() + "\n{"+"\nHealth : " + health + ";\nArmor : " + armor + ";\nSkill : " + skill + ";\nPet : " + pet +"\nWeapon : "+ weapon + "\n}\n\n";
		}

}
