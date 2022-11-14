import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

public class testeSystem {

    @Test
    public void OpenPage () {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ryan\\Desktop\\Code\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.magazineluiza.com.br/");

        String url = driver.getCurrentUrl();
        assertEquals("hhttps://www.magazineluiza.com.br/", url);
        driver.quit();

    }

    @Test
    public void TesteLimpeza() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ryan\\Desktop\\Code\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.magazineluiza.com.br/");

        WebElement searchbox = driver.findElement(By.id("strSearch"));
        caixaDeBusca.sendKeys("Smarthphone");
        caixaDeBusca.clear();
        caixaDeBusca.sendKeys("Games");

        WebElement botaoBusca = driver.findElement(By.id("btnOK"));
        botaoBusca.click();

        String url = driver.getCurrentUrl();
        assertTrue(driver.getCurrentUrl().contains("Games"));

        driver.quit();

    }

    @Test
    public void TesteBusca() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ryan\\Desktop\\Code\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.magazineluiza.com.br/");

        WebElement searchbox = driver.findElement(By.id("strSearch"));
        searchbox.sendKeys("Chave");

        WebElement botaoBusca = driver.findElement(By.id("btnOK"));
        botaoBusca.click();

        String title = driver.getTitle();
        assertTrue(title.contains("Chave"));

        driver.quit();

    }

}

