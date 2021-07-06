package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//Data for login application & addemp
	public WebDriver driver;
	public String url ="http://127.0.0.1/orangehrm-2.6/login.php";
	public String username = "admin";
	public String password = "admin";
	public String lastname = "David";
	public String firstname = "Jaya";
	//object for login application & addemp
	public String txt_Loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout="Logout";
	public String link_PIM="PIM";
	public String link_addemp ="Add Employee";
	public String txt_Lastname="txtEmpLastName";
	public String txt_Firstname="txtEmpFirstName";
	public String btn_save="savebutton";
	//Company location data & object
	public String name = "DataMatics";
	public String State = "Telangana";
	public String city = "Hyderabad";
	public String Address = "Mindspace";
	public String zipcode ="497001";
	public String phone = "1234567891";
	public String fax = "456123";
	public String companyl="Company Info";
	public String link_admin = "Admin";
	public String link_locations = "Locations";
	public String btnxp_add="/html/body/div/div[2]/form/div[3]/div[1]/input[1]";
	public String txtc_name="txtLocDescription";
	public String selectid_country ="cmbCountry";
	public String stateid= "txtState";
	public String cityc = "cmbDistrict";
	public String Addressn="txtAddress";
	public String zipcoden="txtZIP";
	public String phonen="txtPhone";
	public String faxn ="txtFax";
	public String btnsave_c="savebutton";
	//searchNewAddedCompanyLocation
	//Object
	public String dropdownbox = "loc_code";
	public String search_txt = "//input[@id='loc_name']";
	public String searchbutton = "//input[@value='Search']";
	//Data
	public String searchbyid = "LOC009";
	//DeleteCompanyLocation
	public String checkbox ="//input[@value='LOC011']";
	public String delete_btn ="//input[@value='Delete']";
	
}
