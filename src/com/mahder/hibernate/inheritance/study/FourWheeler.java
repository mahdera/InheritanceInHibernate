/**
 * 
 */
package com.mahder.hibernate.inheritance.study;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * @author alemayehu
 *
 */
@Entity
public class FourWheeler extends Automobile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String steeringWheel;

	public FourWheeler() {

	}

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

}// end class
