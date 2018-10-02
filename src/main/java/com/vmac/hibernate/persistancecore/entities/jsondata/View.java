package com.vmac.hibernate.persistancecore.entities.jsondata;

import java.util.ArrayList;

public class View {
	String id;
	String name;
	int averageRating;
	String category;
	long createdAt;
	String description;
	String displayType;
	int downloadCount;
	boolean hideFromCatalog;
	boolean hideFromDataJson;
	long indexUpdatedAt;
	boolean newBackend;
	int numberOfComments;
	long oid;
	String provenance;
	boolean publicationAppendEnabled;
	long publicationDate;
	long publicationGroup;
	String publicationStage;
	String rowClass;
	long rowsUpdatedAt;
	String rowsUpdatedBy;
	long tableId;
	int totalTimesRated;
	int viewCount;
	long viewLastModified;
	String viewType;
	MetaDataViewColumns [] columns;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(int averageRating) {
		this.averageRating = averageRating;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public int getDownloadCount() {
		return downloadCount;
	}
	public void setDownloadCount(int downloadCount) {
		this.downloadCount = downloadCount;
	}
	public boolean isHideFromCatalog() {
		return hideFromCatalog;
	}
	public void setHideFromCatalog(boolean hideFromCatalog) {
		this.hideFromCatalog = hideFromCatalog;
	}
	public boolean isHideFromDataJson() {
		return hideFromDataJson;
	}
	public void setHideFromDataJson(boolean hideFromDataJson) {
		this.hideFromDataJson = hideFromDataJson;
	}
	public long getIndexUpdatedAt() {
		return indexUpdatedAt;
	}
	public void setIndexUpdatedAt(long indexUpdatedAt) {
		this.indexUpdatedAt = indexUpdatedAt;
	}
	public boolean isNewBackend() {
		return newBackend;
	}
	public void setNewBackend(boolean newBackend) {
		this.newBackend = newBackend;
	}
	public int getNumberOfComments() {
		return numberOfComments;
	}
	public void setNumberOfComments(int numberOfComments) {
		this.numberOfComments = numberOfComments;
	}
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	public String getProvenance() {
		return provenance;
	}
	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}
	public boolean isPublicationAppendEnabled() {
		return publicationAppendEnabled;
	}
	public void setPublicationAppendEnabled(boolean publicationAppendEnabled) {
		this.publicationAppendEnabled = publicationAppendEnabled;
	}
	public long getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(long publicationDate) {
		this.publicationDate = publicationDate;
	}
	public long getPublicationGroup() {
		return publicationGroup;
	}
	public void setPublicationGroup(long publicationGroup) {
		this.publicationGroup = publicationGroup;
	}
	public String getPublicationStage() {
		return publicationStage;
	}
	public void setPublicationStage(String publicationStage) {
		this.publicationStage = publicationStage;
	}
	public String getRowClass() {
		return rowClass;
	}
	public void setRowClass(String rowClass) {
		this.rowClass = rowClass;
	}
	public long getRowsUpdatedAt() {
		return rowsUpdatedAt;
	}
	public void setRowsUpdatedAt(long rowsUpdatedAt) {
		this.rowsUpdatedAt = rowsUpdatedAt;
	}
	public String getRowsUpdatedBy() {
		return rowsUpdatedBy;
	}
	public void setRowsUpdatedBy(String rowsUpdatedBy) {
		this.rowsUpdatedBy = rowsUpdatedBy;
	}
	public long getTableId() {
		return tableId;
	}
	public void setTableId(long tableId) {
		this.tableId = tableId;
	}
	public int getTotalTimesRated() {
		return totalTimesRated;
	}
	public void setTotalTimesRated(int totalTimesRated) {
		this.totalTimesRated = totalTimesRated;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public long getViewLastModified() {
		return viewLastModified;
	}
	public void setViewLastModified(long viewLastModified) {
		this.viewLastModified = viewLastModified;
	}
	public String getViewType() {
		return viewType;
	}
	public void setViewType(String viewType) {
		this.viewType = viewType;
	}
	public MetaDataViewColumns [] getColumns() {
		return columns;
	}
	public void setColumns(MetaDataViewColumns [] columns) {
		this.columns = columns;
	}
	
}
