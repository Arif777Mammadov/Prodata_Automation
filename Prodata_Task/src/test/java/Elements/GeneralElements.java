package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralElements {

    public HomePage h_page;
    public AboutUs a_elem;
    public WhyUs w_elem;
    public SocialMedia s_elem;
    public Blog b_elem;
    public ContactUs c_elem;

    public GeneralElements(WebDriver chrome) {
        PageFactory.initElements(chrome, this);

        h_page = new HomePage(chrome);
        a_elem = new AboutUs(chrome);
        w_elem = new WhyUs(chrome);
        s_elem = new SocialMedia(chrome);
        b_elem = new Blog(chrome);
        c_elem = new ContactUs(chrome);
    }



//Elements on top half
  //Contact options
    //Language Selection
    @FindBy(className = "form-select")
    WebElement lang_sel;

    @FindBy(xpath = "//option[contains(text(),'Azərbaycan')]")
    WebElement lang;

    public void sleep() throws InterruptedException {
        Thread.sleep(5000);
    }
    public void press_lang_sel() throws InterruptedException {
        sleep();
        lang_sel.click();
    }

    public void choose_lang() throws InterruptedException {
        sleep();
        lang.click();
    }
    //Phone Numbers (won't work for desktop, but can be used on smartphone's web-browser)
    @FindBy(xpath = "//a[@href='tel:0124041221']")
    WebElement Baku_tel;

    public void press_baku_tel() throws InterruptedException {
        sleep();
        Baku_tel.click();
    }

    @FindBy(xpath = "//a[@href='tel:972544515413']")
    WebElement Telaviv_tel;

    public void press_telaviv_tel() throws InterruptedException {
        sleep();
        Telaviv_tel.click();
    }

    //LinkedIn
    @FindBy(xpath = "//a[@href='https://az.linkedin.com/company/proodata']")
    WebElement linkedin_btn;

    public void press_linkedin() throws InterruptedException {
        sleep();
        linkedin_btn.click();
    }

  //Page Select Section. Should be checked twice (2nd time when page is scrolled down)!
    //Logo-link
    @FindBy(className = "brand-logo")
    WebElement logo_link;

    public String press_logo() throws InterruptedException {
        sleep();
        logo_link.click();
        return "Main";
    }

    //Home
    @FindBy(xpath = "//ul[@class='main-menu']//a[@href='/']")
    WebElement home_btn;
    public String press_home() throws InterruptedException {
        sleep();
        home_btn.click();
        return "Main";
    }

    //About us
    @FindBy(xpath = "//ul[@class='main-menu']//a[@href='/about']")
    WebElement about_btn;
    public String press_about_us() throws InterruptedException {
        sleep();
        about_btn.click();
        return "AboutUs";
    }

    //Why choose us?
    @FindBy(xpath = "//ul[@class='main-menu']//a[@href='/our_offers']")
    WebElement why_us_btn;
    public String press_why_us() throws InterruptedException {
        sleep();
        why_us_btn.click();
        return "WhyUs";
    }

    //Us on Social Media
    @FindBy(xpath = "//ul[@class='main-menu']//a[@href='/us_on_social_media']")
    WebElement soc_media_btn;
    public String press_soc_media() throws InterruptedException {
        sleep();
        soc_media_btn.click();
        return "SocialMedia";
    }

    //Blog
    @FindBy(xpath = "//ul[@class='main-menu']//a[@href='/blog_list']")
    WebElement blog_btn;
    public String press_blog() throws InterruptedException {
        sleep();
        blog_btn.click();
        return "Blog";
    }

    //Contact us
    @FindBy(xpath = "//ul[@class='main-menu']//a[@href='/contact']")
    WebElement contact_btn;
    public String press_contact_us() throws InterruptedException {
        sleep();
        contact_btn.click();
        return "ContactUs";
    }

//Elements on bottom half
  //Contact options
    //Another Logo-link
    @FindBy(xpath = "//a[@href='/' and @class='footer-logo']")
    WebElement logo_to_bottom;

    public String press_logo_b() throws InterruptedException {
        sleep();
        logo_to_bottom.click();
        return "Main";
    }

    //Phone numbers
    @FindBy(xpath = "//ul[@class='address']//a[@href='tel:994124041221']")
    WebElement Baku_tel_to_bottom;

    public void press_baku_tel_b() throws InterruptedException {
        sleep();
        Baku_tel_to_bottom.click();
    }

    @FindBy(xpath = "//ul[@class='address']//a[@href='tel:972544515413']")
    WebElement Telaviv_tel_to_bottom;

    public void press_telaviv_tel_b() throws InterruptedException {
        sleep();
        Telaviv_tel_to_bottom.click();
    }

    //E-mail
    @FindBy(xpath = "//div[@class='footer-widget']//a[@href='mailto:info@prodata.az']")
    WebElement email_address_to_bottom;

    public void press_email_b() throws InterruptedException {
        sleep();
        email_address_to_bottom.click();
    }


  //All services
    //DATA ANALYSIS
    @FindBy(xpath = "//div[@class='footer-widget']//a[contains(text(),' DATA ANALYSIS') or contains(text(),' DATA ANALİTİKASI')]")
    WebElement data_analysis_to_bottom;

    public void press_data_analysis_b() throws InterruptedException {
        sleep();
        data_analysis_to_bottom.click();
        sleep();
    }

    //DATA ENGINEERING
    @FindBy(xpath = "//div[@class='footer-widget']//a[contains(text(),' DATA ENGINEERING') or contains(text(),' DATA MÜHƏNDİSLİYİ')]")
    WebElement data_engineering_to_bottom;

    public void press_data_engineering_b() throws InterruptedException {
        sleep();
        data_engineering_to_bottom.click();
        sleep();
    }

    //IT INFRASTRUCTURE
    @FindBy(xpath = "//div[@class='footer-widget']//a[contains(text(),' IT INFRASTRUCTURE') or contains(text(),' İT İNFRASTRUKTURASI') or contains(text(),' ИТ-ИНФРАСТРУКТУРА')]")
    WebElement it_infrastructure_to_bottom;

    public void press_it_infrastructure_b() throws InterruptedException {
        sleep();
        it_infrastructure_to_bottom.click();
        sleep();
    }

    //DATA GOVERNANCE
    @FindBy(xpath = "//div[@class='footer-widget']//a[contains(text(),' DATA GOVERNANCE') or contains(text(),' MƏLUMATLARIN İDARƏ EDİLMƏSİ')]")
    WebElement data_governance_to_bottom;

    public void press_data_governance_b() throws InterruptedException {
        sleep();
        data_governance_to_bottom.click();
        sleep();
    }

    //DATA VISUALISATION
    @FindBy(xpath = "//div[@class='footer-widget']//a[contains(text(),' DATA VISUALISATION') or contains(text(),' MƏLUMATLARIN VİZUALİZASİYASI')]")
    WebElement data_visualisation_to_bottom;

    public void press_data_visualisation_b() throws InterruptedException {
        sleep();
        data_visualisation_to_bottom.click();
        sleep();
    }

    //DATA SCIENCE
    @FindBy(xpath = "//div[@class='footer-widget']//a[contains(text(),' DATA SCIENCE') or contains(text(),' DATA ELMİ')]")
    WebElement data_science_to_bottom;

    public void press_data_science_b() throws InterruptedException {
        sleep();
        data_science_to_bottom.click();
        sleep();
    }

  //Information
    //About us
    @FindBy(xpath = "//div[@class='footer-widget']//a[contains(text(),' About us') or contains(text(),' Haqqımızda') or contains(text(),' О нас')]")
    WebElement about_us_btn_to_bottom;

    public void press_about_us_b() throws InterruptedException {
        sleep();
        about_us_btn_to_bottom.click();
        sleep();
    }

    //Our team
    @FindBy(xpath = "//div[@class='footer-widget']//a[contains(text(),' Our team') or contains(text(),' Komandamız') or contains(text(),' Наша команда')]")
    WebElement our_team_btn_to_bottom;

    public void press_our_team_b() throws InterruptedException {
        sleep();
        our_team_btn_to_bottom.click();
        sleep();
    }

    //Why choose us?
    @FindBy(xpath = "//div[@class='footer-widget']//a[contains(text(),' Why choose us? ') or contains(text(),' Niyə biz? ') or contains(text(),' Почему мы? ')]")
    WebElement why_us_btn_to_bottom;

    public void press_why_us_b() throws InterruptedException {
        sleep();
        why_us_btn_to_bottom.click();
        sleep();
    }

    //Latest Blogs
    @FindBy(xpath = "//div[@class='footer-widget']//a[contains(text(),' Latest Blogs') or contains(text(),' Son Bloqlar') or contains(text(),' Последние Блоги')]")
    WebElement latest_blogs_btn_to_bottom;

    public void press_latest_blogs_b() throws InterruptedException {
        sleep();
        latest_blogs_btn_to_bottom.click();
        sleep();
    }

  //LinkedIn under 'Follow us' section
    @FindBy(xpath = "//div[@class='footer-widget']//a[@href='https://az.linkedin.com/company/proodata']")
    public WebElement linkedin_btn_to_bottom;

    public void press_linkedin_b() throws InterruptedException {
        sleep();
        linkedin_btn_to_bottom.click();
        sleep();
    }
}
