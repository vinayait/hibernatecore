package com.vmac.hibernate.persistancecore;

import java.net.URL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.vmac.hibernate.persistancecore.entities.Contact;
import com.vmac.hibernate.persistancecore.entities.Name;
import com.vmac.hibernate.persistancecore.entities.Phone;
import com.vmac.hibernate.persistancecore.entities.Phone.PhoneType;
import com.vmac.hibernate.persistancecore.entities.Product;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		App app = new App();
		app.setUp();
	}

	protected void setUp() throws Exception {
		// ***************   A SessionFactory is set up once for an application! ******************
		// configures settings
		// from
		// hibernate.cfg.xml
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

			Session session = sessionFactory.openSession();
			session.beginTransaction();

			EntityPersister entityPersister = new EntityPersister(session);
			EntityRetriever entityRetriever = new EntityRetriever(session);

			entityPersister.saveContact("insert into contact", false, "https://www.oracle.com", "vinay", "pandey", "");
			entityPersister.saveProduct("Laser", "332230029", "this laser generates 200 F temperatures");
			entityPersister.savePhone("218-968-8776", PhoneType.LAND_LINE);
			entityPersister.saveBook("War of Worlds", "H.G. Wells");
			entityPersister.saveAirQualityData();

			session.getTransaction().commit();
			
			entityRetriever.getContact();
			
			session.close();
		} catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had trouble
			// building the SessionFactory
			// so destroy it manually.
			StandardServiceRegistryBuilder.destroy(registry);
			e.printStackTrace();
		}
	}
}
