package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs {
    WebDriver chrome;
    JavascriptExecutor js;
    public ContactUs(WebDriver chrome) {
        this.chrome = chrome;
        this.js = (JavascriptExecutor) chrome;
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(6000);
    }
    //Home button under 'Contact us'
    WebElement Home_btn_contact_us;
    public void press_home_btn() throws InterruptedException {
        /*sleep();
        js.executeScript("window.scrollBy(0, 130)");*/
        sleep();
        Home_btn_contact_us = chrome.findElement(By.xpath("//section[@class='bread-crumb-section bg-cover']//a[@href='/']"));
        Home_btn_contact_us.click();
    }

    //Phone numbers
    WebElement Baku_num_contact_us;
    public void press_Baku_tel() throws InterruptedException {
        sleep();
        Baku_num_contact_us = chrome.findElement(By.xpath("//section[@class='contact-section-page section-ptb-150']/div[@class='container']//a[@href='tel:0124041221']"));
        js.executeScript("arguments[0].scrollIntoView(true);", Baku_num_contact_us);
        sleep();
        js.executeScript("window.scrollBy(0, -250)");
        sleep();
        Baku_num_contact_us.click();
    }

    WebElement TelAviv_num_contact_us;
    public void press_TelAviv_tel() throws InterruptedException {
        sleep();
        TelAviv_num_contact_us = chrome.findElement(By.xpath("//section[@class='contact-section-page section-ptb-150']/div[@class='container']//a[@href='tel:972544515413']"));
        TelAviv_num_contact_us.click();
    }

    //Company's E-mail
    WebElement email_address;

    public void press_email() throws InterruptedException {
        sleep();
        email_address = chrome.findElement(By.xpath("//section[@class='contact-section-page section-ptb-150']/div[@class='container']//a[@href='mailto:info@prodata.az']"));
        email_address.click();
    }

    //User's name, e-mail, subject and question
    WebElement name_form;

    public void fill_in_name() throws InterruptedException {
        sleep();
        name_form = chrome.findElement(By.xpath("//input[@class='form-control' and @placeholder='Enter your name']"));
        name_form.click();
        name_form.sendKeys("Arif");
    }

    WebElement email_form;

    public void fill_in_email() throws InterruptedException {
        sleep();
        email_form = chrome.findElement(By.xpath("//input[@class='form-control' and @placeholder='Enter your email']"));
        email_form.click();
        email_form.sendKeys("arifmamedov616@gmail.com");
    }

    WebElement subject_form;

    public void fill_in_subject() throws InterruptedException {
        sleep();
        subject_form = chrome.findElement(By.xpath("//input[@class='form-control' and @placeholder='Enter your subject']"));
        subject_form.click();
        subject_form.sendKeys("Technical task for QA Automation");
    }

    WebElement question_form;

    public void fill_in_question() throws InterruptedException {
        sleep();
        question_form = chrome.findElement(By.xpath("//textarea[@class='form-control textarea-control' and @placeholder='Type your question']"));
        question_form.click();
        question_form.sendKeys("This letter is sent via automation.");
    }
    //Submit
    WebElement submit_btn;

    public void submit_letter() throws InterruptedException {
        sleep();
        submit_btn = chrome.findElement(By.xpath("//button[@type='submit']"));
        submit_btn.click();
    }

    //Map (If possible)
    WebElement Map;
    WebElement Map_scale_low;
    public void lower_map_scale() throws InterruptedException {
        sleep();
        Map = chrome.findElement(By.xpath("//iframe[@class='google-map']"));
        js.executeScript("arguments[0].scrollIntoView(true);", Map);
        sleep();
        js.executeScript("window.scrollBy(0, -100)");
        sleep();
        chrome.switchTo().frame(0);
        sleep();
        Map_scale_low = chrome.findElement(By.xpath("//button[@aria-label='Уменьшить']"));
        Map_scale_low.click();
        sleep();
        chrome.switchTo().parentFrame();
    }

}
