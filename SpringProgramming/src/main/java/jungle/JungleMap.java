package jungle;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JungleMap {
	private Animal largest;
	private Map<String, String> foods = new HashMap<String, String>();
	private Map<String,Animal> animals = new HashMap<String, Animal>();
	
	
	public void setAnimals(Map<String, Animal> animals) {
		this.animals = animals;
	}
	public Map<String, String> getFoods() {
		return foods;
	}
	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}

	
	public Animal getLargets() {
		return largest;
	}
	public void setLargets(Animal largest) {
		this.largest = largest;
	}

	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<String, String>   entry: foods.entrySet())
		{
			sb.append(entry.getKey() + " : " + entry.getValue() + "\n");
		}
		
		sb.append("\n");
		
		for(Map.Entry<String, Animal> animal: animals.entrySet())
		{
			sb.append(animal.getKey() + " : " + animal.getValue() + "\n");
		}
		
		
		
		return sb.toString();
		
	}

	
//	public void sortLargest()
//	{
//	    Collections.sort(animals);
//	    largest = animals.get(0);
//	}
}
