package builder_v4;

public class Test_Builder_v4 {

	public static void main(String[] args) {
		
		
		//bucata aceasta de cod va genera si afisa un obiect de tipul "Character" ce va avea proprietatile definite de "SateanBuilder"
		
		Builder sateanBuilder = new SateanBuilder();	
		
		Director directorSatean = new Director(sateanBuilder);
		
		directorSatean.makeCompleteCharacter(); // Am ales metoda "makeCompleteCharacter()" pentru a asocia toate propritatile din "SateanBuilder" 

		System.out.println(directorSatean.getCharacter());
		
		
		
		
		// Codul de mai jos va genera si afisa un obiect de tipul "Character" ce va avea proprietatile definite de "RazboinicBuilder"
		
		Builder razboinicBuilder = new RazboinicBuilder();
		
		Director directorRazboinic = new Director(razboinicBuilder);
		
		directorRazboinic.makeCompleteCharacter(); // Am ales metoda "makeCompleteCharacter()" pentru a asocia toate propritatile din "RazboinicBuilder" 
		
		System.out.println(directorRazboinic.getCharacter());
		
		
		
		// Codul de mai jos va genera si afisa un obiect de tipul "Character" gol, fiind mai apoi posibila setarea proprietatilor prin settere
	
		Builder emptyBuilder = new RazboinicBuilder();
		
		Director directorEmpty = new Director(emptyBuilder);
		
		directorEmpty.makeEmptyCharacter(); //Am ales metoda "makeEmptyCharacter()" pentru nu a asocia nicio proprietate prin Builder. In felul acesta 
										    //campurile obiectului raman goale si dezvoltatorul poate crea un obiect "Character" personalizat de la 0
		
		Character PersonalCharacter = directorEmpty.getCharacter();
		
		PersonalCharacter.setArmor(1000);
		PersonalCharacter.setHealth(9999);
		
		System.out.println(PersonalCharacter);
		
		
		// Codul de mai jos va genera in aceeasi maniera un obiect dar va folosi metoda "makeCharacterNoPet()" din Director.
		//Pentru cazul in care nu vrem ca toate proprietatile sa fie definite la constructie
		
		Builder incompleteBuilder = new SateanBuilder();
		
		Director directorIncomplete = new Director(incompleteBuilder);
		
		directorIncomplete.makeCharacterNoPet();

		System.out.println(directorIncomplete.getCharacter());
		
		
		
	}

}
