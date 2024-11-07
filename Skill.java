package builder_v4;

//Clasa suplimentara pentru a creste complexitatea sistemului (folosita ca proprietate in clasa "Character")

public class Skill {

	private String ocupation;
	private boolean agresivity;
	
	Skill(String ocupation,boolean agresivity)
	{
		this.agresivity=agresivity;
		this.ocupation=ocupation;
	}
	@Override
	public String toString() {
	  return  "[ " + ocupation + ", agresivity = "+ agresivity + " ]";
	}
}
