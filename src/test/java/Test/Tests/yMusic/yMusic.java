package Test.Tests.yMusic;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class yMusic {

    @Steps
    Test.Steps.yMusic.yMusic yMusic;

    @Given("user goto youtube music login")
    public void user_goto_youtube_music_login() {
        yMusic.user_goto_youtube_music_login();
    }

    @When("user click on button SIGN IN")
    public void user_click_on_button_SIGN_IN() {
        yMusic.user_click_on_button_SIGN_IN();
    }

    @When("user fill Email or phone field with {string}")
    public void user_fill_Email_or_phone_field_with(String email) {
        yMusic.user_fill_Email_or_phone_field_with(email);
    }

    @When("user click button Next")
    public void user_click_button_Next() {
        yMusic.user_click_button_Next();
    }

    @When("user fill Password field {string}")
    public void user_fill_Password_field(String password) {
        yMusic.user_fill_Password_field(password);
    }

    @Then("user should be directed to Beranda page youtube music")
    public void user_should_be_directed_to_Beranda_page_youtube_music() {
        yMusic.user_should_be_directed_to_Beranda_page_youtube_music();
    }

    @Given("user goto youtube music page")
    public void user_goto_youtube_music_page() {
        yMusic.user_goto_youtube_music_login();
    }

    @When("user click on play music")
    public void user_click_on_play_music() {
        yMusic.user_click_on_play_music();
    }

    @Then("music should be playing")
    public void music_should_be_playing() {
        yMusic.music_should_be_playing();
    }


}
