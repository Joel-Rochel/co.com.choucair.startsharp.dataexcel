package co.com.choucair.startsharp.dataexcel.runners;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import co.com.choucair.startsharp.dataexcel.util.BeforeSuite;
import co.com.choucair.startsharp.dataexcel.util.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;


@CucumberOptions (features = "src/test/resources/features/startsharp_automation.feature",
        tags= "@stories",
        glue = {"co.com.choucair.startsharp.dataexcel.stepdefinitions","co.com.choucair.startsharp.dataexcel.util"},
        snippets= SnippetType.CAMELCASE)
@RunWith(RunnerPersonalizado.class)

public class RunnerTags {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/startsharp_automation.feature");
    }
}
