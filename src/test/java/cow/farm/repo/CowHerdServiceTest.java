package cow.farm.repo;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class CowHerdServiceTest {

	@Test
	public void shouldAddCowToListAndReturnHashMapByBreed() {
		// given
		CowHerdService cowService = new CowHerdService();
		cowService.addCow(new TestCowBuilder().withBreed(Cow.Breed.ABONDANCE).build());
		cowService.addCow(new TestCowBuilder().withBreed(Cow.Breed.ABONDANCE).build());
		cowService.addCow(new TestCowBuilder().withBreed(Cow.Breed.RANDALL).build());
		cowService.addCow(new TestCowBuilder().withBreed(Cow.Breed.REDPOOL).build());
		cowService.addCow(new TestCowBuilder().withBreed(Cow.Breed.ANGUS).build());
		// when
		Map breedQuantity = cowService.getHerdQuantityByBreed();
		// then
		Assert.assertEquals(breedQuantity.get(Cow.Breed.ANGUS), 1);
		Assert.assertEquals(breedQuantity.get(Cow.Breed.ABONDANCE), 2);
		Assert.assertEquals(breedQuantity.get(Cow.Breed.RANDALL), 1);
		Assert.assertEquals(breedQuantity.get(Cow.Breed.REDPOOL), 1);
	}

	@Test
	public void shouldAddCowToListAndReturnHashMapByName() {
		// given
		CowHerdService cowService = new CowHerdService();
		cowService.addCow(new TestCowBuilder().withName("Name1").build());
		cowService.addCow(new TestCowBuilder().withName("Name1").build());
		cowService.addCow(new TestCowBuilder().withName("Name2").build());
		cowService.addCow(new TestCowBuilder().withName("Name3").build());
		cowService.addCow(new TestCowBuilder().withName("Name4").build());
		// when
		Map breedQuantity = cowService.getHerdQuantityByName();
		// then
		Assert.assertEquals(breedQuantity.get("Name1"), 2);
		Assert.assertEquals(breedQuantity.get("Name2"), 1);
		Assert.assertEquals(breedQuantity.get("Name3"), 1);
		Assert.assertEquals(breedQuantity.get("Name4"), 1);
	}

	@Test
	public void shouldAddCowToListAndReturnHashMapByWeight() {
		// given
		CowHerdService cowService = new CowHerdService();
		cowService.addCow(new TestCowBuilder().withWeight(100).build());
		cowService.addCow(new TestCowBuilder().withWeight(100).build());
		cowService.addCow(new TestCowBuilder().withWeight(150).build());
		cowService.addCow(new TestCowBuilder().withWeight(200).build());
		cowService.addCow(new TestCowBuilder().withWeight(250).build());
		// when
		Map breedQuantity = cowService.getHerdQuantityByWeight();
		// then
		Assert.assertEquals(breedQuantity.get(100), 2);
		Assert.assertEquals(breedQuantity.get(150), 1);
		Assert.assertEquals(breedQuantity.get(200), 1);
		Assert.assertEquals(breedQuantity.get(250), 1);
	}

	@Test
	public void shouldAddCowToListAndReturnHashMapByColor() {
		// given
		CowHerdService cowService = new CowHerdService();
		cowService.addCow(new TestCowBuilder().withColor(Cow.Color.BROWN).build());
		cowService.addCow(new TestCowBuilder().withColor(Cow.Color.STRIPED).build());
		cowService.addCow(new TestCowBuilder().withColor(Cow.Color.STRIPED).build());
		cowService.addCow(new TestCowBuilder().withColor(Cow.Color.BROWN).build());
		cowService.addCow(new TestCowBuilder().withColor(Cow.Color.BLACK).build());
		// when
		Map breedQuantity = cowService.getHerdQuantityByColor();
		// then
		Assert.assertEquals(breedQuantity.get(Cow.Color.BROWN), 2);
		Assert.assertEquals(breedQuantity.get(Cow.Color.STRIPED), 2);
		Assert.assertEquals(breedQuantity.get(Cow.Color.BLACK), 1);
	}
}
