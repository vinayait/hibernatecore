package com.vmac.hibernate.persistancecore;

import junit.framework.TestCase;

public class EntityPersisterTest extends TestCase{
	
	public void testGetJsonFromUrl() {
		EntityPersister entityPersister = new EntityPersister();
		entityPersister.getJsonFromUrl("https://data.lacity.org/api/views/nxs9-385f/rows.json");
	}

}
