package com.fockers.springtest;

public class Person {

	private int id;
	private String name;
	private int gamerId;
	private Address address;

	


	public void setAddress(Address address) {
		this.address = address;
	}

	public Person()
	{
		
	}

	public Person(int id, String name) {

		this.id = id;
		this.name = name;
		System.out.println("Created Person: " + this);
	}	
	
	//bean factory method
	public static Person getInstance(int id,  String name)
	{
		System.out.println("Factory method created Person");
		return new Person(id, name);
	}
	
	
	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public void speak()
	{
			System.out.println("hello i am a person");
	}

	public void speak(String str)
	{
			System.out.println(str);
	}
	
	//method called by bean upon creation using init - name doesnt matter
	//shows in bean.xml - <init-method="initMethod">
	public void initMethod()
	{
		System.out.println("Bean Person : " + name + " created");
	}
	
	//only available when bean.xml set this bean to singleton - not prototype
	public void onDestroyed()
	{
		System.out.println("Bean Person : " + name + " destroyed");
	}
	
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gamerId=" + gamerId + ", address=" + address + "]";
	}
	
	
	
	

	
	
}
