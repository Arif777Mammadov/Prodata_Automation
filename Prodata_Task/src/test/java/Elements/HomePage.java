package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    WebDriver chrome;
    JavascriptExecutor js;
    public HomePage(WebDriver chrome){
        this.chrome = chrome;
        this.js = (JavascriptExecutor) chrome;
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(5000);
    }

    //Schedule Meeting
    WebElement shedule_meeting;
    public void press_shedule_meeting() throws InterruptedException {
        sleep();
        shedule_meeting = chrome.findElement(By.xpath("//div[@class='hero-content']//a[@href='/contact']"));
        shedule_meeting.click();
    }

    //Latest Blogs
    WebElement blog_to_right;
    public void press_blog_to_right() throws InterruptedException {
        sleep();
        blog_to_right = chrome.findElement(By.xpath("//div[@class='container']//a[@href='/blog/1' and @class='brief-desc']"));
        js.executeScript("arguments[0].scrollIntoView(true);", blog_to_right);
        sleep();
        js.executeScript("window.scrollBy(0, -300)");
        sleep();
        blog_to_right.click();
    }

    //Our Partners
    WebElement arrow_right;
    public void press_arrow_right() throws InterruptedException {
        sleep();
        arrow_right = chrome.findElement(By.xpath("//div[@class='brand-card bg-cover']//img[@class='arrow-right']"));
        js.executeScript("arguments[0].scrollIntoView(true);", arrow_right);
        sleep();
        js.executeScript("window.scrollBy(0, -600)");
        sleep();
        arrow_right.click();
    }

    //Nubs_group has https://google.com link
    WebElement Agritask;
    public void press_agritask() throws InterruptedException {
        sleep();
        Agritask = chrome.findElement(By.xpath("//div[@class='swiper-slide']//a[@href='https://start.agritask.com/']"));
        Agritask.click();
    }

    //SOLUTIONS & SERVICES
    WebElement data_governance;
    public void press_data_governance() throws InterruptedException {
        sleep();
        data_governance = chrome.findElement(By.xpath("//div[@class='service-content']//a[@href='/our_offer/14' and contains(text(), 'Details +')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", data_governance);
        sleep();
        js.executeScript("window.scrollBy(0, -600)");
        sleep();
        data_governance.click();
    }

    WebElement show_all;
    public void press_show_all() throws InterruptedException {
        sleep();
        show_all = chrome.findElement(By.xpath("//div[@class='call-to-action text-center']//a[contains(text(), 'Show all ')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", show_all);
        sleep();
        js.executeScript("window.scrollBy(0, -600)");
        sleep();
        show_all.click();
    }


    //Our Team (11 members). Can yet be found on About Us as well
    WebElement LinkedIn_profile; //Currently selected one (7th profile) isn't found on LinkedIn
    public void press_LinkedIn_profile() throws InterruptedException {
        sleep();
        LinkedIn_profile = chrome.findElement(By.xpath("//div[@class='row mtn-30']/div[7]//ul/li/a[@class='team-social-link']"));//ul/li/a[@class='team-social-link']
        js.executeScript("arguments[0].scrollIntoView(true);", LinkedIn_profile);
        sleep();
        js.executeScript("window.scrollBy(0, -400)");
        sleep();
        chrome.findElement(By.xpath("//div[@class='row mtn-30']/div[7]//div[@class='thumb']/img[@class='img']")).click();
        sleep();
        LinkedIn_profile.click();
    }
}
