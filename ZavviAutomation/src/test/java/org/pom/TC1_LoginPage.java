package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC1_LoginPage extends BaseClass {

	public TC1_LoginPage() {

		PageFactory.initElements(driver, this);
	}

	// *[@id="onetrust-accept-btn-handler"]
	@FindBy(id = "onetrust-accept-btn-handler")
	private WebElement btnOk;

	@FindBy(className = "emailReengagement_close_button")
	private WebElement btnCancel;

	@FindBy(xpath = "//button[@class='headerSearch_toggleForm ']")
	private WebElement btnSearch;

	@FindBy(xpath = "//input[@name='search']")
	private WebElement btnSearchBox;

	public WebElement getBtnSearchBox() {
		return btnSearchBox;
	}

	public void setBtnSearchBox(WebElement btnSearchBox) {
		this.btnSearchBox = btnSearchBox;
	}

	@FindBy(xpath = "//h1[@id='responsive-product-list-title']")
	private WebElement txtVerify;

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getTxtVerify() {
		return txtVerify;
	}

	public void setTxtVerify(WebElement txtVerify) {
		this.txtVerify = txtVerify;
	}

	public void setBtnSearch(WebElement btnSearch) {
		this.btnSearch = btnSearch;
	}

	public WebElement getBtnOk() {
		return btnOk;
	}

	public void setBtnOk(WebElement btnOk) {
		this.btnOk = btnOk;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public void setBtnCancel(WebElement btnCancel) {
		this.btnCancel = btnCancel;
	}

}
