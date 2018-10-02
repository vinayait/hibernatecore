package com.vmac.hibernate.persistancecore;

import junit.framework.TestCase;

public class EntityPersisterTest extends TestCase{
	
	public void testGetJsonFromUrl() {
		EntityPersister entityPersister = new EntityPersister();
		String data = entityPersister.getJsonFromUrl("https://data.oregon.gov/api/views/i8h7-mn6v/rows.json?accessType=DOWNLOAD");
		assertTrue(data.length() > 0);
		System.out.println(data);
	}

}
