package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC004 {

	//public static void main(String[] args) throws Exception {
		@Test
		public void tc004() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General g = new General();
		g.OpenBrowserApplication();
		g.LoginApplication();
		g.searchNewAddedComLtn();
		g.LogoutApplication();
	}

}
