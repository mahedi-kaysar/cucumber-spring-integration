package com.mahedikaysar.demo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = CAMELCASE,
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json"})
public class DemoKafkaEventIntegrationTest {
}
