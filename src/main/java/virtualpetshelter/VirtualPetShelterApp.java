package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter myShelter = new VirtualPetShelter();
		// default VirtualPets
		myShelter.addPet(new VirtualPet("Lassie", "dog", 25, 25, 25, 25));
		myShelter.addPet(new VirtualPet("Pippy", "puppy", 15, 15, 15, 15));

		// welcome message
		System.out.println("Welcome to BitBuddies Bed and Breakfast, a SoozaPoalooza Vitrual Pet Emporium(TM) corp.");

		String option = "";
		while (!option.equals("quit")) {
			System.out.println("Your Virtual Pet invetory:");
			myShelter.showPets();
			System.out.println("What would you like to do?");
			System.out.println("1) Feed all the pets.");
			System.out.println("2) Water all the pets.");
			System.out.println("3) Play with a pet by name.");
			System.out.println("4) Chose pet to be adopted by a loving family and fianlly fgot to forever home.");
			System.out.println("5) Check in a new pet to BitBuddies Bed and Breakfast.");
			System.out.println("Type quit at anytime to exit game.");
			option = input.nextLine();

			if (option.equals("1")) {
				myShelter.feedAllPets();
			}
			if (option.equals("2")) {
				myShelter.waterAllPets();
			}
			if (option.equals("3")) {
				System.out.println("Which pet would you like to play with? Type name:");
				myShelter.showPets();
				String petChosen = input.nextLine();
				myShelter.playWithPetByName(petChosen);
				System.out.println("You have chosen to play with " + petChosen);
				System.out.println(petChosen + "'s new status is:");
				System.out.println(myShelter.getPetByName(petChosen));
				input.nextLine();
			}
			if (option.equals("4")) {
				System.out.println("Which pet would you like to be adopted? Type name:");
				myShelter.showPets();
				String petChosen = input.nextLine();
				myShelter.adoptPet(petChosen);
			}
			if (option.equals("5")) {
				System.out.println("Please enter the name of the pet you would like to admit:");
				String petName = input.nextLine();
				System.out.println("Please enter a brief description of the pet you would like to admit:");
				String petDescription = input.nextLine();
				myShelter.addPet(new VirtualPet(petName, petDescription));
			}
			if (option.equals("Quit")) {
				System.out.println("goodbye");
				input.close();
				System.exit(0);
			}
			myShelter.tickAllPets();
			System.out.println("Time has passed.");
		}
	}
}
