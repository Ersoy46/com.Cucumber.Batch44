package pages;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;
import java.security.PublicKey;

public class EditörPage {
    public EditörPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButonu;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firsnameBox;

    @FindBy(xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastnameBox;

    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement pozitionBox;

    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public WebElement officeBox;

    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extensiontBox;

    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDateBox;

    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salaryBox;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createTusuBox;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBoxElement;


    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement aramaSonucuElement;


}
