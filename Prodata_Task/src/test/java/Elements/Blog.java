package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Blog {
    WebDriver chrome;
    JavascriptExecutor js;
    public Blog(WebDriver chrome) {
        this.chrome = chrome;
        this.js = (JavascriptExecutor) chrome;
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(6000);
    }
    //Home button under 'Blog'
    WebElement Home_btn_blog;
    public void press_home_btn() throws InterruptedException {
        sleep();
        js.executeScript("window.scrollBy(0, 130)");
        sleep();
        Home_btn_blog = chrome.findElement(By.xpath("//section[@class='bread-crumb-section bg-cover']//a[@href='/']"));
        Home_btn_blog.click();
    }

    //Phone numbers
    WebElement Baku_num_blog;
    public void press_Baku_tel() throws InterruptedException {
        sleep();
        Baku_num_blog = chrome.findElement(By.xpath("//div[@class='about-banner']//p[contains(text(), 'Baku office: ')]//a"));
        js.executeScript("arguments[0].scrollIntoView(true);", Baku_num_blog);
        sleep();
        js.executeScript("window.scrollBy(0, -400)");
        sleep();
        Baku_num_blog.click();
    }

    WebElement TelAviv_num_blog;
    public void press_TelAviv_tel() throws InterruptedException {
        sleep();
        TelAviv_num_blog = chrome.findElement(By.xpath("//div[@class='about-banner']//p[contains(text(), 'Tel-Aviv office: ')]//a"));
        TelAviv_num_blog.click();
    }

    //Contact Us
    WebElement Contact_us;
    public void press_Contact_us() throws InterruptedException {
        sleep();
        Contact_us = chrome.findElement(By.xpath("//div[@class='about-banner']//a[contains(text(), 'Contact us ')]"));
        Contact_us.click();
    }

    //Links for each blog (Picture, name, 'Read more' button)
    WebElement Blog_link;
    public String press_on_blog() throws InterruptedException {
        sleep();
        Blog_link = chrome.findElement(By.xpath("//div[@class='container']//a[contains(text(), 'MLOps:')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", Blog_link);
        sleep();
        js.executeScript("window.scrollBy(0, -600)");
        sleep();
        Blog_link.click();
        return "Blog1";
    }


    //While reading post Previous / Next buttons
    WebElement next_btn;
    public void press_next_btn() throws InterruptedException {
        sleep();
        next_btn = chrome.findElement(By.xpath("//div[@class='next-prev-section next-prev-section2']//a[contains(text(), 'Next ')]"));
        next_btn.click();
    }
}
