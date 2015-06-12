package cow.farm.repo;

public class CowBuilder {
	String name = "krasula";
	Cow.Breed breed = Cow.Breed.ABONDANCE;
	int weight = 500;
	Cow.Color color = Cow.Color.BLACK;

	public CowBuilder() {
	}

	public CowBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public CowBuilder withBreed(Cow.Breed breed) {
		this.breed = breed;
		return this;
	}

	public CowBuilder withWeight(int weight) {
		this.weight = weight;
		return this;
	}

	public CowBuilder withColor(Cow.Color color) {
		this.color = color;
		return this;
	}


	public Cow build() {
		return new Cow(name, breed, weight, color);
	}


}
