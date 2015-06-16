package cow.farm.repo;

public class TestCowBuilder {
	private String name = "krasula";
	private Cow.Breed breed = Cow.Breed.ABONDANCE;
	private int weight = 500;
	private Cow.Color color = Cow.Color.BLACK;

	public TestCowBuilder() {
	}

	public TestCowBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public TestCowBuilder withBreed(Cow.Breed breed) {
		this.breed = breed;
		return this;
	}

	public TestCowBuilder withWeight(int weight) {
		this.weight = weight;
		return this;
	}

	public TestCowBuilder withColor(Cow.Color color) {
		this.color = color;
		return this;
	}


	public Cow build() {
		return new Cow(name, breed, weight, color);
	}


}
