package com.hrms.testscript;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC005 {

	//public static void main(String[] args) throws Exception {
	@Test
	public void tc005() throws Exception {
		General g = new General();
		g.OpenBrowserApplication();
		g.LoginApplication();
		g.searchNewAddedComLtn();
		g.DeleteCompanyLtn();
		g.LogoutApplication();
	}

}
