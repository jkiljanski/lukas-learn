package cow.farm.repo;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class CowHerdServiceTest {

	@Test
	public void shouldAddCowToListAndReturnHashMap() {
		// given
		CowHerdService cowService = new CowHerdService();
		cowService.addCow(new CowBuilder().withBreed(Cow.Breed.ABONDANCE).build());
		cowService.addCow(new CowBuilder().withBreed(Cow.Breed.ABONDANCE).build());
		cowService.addCow(new CowBuilder().withBreed(Cow.Breed.RANDALL).build());
		cowService.addCow(new CowBuilder().withBreed(Cow.Breed.REDPOOL).build());
		cowService.addCow(new CowBuilder().withBreed(Cow.Breed.ANGUS).build());
		// when
		Map breedQuantity = cowService.getHerdQuantityByBreed();
		// then
		Assert.assertEquals(breedQuantity.get(Cow.Breed.ANGUS), 1);
		Assert.assertEquals(breedQuantity.get(Cow.Breed.ABONDANCE), 2);
		Assert.assertEquals(breedQuantity.get(Cow.Breed.RANDALL), 1);
		Assert.assertEquals(breedQuantity.get(Cow.Breed.REDPOOL), 1);
	}
}
