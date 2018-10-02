package com.vmac.hibernate.persistancecore;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.vmac.hibernate.persistancecore.entities.Book;
import com.vmac.hibernate.persistancecore.entities.Contact;

public class EntityRetriever {
	
	Session session;
	EntityManagerFactory entityManagerFactory;
	
	public EntityRetriever(Session session) {
		this.session = session;
		this.entityManagerFactory = this.session.getEntityManagerFactory();
	}
	
	public void getContact() {
		List<Contact> list = session.createQuery("select p from Contact p").list();
		Iterator<Contact> iterator = list.iterator();
		while(iterator.hasNext()) {
			Contact contact = iterator.next();
			System.out.println(contact.getWebsite());
		}
		
	}
	
	public void getProduct() {
		
	}
	
	public void getPhone() {
		
	}
	
	public void getBook() {
		
	}

}
