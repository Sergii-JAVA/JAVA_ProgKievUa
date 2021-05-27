package inheritanceLevel1;

public class Main {

	public static void main(String[] args) {
//		Animal a1 = new Animal();	// check Animal abstract...
		
		// Check Cat
		Cat cat1 = new Cat("Meet", "Black", 3, "Bull");
		System.out.println(cat1.toString());
		System.out.println(cat1.getVoice());
		cat1.eat();
		cat1.sleep();
		
		System.out.println();

		// Check Dog
		Dog dog1 = new Dog("BIGMeet", "White", 2, "Dollar");
		System.out.println(dog1.toString());
		System.out.println(dog1.getVoice());
		dog1.eat();
		dog1.sleep();
		
		System.out.println();
		
		// Check Frog
		Frog frog1 = new Frog("Insects", "Green", 1, "NaN");
		System.out.println(frog1.toString());
		System.out.println(frog1.getVoice());
		frog1.eat();
		frog1.sleep();
		
		System.out.println();
		
		// Check Veterinarian
		Veterinarian vet1 = new Veterinarian("Veterinarian");
		System.out.println(vet1.toString());
		vet1.treatment(dog1);
		vet1.treatment(cat1);
		vet1.treatment(frog1);
	}

}
