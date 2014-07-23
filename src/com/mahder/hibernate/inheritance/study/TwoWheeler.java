package com.mahder.hibernate.inheritance.study;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Automobile implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String steeringHandle;

	public TwoWheeler() {

	}

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}

}// end class
