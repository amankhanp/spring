import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
/*@CucumberOptions(
        glue={"com.epam.ivalua.stepdefinitions"},
        features="src/test/resources/features/initialization",
        monochrome=true)*/
@CucumberOptions(glue = "src/test/java/com/epam/ivalua/stepdefinitions",features = "src/test/resources/features/initialization")
@ContextConfiguration
//@ComponentScan("classpath:com.epam.ivalua")
@ComponentScan(basePackages = "com.epam.ivalua")
public class CucumberTestRunner {
}