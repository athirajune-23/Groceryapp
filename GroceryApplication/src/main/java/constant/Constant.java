package constant;

public class Constant {
	
	public static final String TESTDATAFILE = System.getProperty("user.dir")+"\\src\\test\\resources\\TestDataSample.xlsx";
	public static final String CATEGORYIMAGEFILE = System.getProperty("user.dir")+"\\src\\test\\resources\\veg.png";
	public static final String CONFIGFILE = System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";
	public static final String LOGINUSINGVALIDCREDENTIALS = "homepage is not loaded with valid credentials";
	public static final String LOGINWITHINVALIDPASSWORD ="homepage is loaded with incorrect password";
	public static final String LOGINWITHINVALIDUSERNAME ="homepage is loaded with incorrect password";
	public static final String LOGINWITHINVALIDPASSWORDINVALIDUSERNAME = "homepage is loaded with incorrect password";
	public static final String USERISABLETOACCESSADMINUSERS = "not able to add new admin users with valid credentials";
	public static final String USERISABLETOLOGOUT ="logoutpage is not loaded";
	public static final String USERISABLETOACCESSMANAGECATEGORY = "not able to add new manage category with valid credentials";
	public static final String USERISABLETOACCESSMANAGENEWS = "not able to add new manage news category with valid credentials";
	public static final String USERISABLETOACCESSMANAGEFOOTERTEXT = "not able to add new manage footer text category with valid credentials";
	public static final String USERISABLETOACCESSMANAGECONTACT = "not able to add new manage contact with valid credentials";
	
}
