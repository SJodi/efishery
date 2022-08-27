package Test.Tests.SignUp;

import Test.Steps.SignUp.signUpSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;

public class signUp {

    @Steps
    signUpSteps signUpSteps;

    @Given("user open cermati page")
    public void user_open_cermati_page() {
        signUpSteps.user_open_cermati_page();
    }

    @When("user click on menu 'daftar'")
    public void user_click_on_menu_daftar() {
        signUpSteps.user_click_on_menu_daftar();
    }

    @Then("sign up pages will be shown")
    public void sign_up_pages_will_be_shown() {
        signUpSteps.sign_up_pages_will_be_shown();
    }

    @Given("user on sign up page")
    public void user_on_sign_up_page() {
        signUpSteps.user_open_cermati_page();
        signUpSteps.user_click_on_menu_daftar();
        signUpSteps.sign_up_pages_will_be_shown();
    }

    @When("user click daftar without any input on field register")
    public void user_click_daftar_without_any_input_on_field_register() {
        signUpSteps.user_click_daftar_without_any_input_on_field_register();
    }

    @Then("alert is shown alert email {string} and alert Mobile Phone {string} and alert Password {string} and alert Confirm Password {string} and alert First Name {string} and alert Last Name {string} and alert City {string} and password note {string}")
    public void alert_is_shown_alert_email_and_alert_Mobile_Phone_and_alert_Password_and_alert_Confirm_Password_and_alert_First_Name_and_alert_Last_Name_and_alert_City_and_password_note(String alertEmail, String alertMobilePhone, String alertPassword, String alertConfirmPassword, String alertFirstName, String  alertLastName ,String alertCity, String passwordNote) {
        signUpSteps.alert_is_shown_alert_email_and_alert_Mobile_Phone_and_alert_Password_and_alert_Confirm_Password_and_alert_First_Name_and_alert_Last_Name_and_alert_City_and_password_note(alertEmail, alertMobilePhone, alertPassword, alertConfirmPassword, alertFirstName, alertLastName, alertCity, passwordNote);
    }

    @Given("user fill fields email {string} and Mobile Phone {string} and Password {string} and  Confirm Password {string} and First Name {string} and Last Name {string} and City {string}")
    public void user_fill_fields_email_and_Mobile_Phone_and_Password_and_Confirm_Password_and_First_Name_and_Last_Name_and_City(String email, String mobilePhone, String Password, String ConfirmPassword, String FirstName, String LastName, String City) {
        signUpSteps.user_fill_fields_email_and_Mobile_Phone_and_Password_and_Confirm_Password_and_First_Name_and_Last_Name_and_City(email, mobilePhone, Password, ConfirmPassword, FirstName, LastName, City);
    }

    @Given("user click button 'Daftar'")
    public void user_click_button_Daftar() {
        signUpSteps.click_button_Daftar();
    }

    @Then("user will be shown OTP verification page")
    public void user_will_be_shown_OTP_verification_page() {
        signUpSteps.user_will_be_shown_OTP_verification_page();
    }


    @Given("user goto youtube music login")
    public void user_goto_youtube_music_login() {
        signUpSteps.user_goto_youtube_music_login();
    }

    @When("user click on button SIGN IN")
    public void user_click_on_button_SIGN_IN() {
        signUpSteps.user_click_on_button_SIGN_IN();
    }

    @When("user fill Email or phone field with {string}")
    public void user_fill_Email_or_phone_field_with(String email) {
        signUpSteps.user_fill_Email_or_phone_field_with(email);
    }

    @When("user click button Next")
    public void user_click_button_Next() {
        signUpSteps.user_click_button_Next();
    }

    @When("user fill Password field {string}")
    public void user_fill_Password_field(String password) {
        signUpSteps.user_fill_Password_field(password);
    }

    @Then("user should be directed to Beranda page youtube music")
    public void user_should_be_directed_to_Beranda_page_youtube_music() {
        signUpSteps.user_should_be_directed_to_Beranda_page_youtube_music();
    }

    @Given("user goto youtube music page")
    public void user_goto_youtube_music_page() {
        signUpSteps.user_goto_youtube_music_login();
    }

    @When("user click on play music")
    public void user_click_on_play_music() {
        signUpSteps.user_click_on_play_music();
    }

    @Then("music should be playing")
    public void music_should_be_playing() {
        signUpSteps.music_should_be_playing();
    }


}
