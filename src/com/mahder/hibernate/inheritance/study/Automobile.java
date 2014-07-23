package com.mahder.hibernate.inheritance.study;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Automobile {
	@Id
	@GeneratedValue
	private int id;
	private String automobileName;

	public Automobile() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutomobileName() {
		return automobileName;
	}

	public void setAutomobileName(String automobileName) {
		this.automobileName = automobileName;
	}

}// end class
