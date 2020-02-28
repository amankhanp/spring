import com.epam.ivalua.utilities.TestConfiguration;
import com.epam.ivalua.utilities.WebDriverManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue={"com.epam.ivalua.stepdefinitions"},
        features="src/test/resources/features/initialization"
        /*plugin={"pretty", "html:target/html"},
        monochrome=true*/
)
//@ContextConfiguration()
@ComponentScan(
        basePackages = {"com.epam.ivalua.utilities", "com.epam.ivalua.pagesteps", "com.epam.ivalua.wrappers"}
)
/*@ComponentScan(
        basePackages = {
                "com.epam.ivalua.pagesteps",
                "com.epam.ivalua.utilities",
                "com.epam.ivalua.wrappers"
        },
        basePackageClasses = TestConfiguration.class
)*/
public class CucumberTestRunner {
}