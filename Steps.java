import org.picocontainer.behaviors.Intercepted.Controller;
import org.testng.Assert;
import org.testng.annotations.Test;

import Test.Run.Initialise;
import Test.Run.PageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

//@RunWith(Cucumber.class)
public class Steps extends Initialise {

	PageObject pObj;
	
    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    	driver = initializeDriver();
    }
    
    //@And("^Navigate to dotnetfiddle.net home page$")
    //public void navigate_to_dotnetfiddlenet_home_page() throws Throwable {
    	//driver.get(prop.getProperty("url"));
    //}
    
    @And("^Navigate to \"([^\"]*)\" home page$")
    public void navigate_to_something_home_page(String strArg1) throws Throwable {
    	driver.get(strArg1);
    }

    @When("^User click on the Choose Your Industry Link$")
    public void user_click_on_the_choose_button() throws Throwable {
    	pObj=new PageObject(driver);
    	pObj.RunButton().click();
    }

    @Then("^There will be links for Financial Services, Insurance, Life and Pensions, Corporations and Non-Profits$")
    public void the_links_availability() throws Throwable {
    	pObj=new PageObject(driver);
    	String strText = pObj.FinancialServices().getText();
    	Assert.assertEquals("Hello World",strText);
    	
    	String strText1 = pObj.Insurance().getText();
    	Assert.assertEquals("Hello World",strText1);
    	
    	String strText2 = pObj.LifeAndPensions().getText();
    	Assert.assertEquals("Hello World",strText2);
    	
    	String strText3 = pObj.Corporations().getText();
    	Assert.assertEquals("Hello World",strText3);

    }
   

}