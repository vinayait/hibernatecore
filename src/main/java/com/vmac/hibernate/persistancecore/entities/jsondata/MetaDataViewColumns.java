package com.vmac.hibernate.persistancecore.entities.jsondata;

import java.util.ArrayList;

public class MetaDataViewColumns {
	int id;
	String name;
	String dataTypeName;
	String fieldName;
	int position;
	String renderTypeName;
	Format format;
	String [] flags;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDataTypeName() {
		return dataTypeName;
	}
	public void setDataTypeName(String dataTypeName) {
		this.dataTypeName = dataTypeName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getRenderTypeName() {
		return renderTypeName;
	}
	public void setRenderTypeName(String renderTypeName) {
		this.renderTypeName = renderTypeName;
	}
	public Format getFormat() {
		return format;
	}
	public void setFormat(Format format) {
		this.format = format;
	}
	public String [] getFlags() {
		return flags;
	}
	public void setFlags(String [] flags) {
		this.flags = flags;
	}

}
