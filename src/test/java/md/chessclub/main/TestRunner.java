package md.chessclub.main;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"md/chessclub/stepDef"},
        features = {"src/test/features"},
        snippets = SnippetType.CAMELCASE,
        plugin = {"pretty", "html:target/cucumber"})
public class TestRunner {
}
