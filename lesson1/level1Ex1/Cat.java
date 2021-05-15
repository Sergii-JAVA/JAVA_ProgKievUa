package level1Ex1;

public class Cat {
	private String color;
	private int age;
	private String state;
	private String breed;
		
	/**
	 * Создание прототипа кошки
	 */
	public Cat() {
		super();
	}

	/**
	 * Создание кошки с необходимыми параметрами
	 * @param color
	 * @param age
	 * @param state
	 */
	public Cat(String color, int age, String state, String breed) {
		super();
		this.color = color;
		this.age = age;
		this.state = state;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + ", age=" + age + ", state=" + state + ", breed=" + breed + "]";
	}
	


	
	
}
