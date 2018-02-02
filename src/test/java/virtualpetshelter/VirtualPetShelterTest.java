package virtualpetshelter;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;



public class VirtualPetShelterTest {
	//include appropriate instance variable(s) to store the pets who reside at the shelter
	//include methods that:
		//return a Collection of all of the pets in the shelter
		//return a specific VirtualPet given its name
		//allow intake of a homeless pet
		//allow adoption of a homeless pet
		//feed all of the pets in the shelter
		//water all of the pets in the shelter
		//plays (or performs some other interaction(s)) with an individual pet in the shelter
		//include a tick method that calls the tick method for each of the pets in the shelter, updating their needs

	@Test
	public void shouldInitiateVirtualPetShelter() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		assertNotNull(underTest);
	}
	@Test
	public void ShouldAddPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet = new VirtualPet("Lassie", "description", 0, 0, 0, 0);
		underTest.addPet(pet);
		VirtualPet petTested = underTest.getPetByName("Lassie");
		Assert.assertSame(pet, petTested);
	}
}
