package com.mahder.hibernate.inheritance.study;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestInheritance {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Automobile automobile = new Automobile();
		automobile.setAutomobileName("Motor Vehicle");
		
		TwoWheeler motorVehicle = new TwoWheeler();
		motorVehicle.setAutomobileName("Honda Motor Cycle");
		motorVehicle.setSteeringHandle("Motor Cycle Steering Handle");
		
		FourWheeler toyotaCar = new FourWheeler();
		toyotaCar.setAutomobileName("Toyota Camri, 2013 Model");
		toyotaCar.setSteeringWheel("Toyota Steering Wheel");
		
		
		session.save(automobile);
		session.save(motorVehicle);
		session.save(toyotaCar);
		session.getTransaction().commit();
		session.close();
		System.out.println("Finished saving inheritance objects to the database...");
	}

}//end class
