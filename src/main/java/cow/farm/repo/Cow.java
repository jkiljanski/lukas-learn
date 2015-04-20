package cow.farm.repo;


public class Cow {

	final enum race;

	public enum CowRace {black, white, stripes, brown};

	public Cow() {
		race = null;
	}

	public Cow(CowRace race) {
		this.race = race;
	}

	public  CowRace setRace(CowRace race){
		this.race = race;
	}
}
