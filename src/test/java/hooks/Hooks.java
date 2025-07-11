package hooks;
import java.io.IOException;
import BrowserSetup.BaseClass;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import propertyUtil.Property;

public class Hooks {                   

	@BeforeAll
	public static void OpenBrowser() throws IOException {
	 BaseClass.launchBrowser(Property.getProperty("browser"));
	 BaseClass.driver.get(Property.getProperty("url"));
	}

	@AfterAll
	public static void closeBrowser() {
	BaseClass.tearDown();
	}
}







//@Before, @After: Cucumber annotations that define hooks (code to run before/after each scenario).

//Scenario: Represents the current running Cucumber test scenario (can be used for logging or screenshots).

//@Before ensures this method runs before every test scenario.

//Scenario Cucumberscenario gives access to metadata about the scenario (e.g., name, tags, status).

