package builder_v4;

//Clasa suplimentara pentru a creste complexitatea sistemului (folosita ca proprietate in clasa "Character")

public class Weapon {
	
	private String type;
	private int sharpness;
	
	Weapon(String type, int sharpness){
		this.type=type;
		this.sharpness=sharpness;
	}
	@Override
	public String toString() {
	  return  "[ type = " + type + ", sharpness = "+ sharpness + " ]";
	}
}
