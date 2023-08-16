package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SocialMedia {
    WebDriver chrome;
    JavascriptExecutor js;
    public SocialMedia(WebDriver chrome) {
        this.chrome = chrome;
        this.js = (JavascriptExecutor) chrome;
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(5000);
    }
    //Home button under 'Us on Social Media'
    WebElement Home_btn_why_us;
    public void press_home_btn() throws InterruptedException {
        sleep();
        js.executeScript("window.scrollBy(0, 130)");
        sleep();
        Home_btn_why_us = chrome.findElement(By.xpath("//section[@class='bread-crumb-section bg-cover']//a[@href='/']"));
        Home_btn_why_us.click();
    }

    //Different LinkedIn posts (each post is located in different frame)
    WebElement desired_post;
    public void view_desired_post() throws InterruptedException {
        sleep();
        desired_post = chrome.findElement(By.xpath("//div[@class='container']/div/div/div/div[9]"));
        js.executeScript("arguments[0].scrollIntoView(true);", desired_post);
        sleep();
        js.executeScript("window.scrollBy(0, -170)");
        sleep();
        chrome.switchTo().frame(8);
        sleep();
        js.executeScript("window.scrollBy(0, 200)");
        sleep();
        chrome.switchTo().parentFrame();
    }

    //Page switching buttons (5 buttons)
    WebElement next_btn;
    public void press_next_btn() throws InterruptedException {
        sleep();
        next_btn = chrome.findElement(By.xpath("//ul[@class='pagination']/li[4]/a"));
        js.executeScript("arguments[0].scrollIntoView(true);", next_btn);
        sleep();
        js.executeScript("window.scrollBy(0, -400)");
        sleep();
        next_btn.click();
    }

}
