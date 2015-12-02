package jungle;

public class Animal implements Comparable<Animal>{

	private String name;
	private String type;
	private Double size;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getSize() {
		return size;
	}
	public void setSize(Double size) {
		this.size = size;
	}

	public int compareTo(Animal arg0) {

		if (this.getSize() <= arg0.getSize())
		{
			return 0;
		}
		else
		return -1;
	}
	
	
	
}
