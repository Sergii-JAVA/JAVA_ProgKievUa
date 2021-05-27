/**
 * 
 */
package inheritanceLevel1;

/**
 * @author Serg_
 *
 */
public class Frog extends Animal {
	String name;

	public Frog(String ration, String color, int weight, String name) {
		super();
		Frog.super.setRation(ration);
		Frog.super.setColor(color);
		Frog.super.setWeight(weight);
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
		return super.getVoice() + " -> VOICE_Frog";
	}

	@Override
	protected void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println(" -> EAT_Frog");
	}

	@Override
	protected void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
		System.out.println(" -> SLEEP_Frog");
	}

	@Override
	public String toString() {
		return "Animal->Frog: [ration=" + getRation() + ", color=" + getColor() + ", weight=" + getWeight() + ", name="
				+ name + "]";
	}
}
