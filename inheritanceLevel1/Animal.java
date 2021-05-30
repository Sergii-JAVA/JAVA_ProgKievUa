package inheritanceLevel1;

abstract class Animal {

	private String ration;
	private String color;
	private int weight;

	public Animal(String ration, String color, int weight) {
		this.ration = ration;
		this.color = color;
		this.weight = weight;
	}

	public String getRation() {
		return ration;
	}

	public void setRation(String ration) {
		this.ration = ration;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	protected String getVoice() {
		String s1 = "VOICE_ANIMAL";
		return s1;
	}

	protected void eat() {
		System.out.print("EAT_ANIMAL");
	}

	protected void sleep() {
		System.out.print("SLEEP_ANIMAL");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Animal [ration=" + ration + ", color=" + color + ", weight=" + weight + "]";
	}

}
