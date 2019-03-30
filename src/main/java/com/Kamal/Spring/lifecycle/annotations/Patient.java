package com.Kamal.Spring.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient {
	/* lifecycle achieve using annotations.
	 * @PostCOnstruct and @PreDestroy annotations.
	 */
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		System.out.println("Setting up the data in object");
		this.id = id;
	}
	
	@PostConstruct
	public void hi() {
		System.out.println("This is init method");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("This is destroy method");
	}
	
	@Override
	public String toString() {
		
		return "Patient [id :"+id+"]";
	}
	
}
