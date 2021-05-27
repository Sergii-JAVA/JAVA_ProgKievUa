/**
 * 
 */
package inheritanceLevel1;

/**
 * @author Serg_
 *
 */
public class Veterinarian {
	private String name;

	
	
	/**
	 * @param name
	 */
	public Veterinarian(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void treatment(Animal animal) {
		if(animal instanceof Dog) {
			System.out.println("I can treat dogs.");
		} else if(animal instanceof Cat){
			System.out.println("I can treat cats.");
		} else {
			System.out.println("Wrong argument!");
		}
	}

	@Override
	public String toString() {
		return "Veterinarian [name=" + name + ", getClass()=" + getClass() + "]";
	}
}