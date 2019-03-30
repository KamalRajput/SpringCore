package com.Kamal.Spring.lifecycle.xml;

public class Patient {

	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		System.out.println("Setting up the data in object");
		this.id = id;
	}
	/* init method- name can be anything. It will be called after the object is created */
	public void hi() {
		System.out.println("This is init method");
	}
	
	/* destroy method is not called by default. To call it
	 * You should have called method RegisterShutdownHook.
	 * It is present inside Abstract Class AbstractApplicationContext.
	 */
	public void bye() {
		System.out.println("This is destroy method");
	}
	
	@Override
	public String toString() {
		
		return "Patient [id :"+id+"]";
	}
}
