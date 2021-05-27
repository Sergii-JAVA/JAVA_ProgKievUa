package inheritanceLevel1;

public class Cat extends Animal {
	/**
	 * @param name
	 */
	String name;
	
	public Cat(String ration, String color, int weight, String name) {
		super();
		Cat.super.setRation(ration);
		Cat.super.setColor(color);
		Cat.super.setWeight(weight);
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
		return super.getVoice() + " -> VOICE_CAT";
	}

	@Override
	protected void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println(" -> EAT_CAT");
	}

	@Override
	protected void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
		System.out.println(" -> SLEEP_CAT");
	}

	@Override
	public String toString() {
		return "Animal->Cat: [ration=" + getRation() + ", color=" + getColor() +
				", weight=" + getWeight() + ", name=" + name + "]";
	}
}