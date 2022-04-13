package com.selenium;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelenium {

    private String myDriver = "webdriver.chrome.driver";
    private String myPath = "C:\\Program Files\\Java\\chromedriver.exe";
    private String website = "http://localhost:9999";
    private int wait;

    WebDriver driver;
    public MySelenium(){
        // declaration and instantiation of objects/variables
        System.setProperty(this.myDriver, this.myPath);
        this.driver=new ChromeDriver();

        // Launch website
        this.driver.navigate().to(this.website);
    }
    public void inputFieldById(String selector, String txt){
        this.driver.findElement(By.id(selector)).sendKeys(txt);
    }
    public void inputFieldByName(String selector, String txt){
        this.driver.findElement(By.name(selector)).sendKeys(txt);
    }
    public void inputFieldByXpath(String selector, String txt){
        this.driver.findElement(By.xpath(selector)).sendKeys(txt);
    }
    public void buttonById(String selector){
        this.driver.findElement(By.id(selector)).click();
    }
    public void buttonByName(String selector){
        this.driver.findElement(By.name(selector)).click();
    }
    public void buttonByXpath(String selector){
        this.driver.findElement(By.xpath(selector)).click();
    }
    public void linkById(String selector){
        this.driver.findElement(By.id(selector)).click();
    }
    public void linkByName(String selector){
        this.driver.findElement(By.name(selector)).click();
    }
    public void linkByXpath(String selector){
        this.driver.findElement(By.xpath(selector)).click();
    }
    public void navigateToBrand(String selector){
        this.driver.navigate().to("http://localhost:9999/marki.html");

    }
    public void navigateToModel(String selector){
        this.driver.navigate().to("http://localhost:9999/modeli.html");
    }

    public void navigateToHome(String selector){
        this.driver.navigate().to("http://localhost:9999/index.html");
    }


    public String getTextById(String selector) {
        String txt=this.driver.findElement(By.id(selector)).getText();
        return txt;
    }
    public String getTextByName(String selector) {
        String txt=this.driver.findElement(By.name(selector)).getText();
        return txt;
    }
    public String getTextByXpath(String selector) {
        String txt=this.driver.findElement(By.xpath(selector)).getText();
        return txt;
    }



}
