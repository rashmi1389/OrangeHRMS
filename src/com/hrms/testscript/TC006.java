package com.hrms.testscript;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC006 {

	//public static void main(String[] args) throws Exception {
	@Test
	public void tc002() throws Exception {	
	General g = new General();
	g.OpenBrowserApplication();
	g.LoginApplication();
	g.AddCompanyPropertyAndDelete();
	g.LogoutApplication();
	}
}