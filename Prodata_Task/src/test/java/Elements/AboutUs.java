package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUs {
    WebDriver chrome;
    JavascriptExecutor js;
    public AboutUs(WebDriver chrome) {
        this.chrome = chrome;
        this.js = (JavascriptExecutor) chrome;
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(6000);
    }

    //Home button under 'About Us'
    WebElement Home_btn_about_us;
    public void press_home_btn() throws InterruptedException {
        sleep();
        js.executeScript("window.scrollBy(0, 130)");
        sleep();
        Home_btn_about_us = chrome.findElement(By.xpath("//section[@class='bread-crumb-section bg-cover']//a[@href='/']"));
        Home_btn_about_us.click();
    }

    //Phone numbers
    WebElement Baku_num_about_us;
    public void press_Baku_tel() throws InterruptedException {
        sleep();
        Baku_num_about_us = chrome.findElement(By.xpath("//div[@class='about-banner']//p[contains(text(), 'Baku office: ')]//a"));
        js.executeScript("arguments[0].scrollIntoView(true);", Baku_num_about_us);
        sleep();
        js.executeScript("window.scrollBy(0, -400)");
        sleep();
        Baku_num_about_us.click();
    }

    WebElement TelAviv_num_about_us;
    public void press_TelAviv_tel() throws InterruptedException {
        sleep();
        TelAviv_num_about_us = chrome.findElement(By.xpath("//div[@class='about-banner']//p[contains(text(), 'Tel-Aviv office: ')]//a"));
        TelAviv_num_about_us.click();
    }

    //Contact us
    WebElement Contact_us;
    public void press_Contact_us() throws InterruptedException {
        sleep();
        Contact_us = chrome.findElement(By.xpath("//div[@class='about-banner']//a[contains(text(), 'Contact us ')]"));
        Contact_us.click();
    }

    //News (Probably bugged)
    WebElement Our_news;
    public void press_news_btn() throws InterruptedException {
        sleep();
        Our_news = chrome.findElement(By.xpath("//div[@class='case-card']//a[contains(text(), 'PRODATA - Team')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", Our_news);
        sleep();
        js.executeScript("window.scrollBy(0, -600)");
        sleep();
        Our_news.click();
    }
    //404 page, all of a sudden...
    WebElement back_home;
    public void go_back() throws InterruptedException {
        sleep();
        back_home = chrome.findElement(By.xpath("//*[@id='__nuxt']/div/div[2]/div/a"));
        back_home.click();
    }

    //MEET OUR TEAM, not now, maybe later


}
