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
		System.out.println("Wrong argument!");
	}

	public void treatment(Cat cat) {
		System.out.println("I can treat cats.");
		}

	public void treatment(Dog dog) {
		System.out.println("I can treat dogs.");
	}

	@Override
	public String toString() {
		return "Veterinarian [name=" + name + ", getClass()=" + getClass() + "]";
	}
}