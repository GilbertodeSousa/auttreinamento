package com.treinamento;

import com.treinamento.support.Web;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, tags = {"@ListarTodosOsInstrutoresPorCarreira"}, features = ".")
public class RunTest {
}
