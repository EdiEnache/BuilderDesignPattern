package builder_v4;

// Clasa aceasta este un Concrete Builder pentru interfata Builder.
// Contine "reteta" pentru a crea un caracter cu valori standard ( in acest caz un razboinic)

public class RazboinicBuilder implements Builder{

	Character character;
	
	
	RazboinicBuilder(){
			character = new Character();
	}
	
	
	@Override
	public void buildHealth() {
		character.setHealth(100);
		
	}

	@Override
	public void buildArmor() {
		character.setArmor(100);
		
	}

	@Override
	public void buildSkill() {
		character.setSkill(new Skill("arcas",true));
		
	}

	@Override
	public void buildPet() {
		character.setPet(new Pet("Murgu","Cal",new Skill("calatorie rapida",false)));
		
	}

	@Override
	public void buildWeapon() {
		character.setWeapon(new Weapon("arc",95));
		
	}

	@Override
	public Character build() {
		return this.character;
	}

}
