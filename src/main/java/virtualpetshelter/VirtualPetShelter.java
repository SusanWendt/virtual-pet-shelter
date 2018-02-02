package virtualpetshelter;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	private Map<String, VirtualPet> pets = new HashMap<>();

	public void addPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	public VirtualPet getPetByName(String name) {
		return pets.get(name);
	}

}
