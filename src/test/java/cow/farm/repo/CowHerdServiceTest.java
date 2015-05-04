package cow.farm.repo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class CowHerdServiceTest {

	@Test
	public void shouldAddCowToListAndReturnHashMap() {
		// given
		CowHerdService cow = new CowHerdService();
		cow.makeCow(Cow.Breed.ANGUS);
		cow.makeCow(Cow.Breed.ANGUS);
		cow.makeCow(Cow.Breed.RANDALL);
		cow.makeCow(Cow.Breed.ABONDANCE);
		cow.makeCow(Cow.Breed.REDPOOL);
		// when
		Map breedQuantity = cow.getHerdMap();
		// then
		Assert.assertEquals(breedQuantity.get(Cow.Breed.ANGUS), 2);
		Assert.assertEquals(breedQuantity.get(Cow.Breed.ABONDANCE), 1);
		Assert.assertEquals(breedQuantity.get(Cow.Breed.RANDALL), 1);
		Assert.assertEquals(breedQuantity.get(Cow.Breed.REDPOOL), 1);
	}
}
