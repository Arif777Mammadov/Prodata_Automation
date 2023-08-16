package Steps;

import Driver.Driver;
import Elements.GeneralElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Prodata {

    protected WebDriver chrome = Driver.getDriver();

    @Given("Go to prodata.az")
    public void goToProdata(){
        chrome.get("https://prodata.az");
    }

    GeneralElements g_elem = new GeneralElements(chrome);
    JavascriptExecutor js = (JavascriptExecutor) chrome;

    public String location = "Main";


    @When("Click language selection button")
    public void clickLanguageSelectionButton() throws InterruptedException {
        g_elem.press_lang_sel();
    }

    @And("Choose desired language")
    public void chooseDesiredLanguage() throws InterruptedException {
        g_elem.choose_lang();
    }

    @Then("Click Baku phone number")
    public void clickBakuPhoneNumber() throws InterruptedException {
        g_elem.press_baku_tel();
    }

    @Then("Click Tel-Aviv phone number")
    public void clickTelAvivPhoneNumber() throws InterruptedException {
        g_elem.press_telaviv_tel();
    }

    @Then("Click on Logo")
    public void clickOnLogo() throws InterruptedException {
        location = g_elem.press_logo();
    }


    @Then("Watch opened page")
    public void watchOpenedPage() throws InterruptedException {
        switch (location){
            case "Main":
                //7200px
                for(int i = 1; i < 10; i++){
                    Thread.sleep(1000);
                    js.executeScript("window.scrollBy(0, 800)");
                }
                break;
            case "AboutUs":
                //6600px
                for(int i = 1; i < 9; i++){
                    Thread.sleep(1000);
                    js.executeScript("window.scrollBy(0, 800)");
                }
                break;
            case "WhyUs":
                //2600px
                for(int i = 1; i < 4; i++){
                    Thread.sleep(1000);
                    js.executeScript("window.scrollBy(0, 800)");
                }
                break;
            case "SocialMedia":
                for(int i = 1; i < 8; i++){
                    Thread.sleep(1000);
                    js.executeScript("window.scrollBy(0, 800)");
                }
                break;
            case "Blog":
                for(int i = 1; i < 4; i++){
                    Thread.sleep(1000);
                    js.executeScript("window.scrollBy(0, 750)");
                }
                break;
            case "ContactUs":
                for(int i = 1; i < 5; i++){
                    Thread.sleep(1000);
                    js.executeScript("window.scrollBy(0, 800)");
                }
                break;
            case "DS page":
                for(int i = 1; i < 3; i++){
                    Thread.sleep(1000);
                    js.executeScript("window.scrollBy(0, 750)");
                }
                break;
            case "Blog1":
                for(int i = 1; i < 5; i++){
                    Thread.sleep(1000);
                    js.executeScript("window.scrollBy(0, 700)");
                }
                break;
        }
    }

    @Then("Click on Home button")
    public void clickOnHomeButton() throws InterruptedException {
        location = g_elem.press_home();
    }

    @Then("Click on About Us")
    public void clickOnAboutUs() throws InterruptedException {
        location = g_elem.press_about_us();
    }

    @Then("Click on Why Us")
    public void clickOnWhyUs() throws InterruptedException {
        location = g_elem.press_why_us();
    }

    @Then("Click on Social Media")
    public void clickOnSocialMedia() throws InterruptedException {
        location = g_elem.press_soc_media();
    }

    @Then("Click on Blog")
    public void clickOnBlog() throws InterruptedException {
        location = g_elem.press_blog();
    }

    @Then("Click on Contact Us")
    public void clickOnContactUs() throws InterruptedException {
        location = g_elem.press_contact_us();
    }

    @Then("Check LinkedIn profile")
    public void checkLinkedInProfile() throws InterruptedException {
        g_elem.press_linkedin();
    }

    //Bottom Side Elements
    @Then("Click on bottom logo")
    public void clickOnBottomLogo() throws InterruptedException {
        location = g_elem.press_logo_b();
    }

    @Then("Click on Baku phone number on bottom side")
    public void clickOnBakuPhoneNumberOnBottomSide() throws InterruptedException {
        g_elem.press_baku_tel_b();
    }

    @And("Click on Tel-Aviv phone number on bottom side")
    public void clickOnTelAvivPhoneNumberOnBottomSide() throws InterruptedException {
        g_elem.press_telaviv_tel_b();
    }

    @And("Click on email address on bottom side")
    public void clickOnEmailAddressOnBottomSide() throws InterruptedException {
        g_elem.press_email_b();
    }

    @Then("Click on Data Analysis on bottom side")
    public void clickOnDataAnalysisOnBottomSide() throws InterruptedException {
        g_elem.press_data_analysis_b();
    }

    @And("Scroll to the bottom")
    public void scrollToTheBottom() throws InterruptedException {
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);", g_elem.linkedin_btn_to_bottom);
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -170)");

    }

    @Then("Click on Data Engineering on bottom side")
    public void clickOnDataEngineeringOnBottomSide() throws InterruptedException {
        g_elem.press_data_engineering_b();
    }

    @Then("Click on IT Infrastructure on bottom side")
    public void clickOnITInfrastructureOnBottomSide() throws InterruptedException {
        g_elem.press_it_infrastructure_b();
    }

    @Then("Click on Data Governance on bottom side")
    public void clickOnDataGovernanceOnBottomSide() throws InterruptedException {
        g_elem.press_data_governance_b();
    }

    @Then("Click on Data Visualisation on bottom side")
    public void clickOnDataVisualisationOnBottomSide() throws InterruptedException {
        g_elem.press_data_visualisation_b();
    }

    @Then("Click on Data Science on bottom side")
    public void clickOnDataScienceOnBottomSide() throws InterruptedException {
        g_elem.press_data_science_b();
    }

    @Then("Click on About Us on bottom side")
    public void clickOnAboutUsOnBottomSide() throws InterruptedException {
        g_elem.press_about_us_b();
    }

    @Then("Click on Our Team on bottom side")
    public void clickOnOurTeamOnBottomSide() throws InterruptedException {
        g_elem.press_our_team_b();
    }

    @Then("Click on Why Us on bottom side")
    public void clickOnWhyUsOnBottomSide() throws InterruptedException {
        g_elem.press_why_us_b();
    }

    @Then("Click on Latest Blogs on bottom side")
    public void clickOnLatestBlogsOnBottomSide() throws InterruptedException {
        g_elem.press_latest_blogs_b();
    }

    @Then("Click on LinkedIn link on bottom side")
    public void clickOnLinkedInLinkOnBottomSide() throws InterruptedException {
        g_elem.press_linkedin_b();
    }

    //Home page
    @When("Click on Shedule Meeting")
    public void clickOnSheduleMeeting() throws InterruptedException {
        g_elem.h_page.press_shedule_meeting();
    }

    @Then("Click on one of Blogs")
    public void clickOnOneOfBlogs() throws InterruptedException {
        g_elem.h_page.press_blog_to_right();
    }

    @Then("Click on Data Governance")
    public void clickOnDataGovernance() throws InterruptedException {
        g_elem.h_page.press_data_governance();
    }

    @Then("Click on Show All button")
    public void clickOnShowAllButton() throws InterruptedException {
        g_elem.h_page.press_show_all();
    }

    @Then("Click on right arrow in Our Partners section")
    public void clickOnRightArrowInOurPartnersSection() throws InterruptedException {
        g_elem.h_page.press_arrow_right();
    }

    @Then("Click on Agritask")
    public void clickOnAgritask() throws InterruptedException {
        g_elem.h_page.press_agritask();
    }

    //About Us page
    @Then("Click on Home button under About Us")
    public void clickOnHomeButtonUnderAboutUs() throws InterruptedException {
        g_elem.a_elem.press_home_btn();
    }

    @Then("Click on Baku phone number on About Us page")
    public void clickOnBakuPhoneNumberOnAboutUsPage() throws InterruptedException {
        g_elem.a_elem.press_Baku_tel();
    }

    @Then("Click on Tel-Aviv phone number on About Us page")
    public void clickOnTelAvivPhoneNumberOnAboutUsPage() throws InterruptedException {
        g_elem.a_elem.press_TelAviv_tel();
    }

    @Then("Click on Contact Us on About Us page")
    public void clickOnContactUsOnAboutUsPage() throws InterruptedException {
        g_elem.a_elem.press_Contact_us();
    }

    @Then("Click on News")
    public void clickOnNews() throws InterruptedException {
        g_elem.a_elem.press_news_btn();
    }

    @Then("Click on Go Back button")
    public void clickOnGoBackButton() throws InterruptedException {
        g_elem.a_elem.go_back();
    }

    //Why Us page
    @Then("Click on Home button under Why Us")
    public void clickOnHomeButtonUnderWhyUs() throws InterruptedException {
        g_elem.w_elem.press_home_btn();
    }

    @Then("Click on Data Science")
    public void clickOnDataScience() throws InterruptedException {
        location = g_elem.w_elem.press_data_science();
    }

    @Then("Click on Next button on Data Science page")
    public void clickOnNextButtonOnDataSciencePage() throws InterruptedException {
        g_elem.w_elem.press_next_btn();
    }

    //Social Media
    @Then("Click on Home button under Social Media")
    public void clickOnHomeButtonUnderSocialMedia() throws InterruptedException {
        g_elem.s_elem.press_home_btn();
    }

    @Then("Watch post about Jafar Isbarov")
    public void watchPostAboutJafarIsbarov() throws InterruptedException {
        g_elem.s_elem.view_desired_post();
    }

    @Then("Click on Next button under Posts")
    public void clickOnNextButtonUnderPosts() throws InterruptedException {
        g_elem.s_elem.press_next_btn();
    }

    //Blog
    @Then("Click on Home button under Blog")
    public void clickOnHomeButtonUnderBlog() throws InterruptedException {
        g_elem.b_elem.press_home_btn();
    }

    @Then("Click on Baku phone number on Blog page")
    public void clickOnBakuPhoneNumberOnBlogPage() throws InterruptedException {
        g_elem.b_elem.press_Baku_tel();
    }

    @Then("Click on Tel-Aviv phone number on Blog page")
    public void clickOnTelAvivPhoneNumberOnBlogPage() throws InterruptedException {
        g_elem.b_elem.press_TelAviv_tel();
    }

    @Then("Click on Contact Us on Blog page")
    public void clickOnContactUsOnBlogPage() throws InterruptedException {
        g_elem.b_elem.press_Contact_us();
    }

    @Then("Click on blog on right side")
    public void clickOnBlogOnRightSide() throws InterruptedException {
        location = g_elem.b_elem.press_on_blog();
    }

    @Then("Click on Next button")
    public void clickOnNextButton() throws InterruptedException {
        g_elem.b_elem.press_next_btn();
    }

    //Contact Us
    @Then("Click on Home button under Contact Us")
    public void clickOnHomeButtonUnderContactUs() throws InterruptedException {
        g_elem.c_elem.press_home_btn();
    }

    @Then("Click on Baku phone number on Contact Us page")
    public void clickOnBakuPhoneNumberOnContactUsPage() throws InterruptedException {
        g_elem.c_elem.press_Baku_tel();
    }

    @Then("Click on Tel-Aviv phone number on Contact Us page")
    public void clickOnTelAvivPhoneNumberOnContactUsPage() throws InterruptedException {
        g_elem.c_elem.press_TelAviv_tel();
    }

    @Then("Click on email address on Contact Us page")
    public void clickOnEmailAddressOnContactUsPage() throws InterruptedException {
        g_elem.c_elem.press_email();
    }

    @Then("Click on Submit button")
    public void clickOnSubmitButton() throws InterruptedException {
        g_elem.c_elem.submit_letter();
    }

    @Then("Fill in Name section")
    public void fillInNameSection() throws InterruptedException {
        g_elem.c_elem.fill_in_name();
    }

    @Then("Fill in Email section")
    public void fillInEmailSection() throws InterruptedException {
        g_elem.c_elem.fill_in_email();
    }

    @Then("Fill in Subject section")
    public void fillInSubjectSection() throws InterruptedException {
        g_elem.c_elem.fill_in_subject();
    }

    @Then("Fill in Question section")
    public void fillInQuestionSection() throws InterruptedException {
        g_elem.c_elem.fill_in_question();
    }

    @Then("Lower scale of map")
    public void lowerScaleOfMap() throws InterruptedException {
        g_elem.c_elem.lower_map_scale();
    }

    //Home and About Us pages' element
    @Then("Click on member's LinkedIn profile")
    public void clickOnMemberSLinkedInProfile() throws InterruptedException {
        g_elem.h_page.press_LinkedIn_profile();
    }

    //Closing Browser after every Scenario
    @Then("Close Browser")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(9000);
        chrome.quit();
        Thread.sleep(10000);
    }
}