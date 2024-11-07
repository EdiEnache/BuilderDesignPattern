package builder_v4;

//Clasa suplimentara pentru a creste complexitatea sistemului (folosita ca proprietate in clasa "Character")

public class Pet {
	private String name;
	private String race;
	private Skill skill;
	
	
	Pet(String name,String race,Skill skill){
		this.name = name;
		this.race = race;
		this.skill = skill;
	}
	@Override
	public String toString() {
	  return  "[ name = " + name + ", race = "+ race +  ", PetSkill : " + skill +" ]";
	}
}
