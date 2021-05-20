package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethodSF;
import pages.LoginPage;

public class TC01 extends ProjectSpecificMethodSF{
	
	

	@Test
	public void logIn() throws InterruptedException
	{
		//LoginPage
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		
		
		//VerificationPage
		.enterverification()
		
		
		//HomePage
		.clickApplaunger()
		.clickViewAll()
		.clickSales()
		
		
		//SalesPage
		.clickOpportunity();
		
		
		//OpportunitiesPage
		//.clickNew();
		
	}
}


	


	
	/*
	public static void main(String[] args) throws IOException, ParseException, InterruptedException {
		
	
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://login.salesforce.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	File Cookiesfile= new File("C:\\Users\\arya1\\eclipse-workspace\\SalesforceTesing\\src\\main\\resources\\Cookies.data");
	FileReader fileReader = new FileReader(Cookiesfile);							
    BufferedReader Buffreader = new BufferedReader(fileReader);							
    String strline;			
    boolean cookieExists = false;
    while((strline=Buffreader.readLine())!=null)
    {									
    	System.out.println("*************>>>" + strline +" <<<<<<<<<<<<<<<< ***********");
    	
	    StringTokenizer token = new StringTokenizer(strline,";");									
	    while(token.hasMoreTokens())
	    {					
		    String name = token.nextToken();					
		    String value = token.nextToken();					
		    String domain = token.nextToken();					
		    String path = token.nextToken();					
		    	
		    SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
		    Date expiry = sdf.parse("29042022");
		    		
		    String val;			
		    if(!(val=token.nextToken()).equals("null"))
			{		
		    	System.out.println("Date Value = "+val);
		    	System.out.println("Expiry Date = "+ expiry);					
		    }		
		    Boolean isSecure = new Boolean(token.nextToken()).booleanValue();		
		    Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);			
		    System.out.println(ck);
		    driver.manage().addCookie(ck); // This will add the stored cookie to your current session	
		    cookieExists = true;
	    }		
    }	
    
    Buffreader.close();
    
    driver.findElement(By.id("username")).sendKeys("arya13@testleaf.com");
	driver.findElement(By.id("password")).sendKeys("march@2021");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(5000);
	
    if(!cookieExists)
    {
    	System.out.println("Writing Cookiee");
    	Set<Cookie> allCookies=driver.manage().getCookies();
    	
        FileWriter fileWrite = new FileWriter(Cookiesfile);							
        BufferedWriter Bwrite = new BufferedWriter(fileWrite);							

    	for (Cookie ck: allCookies) 
    	{
    		 Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
             Bwrite.newLine(); 
    	}
    	Bwrite.close();			
        fileWrite.close();	
    }
	
	
	/** Handling of Cookies **/
		
	

