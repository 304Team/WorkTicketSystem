package com.dao;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class Page {
	private int currentPage;
	private int perPageRows;
	private int totalPages;
	private int totalRows;
	private int startRows;
	
	public void setCurrentPage(int currentPage) {
		this.currentPage=currentPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	
	public void setPerPageRows(int perPageRows) {
		this.perPageRows=perPageRows;
	}
	public int getPerPageRows() {
		return perPageRows;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages=totalPages;
	}
	public int getTotalPages() {
		return totalPages;
	}
	
	public void setTotalRows(int totalRows) {
		this.totalRows=totalRows;
	}
	public int getTotalRows() {
		return totalRows;
	}
	
	public int getStartRows() {
		return startRows;
	}
	public void setStartRows(int startRows) {
		this.startRows=startRows;
	}

}
