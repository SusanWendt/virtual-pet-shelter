package virtualpetshelter;

public class VirtualPet {

	// instance data
	private int hunger;
	private int thirst;
	private int bathroom;
	private int energy;
	private String status;
	private String name;
	private String description;

	// constructor 1
	public VirtualPet(String name, String description, int hunger, int thirst, int bathroom, int energy) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.bathroom = bathroom;
		this.energy = energy;

	}

	// constructor 2
	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
		this.hunger = 25;
		this.thirst = 25;
		this.bathroom = 25;
		this.energy = 25;

	}

	// getter for constructor2: name and description
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
//	@Override
//	public String toString() {
//		return "name: " + name + ", description: " + description;
//	}
	
	// accessor aka getters for constructor1
	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBathroom() {
		return bathroom;
	}

	public int getEnergy() {
		return energy;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "name: " + name + ", description: " + description + ", hunger: " + hunger + ", thirst: " + thirst + ", bathroom: " + bathroom + ", energy: " + energy;
	}

	// modifier Method
	public void feed() {
		if (hunger < 0) {
			hunger = hunger - 0;
		}
		if (hunger < 50) {
		hunger = hunger - 1;
		}
		if (hunger >=50) {
		hunger = 50;
		}
	}

	public void water() {
		thirst -= 1;

	}

	public void letOut() {
		bathroom -= 1;
	}

	public void play() {
		energy -= 1;
	}

	public void determineStatus() {
		if (hunger == 0 && thirst == 0 && bathroom == 0 && energy == 0) {
			status = "Amazing";
		}
		if (hunger > 0 && thirst > 0 && bathroom > 0 && energy > 0) {
			status = "Great";
		}
		if (hunger > 10 && thirst > 10 && bathroom > 10 && energy > 10) {
			status = "Good";
		}
		if (hunger > 20 && thirst > 20 && bathroom > 20 && energy > 20) {
			status = "Content";
		}
		if (hunger > 30 && thirst > 30 && bathroom > 30 && energy > 30) {
			status = "Okay";
		}
		if (hunger > 40 && thirst > 40 && bathroom > 40 && energy > 40) {
			status = "Bad";
		}
		if (hunger >= 50 && thirst >= 50 && bathroom >= 50 && energy >= 50) {
			status = "Dead";
		}
	}

	public void tick() {
		hunger += 5;
		thirst += 5;
		bathroom += 5;
		energy += 5;

	}

}
