package com.omrbranch.runner;

import org.junit.runner.RunWith;

import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Explore",snippets = SnippetType.CAMELCASE, features = "src\\test\\resources",  glue = "com.stepdefination")

public class TestRunnerClass {
	
	}
