package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchWithScenarioOutline {
    WebDriver webDriver;

    @Given("the user enters in the search articles page")
    public void userEntersInArticlesPage() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.mercadona.es/");
        webDriver.findElement(By.xpath("//*[@id=\"root\"]/header/div/div/form/div/input")).sendKeys("46135");
        webDriver.findElement(By.xpath("//*[@id=\"root\"]/header/div/div/form/input")).click();
    }

    @When("the user enters (.*) in the search bar")
    public void userEntersTheArticleInSearchBar(String article){
        webDriver.findElement(By.xpath("//*[@id=\"root\"]/header/div/div/form/div/input")).sendKeys("46135");
        webDriver.findElement(By.xpath("//*[@id=\"root\"]/header/div/div/form/input")).click();
        webDriver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(article);
    }

    @Then("the (.*) page appears")
    public void articlePageIsDisplayed(String article){
        webDriver.findElement(By.xpath("//*[@id=\"root\"]/header/div/div/form/div/input")).sendKeys("46135");
        webDriver.findElement(By.xpath("//*[@id=\"root\"]/header/div/div/form/input")).click();
        webDriver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(article);
        String results = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/p")).getText();
        Assert.assertTrue(results.contains(article));
    }

}
