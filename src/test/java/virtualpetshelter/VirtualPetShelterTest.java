package virtualpetshelter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetShelterTest {
	// [X]include appropriate instance variable(s) to store the pets who reside at
	// the shelter
	// [X]include methods that:
	// [X]return a Collection of all of the pets in the shelter
	// [X]return a specific VirtualPet given its name
	// [X]allow intake of a homeless pet
	// [X]allow adoption of a homeless pet
	// []feed all of the pets in the shelter
	// []water all of the pets in the shelter
	// []plays (or performs some other interaction(s)) with an individual pet in the
	// shelter
	// []include a tick method that calls the tick method for each of the pets in
	// the shelter, updating their needs

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
		int check = underTest.showPetsSize();
		Assert.assertSame(1, check);
	}

	@Test
	public void shouldGetPetByName() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet = new VirtualPet("Lassie", "description", 0, 0, 0, 0);
		underTest.addPet(pet);
		VirtualPet petTested = underTest.getPetByName("Lassie");
		Assert.assertSame(pet, petTested);
	}

	@Test
	public void ShouldShowPetsSize() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet = new VirtualPet("Lassie", "description", 0, 0, 0, 0);
		underTest.addPet(pet);
		VirtualPet pet2 = new VirtualPet("Fido", "description", 0, 0, 0, 0);
		underTest.addPet(pet2);
		int check = underTest.showPetsSize();
		Assert.assertSame(2, check);
	}

	@Test
	public void shouldAdoptPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		String petName = "Lassie";
		VirtualPet pet = new VirtualPet(petName, "description", 0, 0, 0, 0);
		underTest.addPet(pet);
		underTest.adoptPet(petName);
		VirtualPet retrieved = underTest.getPetByName(petName);
		assertEquals(null, retrieved);
	}

}
