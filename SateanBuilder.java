package builder_v4;

	//Clasa aceasta este un Concrete Builder pentru interfata Builder. 
	//Contine "reteta" pentru a crea un caracter cu valori standard ( in acest caz un satean)

public class SateanBuilder implements Builder{

	Character character;
	
	SateanBuilder(){
		character = new Character();	//de fiecare data cand un builder va fi creat, se va apela constructorul fara argumente de la clasa "Character"
	}
	
	
	//Ne folosim de settere pentru a impune anumite valori standard
	
	@Override
	public void buildHealth() {
		character.setHealth(80);	
		
	}

	@Override
	public void buildArmor() {
		character.setArmor(100);
		
	}

	@Override
	public void buildSkill() {
		character.setSkill(new Skill("fermier",false));
		
	}

	@Override
	public void buildPet() {
		character.setPet(new Pet("Lupu","Ciobanez German",new Skill("protectie",true)));
		
	}

	@Override
	public void buildWeapon() {
		character.setWeapon(new Weapon("lopata",30));
		
	}
	
	//functie care returneaza obiectul construit 

	@Override
	public Character build() {
		return this.character;
	}

}
