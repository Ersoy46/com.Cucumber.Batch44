package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMCPage {
    public HMCPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='details-button']")
    public WebElement spamGelişmişTuşu;

    @FindBy(xpath = "//a[@id='proceed-link']")
    public WebElement spamYenidenDeneSekmesi;
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement mainPageLoginTuşu;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement başarılıGirişYazisi;


    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girişYapılamadıElementi;



}
