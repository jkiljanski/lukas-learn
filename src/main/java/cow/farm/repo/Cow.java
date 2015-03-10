package cow.farm.repo;


public class Cow {

	String race;

	public Cow() {
		race = null;
	}

	public Cow(String race) {
		this.race = race;
	}

	public  String setRace(String race){
		this.race = race;
	}

	public String getRace(){
		return race;
	}
}
