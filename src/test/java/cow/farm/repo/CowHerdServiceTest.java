package cow.farm.repo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class CowHerdServiceTest {

	@Test
	public void shouldAddCowToListAndReturnHashMap() {
		// given
		CowHerdService cowService = new CowHerdService();
		cowService.addCow(new CowBuilder().build());
		// when
		Map breedQuantity = cow.getHerdMap();
		// then
		Assert.assertEquals(breedQuantity.get(Cow.Breed.ANGUS), 2);
		Assert.assertEquals(breedQuantity.get(Cow.Breed.ABONDANCE), 1);
		Assert.assertEquals(breedQuantity.get(Cow.Breed.RANDALL), 1);
		Assert.assertEquals(breedQuantity.get(Cow.Breed.REDPOOL), 1);
	}
}
