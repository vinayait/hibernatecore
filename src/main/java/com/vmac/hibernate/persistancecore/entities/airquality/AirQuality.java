package com.vmac.hibernate.persistancecore.entities.airquality;

import java.util.List;

public class AirQuality {
	
	MetaData meta;
	List<List<Object>> data;
	public MetaData getMetaData() {
		return meta;
	}
	public void setMetaData(MetaData metaData) {
		this.meta = metaData;
	}
	public List<List<Object>> getData() {
		return data;
	}
	public void setData(List<List<Object>> data) {
		this.data = data;
	}
	
}
