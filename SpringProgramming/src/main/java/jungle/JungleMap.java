package jungle;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JungleMap {
	private Animal largest;
	private Map<String, String> foods = new HashMap<String, String>();
	
	
	public Map<String, String> getFoods() {
		return foods;
	}
	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}


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
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<String, String>   entry: foods.entrySet())
		{
			sb.append(entry.getKey() + " : " + entry.getValue() + "\n");
		}
		return sb.toString();
		
	}

	
	public void sortLargest()
	{
	    Collections.sort(animals);
	    largest = animals.get(0);
	}
}
