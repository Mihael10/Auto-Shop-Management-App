package com.selenium;

import org.openqa.selenium.WebDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeleniumApplication {



	public static void main(String[] args) {
		SpringApplication.run(SeleniumApplication.class, args);
	}
		SeleniumMarki seleniumMarki = new SeleniumMarki();



	public void setSeleniumMarki(SeleniumMarki seleniumMarki) {
		this.seleniumMarki = seleniumMarki;
	}

	public SeleniumMarki getSeleniumMarki() {
		return seleniumMarki;
	}



}
