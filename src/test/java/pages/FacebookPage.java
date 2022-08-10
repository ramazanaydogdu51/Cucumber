package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    //cons olustur


    public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(),this);
        //bu classdaki driver  Driver.getDriver() dedi
    }
    @FindBy(xpath = "//input[@type=\"text\"]")
    public WebElement mailKutusu;

    @FindBy(xpath = "//input[@type=\"password\"]")
    public WebElement sifreKutusu;

    @FindBy(xpath = "//button[@name=\"login\"]")
    public WebElement loginTusu;

    @FindBy(xpath = "//div[@class=\"_9ay7\"]")
    public WebElement hataYazisi;

}
