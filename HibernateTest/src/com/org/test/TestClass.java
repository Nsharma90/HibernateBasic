package com.org.test;

import org.hibernate.Session;

import com.org.pojos.User;
import com.org.utilities.HibernateUtility;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("Hello there");
		Session session = HibernateUtility.getSessionFactory().openSession();
		
	User emp1 = new User();
	emp1.setUsrId(56321);
	emp1.setUsrName("Herry");
	session.save(emp1);
		session.close();
		

	}

}
