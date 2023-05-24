package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailLogin {

    public WebDriver driver;

    @Given("^I launch the browser$")
    public void i_launch_the_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\June21_1\\OneDrive\\Desktop\\Balaji\\Selenium\\Cromedriver\\chromedriver.exe");
        Thread.sleep(1000);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }

    @And("I enter valid \"(.*)\" as username")
    public void i_enter_valid_as_username(String username) {
        driver.findElement(By.id("identifierId")).sendKeys(username);

    }
    @And("I click on next button to enter password")
    public void i_click_on_next_button_to_enter_password() {
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[3]")).click();

    }
    @And("I enter valid \"(.*)\" as password")
    public void i_enter_valid_as_password(String password) {
        driver.findElement(By.xpath("//*[@id=\\\"password\\\"]/div[1]/div/div[1]/input")).sendKeys(password);

    }
    @When("I click on next button to login into gmail")
    public void i_click_on_next_button_to_login_into_gmail() {
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[3]")).click();

    }
    @Then("I verify the gmail home page")
    public void i_verify_the_gmail_home_page() {
        String str1=driver.findElement(By.linkText("Inbox")).getText();
        String str2 ="Inbox";
        Assert.assertEquals(str1, str2);

    }
}
