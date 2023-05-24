package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class gmailCompose {
    public WebDriver driver;
    @Given("^I Click on Compose email$")
    public void i_click_on_compose_email() {
        driver.findElement(By.linkText("Compose")).click();

    }
    @And("^I Check new popup is displayed$")
    public void i_check_new_popup_is_displayed() {
        String s1="New Message";
        String s2 = driver.findElement(By.xpath("//*[@id=\":1wo\"]/h2/div[2]")).getText();
        Assert.assertEquals(s1, s2);

    }
    @And("^Enter the valid \"(.*)\" into To box$")
    public void enter_the_valid_into_to_box(String email) {
        driver.findElement(By.xpath("//input[@id=':2bp']")).sendKeys(email);

    }
    @And("^Enter the email subject \"(.*)\"$")
    public void enter_the_email_subject(String sub) {
        driver.findElement(By.xpath("//input[@id=':27s']")).sendKeys(sub);

    }
    @And("^Enter the valid body \"(.*)\"$")
    public void enter_the_valid_body_automation_qa_test_for_incubyte(String body) {
        driver.findElement(By.xpath("//div[@id=':291']")).sendKeys(body);

    }
    @When("^I click on send button$")
    public void i_click_on_send_button() {
        driver.findElement(By.xpath("//div[@id=':om']")).click();
        driver.close();

    }
}
