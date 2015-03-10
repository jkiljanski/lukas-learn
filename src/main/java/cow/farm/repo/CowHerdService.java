package cow.farm.repo;


import cow.farm.utils.QuantityCheckingList;

public class CowHerdService {

	QuantityCheckingList<Cow> cowList = new QuantityCheckingList<>();

	public makeCow(String race) {
		Cow cow = new Cow();
		cow.setRace(race);
	}
}
