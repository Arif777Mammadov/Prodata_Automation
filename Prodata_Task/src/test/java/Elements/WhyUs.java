package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhyUs {
    WebDriver chrome;
    JavascriptExecutor js;
    public WhyUs(WebDriver chrome) {
        this.chrome = chrome;
        this.js = (JavascriptExecutor) chrome;
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(5000);
    }

    //Home button under 'SOLUTIONS & SERVICES'
    WebElement Home_btn_why_us;
    public void press_home_btn() throws InterruptedException {
        sleep();
        js.executeScript("window.scrollBy(0, 130)");
        sleep();
        Home_btn_why_us = chrome.findElement(By.xpath("//section[@class='bread-crumb-section bg-cover']//a[@href='/']"));
        Home_btn_why_us.click();
    }

    //SOLUTIONS & SERVICES: Here we choose Data Science, oddly enough is disappears if you try to position it on center of screen
    WebElement data_science;
    public String press_data_science() throws InterruptedException {
        sleep();
        data_science = chrome.findElement(By.xpath("//div[@class='service-content']//a[@href='/our_offer/16' and contains(text(), 'Details +')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", data_science);
        sleep();
        js.executeScript("window.scrollBy(0, -450)");//starting from 460px up element disappears
        sleep();
        data_science.click();
        return "DS page";
    }
    //Next page (IT Infrastructure)
    WebElement next_btn;
    public void press_next_btn() throws InterruptedException {
        sleep();
        next_btn = chrome.findElement(By.xpath("//div[@class='next-prev-section']//a[contains(text(), 'Next ')]"));
        next_btn.click();
    }
}
