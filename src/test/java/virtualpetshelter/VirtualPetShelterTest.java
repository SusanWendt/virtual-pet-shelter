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
	// [X]feed all of the pets in the shelter
	// [X]water all of the pets in the shelter
	// [X]plays (or performs other method with an individual pet in the shelter
	// [X]include a tick method that calls the tick method for each of the pets in
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

	@Test
	public void shouldFeedPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Lassie", "description", 10, 0, 0, 0);
		underTest.addPet(pet1);
		VirtualPet pet2 = new VirtualPet("Fido", "description", 15, 0, 0, 0);
		underTest.addPet(pet2);
		underTest.feedAllPets();
		assertEquals(0, pet1.getHunger());
		assertEquals(5, pet2.getHunger());
	}

	@Test
	public void shouldWaterAllPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Pippy", "dog", 0, 14, 0, 0);
		underTest.addPet(pet1);
		VirtualPet pet2 = new VirtualPet("Fido", "puppy", 0, 26, 0, 0);
		underTest.addPet(pet2);
		underTest.waterAllPets();
		assertEquals(4, pet1.getThirst());
		assertEquals(16, pet2.getThirst());
	}

	@Test
	public void shouldLetOutAllPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Pippy", "dog", 0, 0, 10, 0);
		underTest.addPet(pet1);
		VirtualPet pet2 = new VirtualPet("Fido", "puppy", 0, 0, 10, 0);
		underTest.addPet(pet2);
		underTest.letOutAllPets();
		assertEquals(0, pet1.getBathroom());
		assertEquals(0, pet2.getBathroom());
	}

	@Test
	public void shouldPlayWithAllPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Pippy", "dog", 0, 0, 0, 10);
		underTest.addPet(pet1);
		VirtualPet pet2 = new VirtualPet("Fido", "puppy", 0, 0, 0, 10);
		underTest.addPet(pet2);
		underTest.playWithAllPets();
		assertEquals(0, pet1.getEnergy());
		assertEquals(0, pet2.getEnergy());
	}

	@Test
	public void shouldTickAllPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Pippy", "dog", 0, 15, 0, 0);
		underTest.addPet(pet1);
		VirtualPet pet2 = new VirtualPet("Fido", "puppy", 0, 25, 0, 0);
		underTest.addPet(pet2);
		underTest.tickAllPets();
		assertEquals(20, pet1.getThirst());
		assertEquals(30, pet2.getThirst());
	}

	@Test
	public void shouldPlayWithOnePet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Pippy", "dog", 0, 0, 0, 30);
		underTest.addPet(pet1);
		VirtualPet pet2 = new VirtualPet("Fido", "puppy", 0, 0, 0, 40);
		underTest.addPet(pet2);
		underTest.playWithPetByName("Pippy");
		assertEquals(15, pet1.getEnergy());
		assertEquals(40, pet2.getEnergy());
	}

}
