package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {
	private Map<String, VirtualPet> pets = new HashMap<>();

	public void addPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	public VirtualPet getPetByName(String name) {
		return pets.get(name);
	}

	public Collection<VirtualPet> pets() {
		return pets.values();
	}

	public void showPets() { // TODO fix to create public collection VirtualPet then return pets
		for (Entry<String, VirtualPet> entry : pets.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

	public int showPetsSize() {
		return pets.size();
	}

	public void adoptPet(String name) {
		pets.remove(name);

	}

}
