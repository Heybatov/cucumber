//package com.loop.pages;
//
//import com.loop.utilities.Driver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class NewClientPage {
//
//    @FindBy(xpath = "//label[.='Username or email']/following-sibling::input")
//    public WebElement usernameInput;
//
//    @FindBy(xpath = "//label[.='Password']/following-sibling::input")
//    public WebElement passwordInput;
//
//    @FindBy(xpath = "//button[@type='submit']")
//    public WebElement loginButton;
//
//    @FindBy(xpath = "//div[.='Clients']/div/span")
//    public WebElement clientButton;
//
//    @FindBy(xpath = "//button[.='Create new client']")
//    public WebElement createNewClient;
//
//    @FindBy(xpath = "//div[.='Personal']/div/div")
//    public WebElement personalButton;
//
//    @FindBy(xpath = "//label[.='First name']//following-sibling::input")
//    public WebElement firstNameNewClient;
//
//    @FindBy(xpath = "//label[.='Last name']//following-sibling::input")
//    public WebElement lastnameNewClient;
//
//
//    @FindBy(xpath = "//label[.='Create new user']")
//    public WebElement createNewClientCheckBox;
//
//    @FindBy(xpath = "//label[.='Email address']//following-sibling::input")
//    public WebElement emailNewClient;
//
//    @FindBy(xpath = "//label[.='Advisor']/..")
//    public WebElement advisorDropdown;
//
////    @FindBy(xpath = "//div[.='Batch1 Group2']/div/div")
////    public WebElement batch1Group2;
//
//    @FindBy(xpath = "//label[.='Phone number']//following-sibling::input")
//    public WebElement phoneNumber;
//
//    @FindBy(xpath = "//label[.='Password']//following-sibling::input")
//    public WebElement passwordNewCLient;
//
//    @FindBy(xpath = "//label[.='Confirm password']//following-sibling::input")
//    public WebElement confirmPasswordNewClient;
//
//    @FindBy(xpath = "//button[@type='submit']")
//    public WebElement saveButton;
//
//    @FindBy(xpath = "//span[.='Spanch Bob has been created successfully']")
//    public WebElement verifyClientCreating;
//
//    @FindBy(xpath = "//label[.='Advisor']/..")
//    public WebElement advisorDropdown1;
//
//    @FindBy(xpath = "(//div[.='Batch1 Group2'])[2]")
//    public WebElement batch1Group21;
//
//    @FindBy(xpath = "//label[.='Services']//following-sibling::div")
//    public WebElement serviceButton;
//
//    @FindBy(xpath = "(//div[.='Consultancy']/../../div)[4]")
//    public WebElement consultancyButton;
//
//    @FindBy(xpath = "//span[.=' Save ']")
//    public WebElement saveEnd;
//
//    @FindBy(xpath = "//span[.='Spanch Bob has been updated successfully']")
//    public WebElement successMessage;
//
//    @FindBy(xpath = "(//span[.='Batch1 Group2'])[1]")
//    public WebElement bGButton;
//
//    @FindBy(xpath = "//span[.='Log out']")
//    public WebElement logOut;
//
//    @FindBy(xpath = "//span[.='Home']")
//    public WebElement homeButton;
//
//
//    public NewClientPage() {
//        PageFactory.initElements(Driver.getDriver(), this);
//    }
//}