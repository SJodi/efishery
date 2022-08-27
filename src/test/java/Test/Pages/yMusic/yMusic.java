package Test.Pages.yMusic;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class yMusic extends PageObject {

    @FindBy(xpath = "//a[contains(.,'Sign in')]") WebElement signInButton;
    public void clickButtonSignIn(){
        element(signInButton).click();
    }

    @FindBy(xpath = "//input[@id='identifierId']") WebElement gMailField;
    public void user_fill_Email_or_phone_field_with(String email){
        element(gMailField).waitUntilVisible();
        element(gMailField).sendKeys(email);
    }

    @FindBy(xpath = "//span[.='Next']") WebElement buttonNext;
    public void clickButtonNext(){
        element(buttonNext).waitUntilClickable();
        element(buttonNext).click();
    }

    @FindBy(xpath = "//input[@name='password']") WebElement passwordField;
    public void user_fill_Password_field(String password){
        element(gMailField).waitUntilVisible();
        element(gMailField).sendKeys(password);
    }

    @FindBy(xpath = "//div[@id='right-content']") WebElement profileIcon;
    public void verifyLoginUser(){
        element(profileIcon).shouldBeVisible();
    }

    @FindBy(xpath = "//ytmusic-responsive-list-item-renderer[1]//div[@class='title-column style-scope ytmusic-responsive-list-item-renderer']") WebElement quickPicks;
    public void clickOnMusicList(){
        element(quickPicks).waitUntilVisible();
        element(quickPicks).click();
    }

    @FindBy(xpath = "//ytmusic-player-bar[@class='style-scope ytmusic-app']") WebElement musicBar;
    @FindBy(xpath = "//tp-yt-paper-icon-button[@id='play-pause-button']/tp-yt-iron-icon[@id='icon']") WebElement pauseButton;
    @FindBy(xpath = "//tp-yt-paper-icon-button[@class='previous-button style-scope ytmusic-player-bar']") WebElement previousButton;
    @FindBy(xpath = "//tp-yt-paper-icon-button[@class='next-button style-scope ytmusic-player-bar']") WebElement fastFowardButton;
    public void playingBarShouldBeShown(){
        element(musicBar).waitUntilVisible();
        Assert.assertTrue(musicBar.isDisplayed());
        Assert.assertTrue(pauseButton.isDisplayed());
        Assert.assertTrue(previousButton.isDisplayed());
        Assert.assertTrue(fastFowardButton.isDisplayed());
    }
}