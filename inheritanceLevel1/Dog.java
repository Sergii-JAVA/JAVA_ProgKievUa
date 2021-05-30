/**
 * 
 */
package inheritanceLevel1;

/**
 * @author Serg_
 *
 */
public class Dog extends Animal {

	String name;

	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
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

	@Override
	protected String getVoice() {
		// TODO Auto-generated method stub
		return super.getVoice() + " -> VOICE_Dog";
	}

	@Override
	protected void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println(" -> EAT_Dog");
	}

	@Override
	protected void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
		System.out.println(" -> SLEEP_Dog");
	}

	@Override
	public String toString() {
		return "Animal->Dog: [ration=" + getRation() + ", color=" + getColor() + ", weight=" + getWeight() + ", name="
				+ name + "]";
	}

}
