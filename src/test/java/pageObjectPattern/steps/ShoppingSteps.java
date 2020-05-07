package pageObjectPattern.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectPattern.steps.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjectPattern.pages.*;

import static org.junit.Assert.assertTrue;

//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingSteps extends Base {
    private WebDriver driver;


    @Given("^User is logged in to CodersLab shop and search Hummingbird Printed Sweater")
    public void userIsLoggedInToCodersLabShop(){
        driver = prepateDriver();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
        WebElement loginInput = driver.findElement(By.name("email"));
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys("cichanowicz@gmail.com");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("cebula123");

        WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();
        WebElement element = driver.findElement(By.cssSelector("input[type='text']"));
        element.sendKeys("Hummingbird Printed Sweater");
        element.submit();
    }
    @When("^User chooses Hummingbird Printed Sweater$")
    public void userChoosesHummingbridPrintedSweaters() {
        driver.findElement(By.cssSelector("img[alt='Brown bear printed sweater']")).click();

    }
    @And("^User checks the discount$")
    public void userChecksTheDiscount() {
        assertTrue(driver.findElement(By.xpath("//span[.='Save 20%']")).isDisplayed());
    }

    @And("^User select M size$")
    public void userSelectMSize() {
        driver.findElement(By.id("group_1")).click();
        driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[3]")).click();

    }

    @And("^User select 5 pieces$")
    public void userSelect5Pieces() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            WebElement quantity = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]"));
            quantity.click();
            Thread.sleep(1500);
            //quantity.clear();
            //quantity.sendKeys("5");
            // driver.findElement(By.id("quantity_wanted")).sendKeys("5");
        }
    }
    @And("^User click ADD TO CART$")
    public void userClickADDTOCART() throws InterruptedException {
        driver.findElement(By.cssSelector("button[data-button-action='add-to-cart']")).click();
        Thread.sleep(1500);
    }

    @And("^User click Proceed to Checkout$")
    public void userClickProceedToCheckout() {

        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")).click();
    }

    @And("^User select an Address$")
    public void userSelectAnAddress() {
        driver.findElement(By.xpath("//*[@id=\"id-address-delivery-address-2789\"]/header/label/span[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button")).click();
    }
    @And("^User select Shipping Method$")
    public void userSelectShippingMethod() {

        driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button")).click();
    }

    @And("^User select Payment Method$")
    public void userClickOnSaveButton() {

        driver.findElement(By.xpath("//*[@id=\"payment-option-1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"conditions_to_approve[terms-and-conditions]\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button")).click();
    }
    @Then("^user should see a confirm of adding new address$")
    public void userShouldSeeAConfirmOfAddingNewAddress() {
        assertTrue(driver.findElement(By.cssSelector("article[class='alert alert-success']")).isDisplayed());
    }
    @And("^browser should be close$")
    public void browserShouldBeClose() {
        driver.close();
    }
}


