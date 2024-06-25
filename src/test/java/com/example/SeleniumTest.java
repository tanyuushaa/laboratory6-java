package com.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class SeleniumTest {
    private WebDriver driver;
    @AfterEach
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driven", "src/test/resources/chromedriven.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void testHeader(){
        driver.get("https://distedu.ukma.edu.ua/my/courses.php");
        WebElement header = driver.findElement(By.id("header"));
        assertThat(header.getText()).isEqualTo("Example Domain");
    }
    @Test
    public void testMoreLink(){
        driver.get("https://distedu.ukma.edu.ua/my/courses.php");
        WebElement moreLink = driver.findElement(By.linkText("More information..."));
        assertThat(moreLink.getText()).isNotNull();
    }
    @Test
    public void testText(){
        driver.get("https://distedu.ukma.edu.ua/my/courses.php");
        WebElement text = driver.findElement(By.tagName("p"));
        assertThat(text.getText()).contains("illustrative examples");
    }
}
