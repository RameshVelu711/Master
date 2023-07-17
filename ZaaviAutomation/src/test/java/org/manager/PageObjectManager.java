package org.manager;

import org.pom.TC1_LoginPage;

public class PageObjectManager {

	
	private TC1_LoginPage loginPage;
	
	
	
		public TC1_LoginPage getLoginPage() {

			return ( loginPage ==null)? loginPage = new TC1_LoginPage() : loginPage;
			
		}
		
}