package jungle;

import java.util.List;

public class Jungle {

	private Animal largest;
	private List<Animal> animals;
	
	public Animal getLargets() {
		return largest;
	}
	public void setLargets(Animal largest) {
		this.largest = largest;
	}
	public List<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	
	@Override
	public String toString() {
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Animalsin the jungle: ");
		sb.append("\n");
		for (Animal an: animals)
		{
			sb.append(an.getType());
			sb.append(": ");
			sb.append(an.getName());
			sb.append("\n");
		}
		
		sb.append("Largest Animal: " + largest.getType());
		
		return sb.toString();
	}
	
	
	
}
