package com.apiwrite;

public class SupportPojo {
	private String url;
	private String text;

	public SupportPojo(String url, String text) {
		super();
		this.url = url;
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
