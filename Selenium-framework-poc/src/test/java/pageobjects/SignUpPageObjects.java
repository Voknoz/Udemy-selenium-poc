package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WrapsDriver;

public class SignUpPageObjects {
    private WebDriver driver;

    public SignUpPageObjects(WebDriver driver){
        this.driver = driver;

    }

    private By firstName = By.xpath("//*[@ng-model = 'FirstName']");
    private By lastName = By.xpath("//*[@ng-model = 'LastName']");
    private By address = By.xpath("//*[@ng-model = 'Adress']");
    private By emailAdress = By.xpath("//*[@ng-model = 'EmailAdress']");
    private By phone = By.xpath("//*[@ng-model = 'Phone']");
    private By genderMale = By.xpath("//*[@value = 'Male']");
    private By genderFemale = By.xpath("//*[@value = 'FeMale']");
    private By movies = By.xpath("//*[@value = 'Movies']");
    private By languagesDropList = By.xpath("//*[@id= 'msdd']");
    private By language = By.xpath("//*[contains(text(), 'Spanish')]");
    private By skillsDropList = By.id("Skills");
    private By skills = By.xpath("//*[@value ='Java']");
    private By selectCountryDropList = By.xpath("//input[@type='search']");
    private By selectCountryTextBox = By.xpath("//input[@type='search']");

    public void go(String url){
        this.driver.get(url);
    }
    public void writeFirstName(String firstname){
        this.driver.findElement(this.firstName).sendKeys(firstname);
    }
    public void writeLastName(String lastName){
        this.driver.findElement(this.lastName).sendKeys(lastName);
    }
    public void writeAddress(String address){
        this.driver.findElement(this.address).sendKeys(address);
    }
    public void writeEmailAdress(String emailAdress){
        this.driver.findElement(this.emailAdress).sendKeys(emailAdress);
    }
    public void writePhone(String phone){
        this.driver.findElement(this.phone).sendKeys(phone);
    }
    public void writeGenderMale(){
        this.driver.findElement(this.genderMale).click();
    }
    public void writeGenderFemale(){
        this.driver.findElement(this.genderFemale).click();
    }
    public void selectMovies(){
        this.driver.findElement(this.movies).click();
    }
    public void selectLanguages(){
        this.driver.findElement(this.languagesDropList).click();
        this.driver.findElement(this.language).click();
    }
    public void selectSkillsDropList(){
        this.driver.findElement(this.skillsDropList).click();
        this.driver.findElement(this.skills).click();
    }






}
