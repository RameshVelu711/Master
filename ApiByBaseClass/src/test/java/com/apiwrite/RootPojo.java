package com.apiwrite;

import java.util.List;

public class RootPojo {
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private List<DatumPojo> datumPojo;
	private SupportPojo supportPojo;

	public RootPojo(int page, int per_page, int total, int total_pages, List<DatumPojo> datumPojo,
			SupportPojo supportPojo) {
		super();
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_pages = total_pages;
		this.datumPojo = datumPojo;
		this.supportPojo = supportPojo;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPer_page() {
		return per_page;
	}

	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}

	public List<DatumPojo> getDatumPojo() {
		return datumPojo;
	}

	public void setDatumPojo(List<DatumPojo> datumPojo) {
		this.datumPojo = datumPojo;
	}

	public SupportPojo getSupportPojo() {
		return supportPojo;
	}

	public void setSupportPojo(SupportPojo supportPojo) {
		this.supportPojo = supportPojo;
	}

}
