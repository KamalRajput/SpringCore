package com.Kamal.Spring.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean {
/* Lifecycle achieved using Interfaces as implemented above. 
 * Also in this case we dont need to explicitly inform about init-method and destroy-method in config.xml.
 */
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		System.out.println("Setting up the data in object");
		this.id = id;
	}
	
	public void hi() {
		System.out.println("This is init method");
	}
	
	public void bye() {
		System.out.println("This is destroy method");
	}
	
	@Override
	public String toString() {
		
		return "Patient [id :"+id+"]";
	}
	
	/* present inside Initializing bean*/
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside afterPropertiesSet method of InitializingBean interface");
		
	}

	/* present inside disposable bean*/
	@Override
	public void destroy() throws Exception {
		System.out.println("inside destroy method of DisposableBean interface");
		
	}

	
}
