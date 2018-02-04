package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter myShelter = new VirtualPetShelter();

		// welcome message
		System.out.println("Welcome to BitBuddies Bed and Breakfast, a SoozaPoalooza Vitrual Pet Emporium(TM) corp.");
		// default VirtualPets options
		System.out.println("Please select a theme for your pet inventory: ");
		System.out.println("1) Bikini Bottom");
		System.out.println("2) Dogs");
		String themeChosen = input.nextLine();
		if (themeChosen.equals("1")) {
			myShelter.addPet(new VirtualPet("Bob", "sea sponge", 25, 25, 25, 25));
			myShelter.addPet(new VirtualPet("Patrick", "just a star", 25, 25, 25, 25));
		}
		if (themeChosen.equals("2")) {
			myShelter.addPet(new VirtualPet("Lassie", "Smart Collie", 25, 25, 25, 25));
			myShelter.addPet(new VirtualPet("Fido", "Loyal Dog", 25, 25, 25, 25));
			myShelter.addPet(new VirtualPet("Cujo", "Nightmare", 25, 25, 25, 25));
			myShelter.addPet(new VirtualPet("Snoopy", "Cartoon", 25, 25, 25, 25));
		}

		// game loop
		String option = "";
		while (!option.equals("quit")) {
			// pets displayed
			System.out.println("Your Virtual Pet inventory:");
			System.out.print("\tname\t");
			System.out.print("| description \t\t");
			System.out.print("| hunger \t");
			System.out.print("| thirst \t");
			System.out.print("| bathroom \t");
			System.out.print("| energy \t");
			System.out.print("| status \t");
			System.out.println();
			System.out.println(
					"----------------|-----------------------|---------------|---------------|---------------|---------------|---------------");
			myShelter.showPets();
			System.out.println();

			// game menu
			System.out.println("What would you like to do?");
			System.out.println("1) Feed all the pets.");
			System.out.println("2) Water all the pets.");
			System.out.println("3) Let out all the pets to go to the bathroom .");
			System.out.println("4) Playtime for all of the pets.");
			System.out.println("5) Play with just one pet.");
			System.out.println("6) Choose a pet to be adopted by a loving family.");
			System.out.println("7) Invite a new pet to BitBuddies Bed and Breakfast.");
			System.out.println("Or type 'quit' to exit game.");
			option = input.nextLine();

			if (option.equals("1")) {
				myShelter.feedAllPets();
				System.out.println("You have chosen to feed all the pets.");
			}
			if (option.equals("2")) {
				myShelter.waterAllPets();
				System.out.println("You have chosen to water all the pets.");
			}
			if (option.equals("3")) {
				myShelter.letOutAllPets();
				System.out.println("You have chosen to let all the pets go to the bathroom.");
			}
			if (option.equals("4")) {
				myShelter.playWithAllPets();
				System.out.println("You have chosen to play with all the pets.");
			}
			if (option.equals("5")) {
				System.out.println("Which pet would you like to play with? Type name:");
				String petChosen = input.nextLine();
				myShelter.playWithPetByName(petChosen);
				System.out.println("You have chosen to play with " + petChosen);
			}
			if (option.equals("6")) {
				System.out.println("Which pet would you like to be adopted? Type name:");
				String petChosen = input.nextLine();
				myShelter.adoptPet(petChosen);
				System.out.println("You have chosen to send " + petChosen + " to a forever home. (Leaving BitBuddies)");
			}
			if (option.equals("7")) {
				System.out.println("Please enter the name of the pet you would like to add:");
				String petName = input.nextLine();
				System.out.println("Please enter a brief description of the pet you would like to admit:");
				String petDescription = input.nextLine();
				myShelter.addPet(new VirtualPet(petName, petDescription));
				System.out.println("You have added " + petName + " the " + petDescription + " to BitBuddies.");
			}
			if (option.equalsIgnoreCase("Quit")) {
				System.out.println("Goodbye!");
				input.close();
				System.exit(0);
			}
			myShelter.tickAllPets();
		}
	}
}
