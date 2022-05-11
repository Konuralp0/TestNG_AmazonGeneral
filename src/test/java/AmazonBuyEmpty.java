import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class AmazonBuyEmpty {



    static WebDriver driver;

    @Test
    public void amazon() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://google.com");

        WebElement agreeButton = driver.findElement(By.xpath("//*[.='I agree']"));
        agreeButton.click();

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.click();
        searchBar.sendKeys("Amazon"+ Keys.ENTER);

        sleep(3000);

        WebElement amazonButton = driver.findElement(By.partialLinkText("Amazon.de: Low Prices"));
        amazonButton.click();

        sleep(3000);

        WebElement cookiesButton = driver.findElement(By.id("sp-cc-accept"));
        cookiesButton.click();
        sleep(3000);
        WebElement signInButton = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        signInButton.click();
        sleep(3000);

        WebElement amazonMail = driver.findElement(By.id("ap_email"));
        amazonMail.click();
        amazonMail.sendKeys("konuralpcelikyay@gmail.com" + Keys.ENTER);
        sleep(3000);

        WebElement amazonPassword = driver.findElement(By.id("ap_password"));
        amazonPassword.click();
        amazonPassword.sendKeys("Malatya44"+Keys.ENTER);

        Select departmentSelector = new Select(driver.findElement(By.id("searchDropdownBox")));

        departmentSelector.selectByVisibleText("Computers & Accessories");



        WebElement amazonSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearchBox.click();
        amazonSearchBox.sendKeys("RTX3090" + Keys.ENTER);

        WebElement firstPc = driver.findElement(By.partialLinkText("Memory PC Intel Core i9-11900F 8X 5.2GHz, 32GB DDR4 RAM 3000MHz, 480GB SSD+2000GB HDD, NVIDIA GeForce RTX 3080 Ti 12GB, Windows 11 Pro"));
        firstPc.click();

        WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
        addToCart.click();

        WebElement noPleaseButton = driver.findElement(By.id("attachSiNoCoverage"));
        noPleaseButton.click();

        WebElement goToBasket = driver.findElement(By.partialLinkText("Go to basket"));
        goToBasket.click();



        WebElement EmptyBasketEnd = driver.findElement(By.className("sc-action-delete"));
        EmptyBasketEnd = EmptyBasketEnd.findElement(By.className("a-color-link"));
        EmptyBasketEnd.click();
        sleep(1000);
        driver.quit();























    }
}
