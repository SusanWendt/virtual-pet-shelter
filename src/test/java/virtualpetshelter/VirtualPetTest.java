package virtualpetshelter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldGetHunger() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 0, 0, 0);
		int hunger = underTest.getHunger();
		assertEquals(1, hunger);
	}

	@Test
	public void shouldGetThirst() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 1, 0, 0);
		int thirst = underTest.getThirst();
		assertEquals(1, thirst);
	}

	@Test
	public void shouldGetBathroom() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 1, 0);
		int bathroom = underTest.getBathroom();
		assertEquals(1, bathroom);
	}

	@Test
	public void shouldGetEnergy() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 0, 1);
		int energy = underTest.getEnergy();
		assertEquals(1, energy);
	}

	@Test //fails
	public void shouldGetStatus() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 0, 0);
		String status = underTest.getStatus();
		assertEquals(null, status);
	}

	@Test 
	public void shouldShowVirtualPet() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 0, 0);
		String asString = underTest.toString();
		assertEquals("name: name, description: description, hunger: 0, thirst: 0, bathroom: 0, energy: 0", asString);
	}

	@Test
	public void shouldDecreaseHungerBy1() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 0, 0, 0);
		underTest.feed();
		int hunger = underTest.getHunger();
		assertEquals(0, hunger);
	}

	@Test
	public void shouldDecreaseThirstBy1() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 1, 0, 0);
		underTest.water();
		int thirst = underTest.getThirst();
		assertEquals(0, thirst);
	}

	@Test
	public void shouldDecreaseBathroomBy1() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 1, 0);
		underTest.letOut();
		int bathroom = underTest.getBathroom();
		assertEquals(0, bathroom);
	}

	@Test
	public void shouldDecreaseEnergyBy1() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 0, 1);
		underTest.play();
		int energy = underTest.getEnergy();
		assertEquals(0, energy);
	}

	@Test
	public void shouldDetermineStatusAmazing() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 0, 0);
		underTest.determineStatus();
		String status = underTest.getStatus();
		assertEquals("Amazing", status);
	}

	@Test
	public void shouldDetermineStatusGreat() {
		VirtualPet underTest = new VirtualPet("name", "description", 10, 10, 10, 10);
		underTest.determineStatus();
		String status = underTest.getStatus();
		assertEquals("Great", status);
	}

	@Test
	public void shouldDetermineStatusGood() {
		VirtualPet underTest = new VirtualPet("name", "description", 20, 20, 20, 20);
		underTest.determineStatus();
		String status = underTest.getStatus();
		assertEquals("Good", status);
	}

	@Test
	public void shouldDetermineStatusContent() {
		VirtualPet underTest = new VirtualPet("name", "description");
		underTest.determineStatus();
		String status = underTest.getStatus();
		assertEquals("Content", status);
	}

	@Test
	public void shouldDetermineStatusOkay() {
		VirtualPet underTest = new VirtualPet("name", "description", 40, 40, 40, 40);
		underTest.determineStatus();
		String status = underTest.getStatus();
		assertEquals("Okay", status);

	}

	@Test
	public void shouldDetermineStatusBad() {
		VirtualPet underTest = new VirtualPet("name", "description", 45, 45, 45, 45);
		underTest.determineStatus();
		String status = underTest.getStatus();
		assertEquals("Bad", status);
	}

	@Test
	public void shouldDetermineStatus() {
		VirtualPet underTest = new VirtualPet("name", "description", 50, 50, 50, 50);
		underTest.determineStatus();
		String status = underTest.getStatus();
		assertEquals("Dead", status);
	}

	@Test
	public void shouldTick() {
		VirtualPet underTest = new VirtualPet("name", "description", 10, 10, 10, 10);
		underTest.tick();
		String check = underTest.toString();
		assertEquals("name: name, description: description, hunger: 15, thirst: 15, bathroom: 15, energy: 15", check);
	}
}
