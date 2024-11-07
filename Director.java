package builder_v4;

public class Director {
	
	
	//Clasa Director nu este obligatorie dar reduce din cantitatea de cod si  complexitatea din main() 

	private Builder builder;
	
	public Director(Builder builder) {		
		this.builder = builder;
	}
	
	public Character getCharacter() {		//functie pentru returnarea obiectului final
		return this.builder.build();
	}
	
	public void makeCompleteCharacter() {	//metoda care apeleaza toate metodele din builder
		this.builder.buildHealth();
		this.builder.buildArmor();
		this.builder.buildPet();
		this.builder.buildSkill();
		this.builder.buildWeapon();
	}
	
	public void makeEmptyCharacter() {		//metoda care nu apeleaza nimic, scop: posibilitatea de a personaliza obiectul rezultat
		
	}
	
	public void makeCharacterNoPet() {		//metoda care apeleaza partial metodele din builder, echivalent cu un constructor cu mai putini parametri
		this.builder.buildHealth();			//sau un constructor apelat cu valoarea "null" in spatiul rezervat pentru parametrul anulat
		this.builder.buildArmor();
		this.builder.buildSkill();
		this.builder.buildWeapon();
	}
}
