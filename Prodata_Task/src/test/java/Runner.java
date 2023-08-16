import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"Steps"},
        //tags = "@test7",
        tags = "@test1 or @test2 or @test3 or @test4 or @test5 or @test6 or @test7",
        plugin = {"pretty","html:target/cucumber-reports/report.html"},
        monochrome = true
)
public class Runner {
    @AfterClass
    public static void writeExtentReport(){
        System.out.println("The test execution is completed, and the extent report has been generated successfully.");
    }
}
