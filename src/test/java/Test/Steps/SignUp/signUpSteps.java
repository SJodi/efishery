package Test.Steps.SignUp;

import Test.Pages.SignUp.signUpPages;

public class signUpSteps {

    signUpPages signUpPages;


    public void user_open_cermati_page(){
        signUpPages.open();
    };

    public void user_click_on_menu_daftar(){
        signUpPages.clickMenuDaftar();
    }

    public void sign_up_pages_will_be_shown(){
        signUpPages.assertSingUpPages();
    }


    public void user_click_daftar_without_any_input_on_field_register(){
        signUpPages.clickButtonDaftar();
    }

    public void alert_is_shown_alert_email_and_alert_Mobile_Phone_and_alert_Password_and_alert_Confirm_Password_and_alert_First_Name_and_alert_Last_Name_and_alert_City_and_password_note(String alertEmail, String alertMobilePhone, String alertPassword, String alertConfirmPassword, String alertFirstName, String  alertLastName ,String alertCity, String passwordNote){
        signUpPages.assertInvalidAlerts(alertEmail, alertMobilePhone, alertPassword, alertConfirmPassword, alertFirstName, alertLastName, alertCity, passwordNote);
    }

    public void user_fill_fields_email_and_Mobile_Phone_and_Password_and_Confirm_Password_and_First_Name_and_Last_Name_and_City(String emailOrPhone, String mobilePhone, String Password, String ConfirmPassword, String FirstName, String LastName, String City){
        signUpPages.inputSingUpFields(emailOrPhone, mobilePhone, Password, ConfirmPassword, FirstName, LastName, City);
    }

    public void click_button_Daftar(){
        signUpPages.clickButtonDaftar();
    }

    public void user_will_be_shown_OTP_verification_page(){
        signUpPages.validateOTPPage();
    }


    public void user_goto_youtube_music_login(){
        signUpPages.open();
    }

    public void user_click_on_button_SIGN_IN(){
        signUpPages.clickButtonSignIn();
    }

    public void user_fill_Email_or_phone_field_with(String email){
        signUpPages.user_fill_Email_or_phone_field_with(email);
    }

    public void user_click_button_Next(){
        signUpPages.clickButtonNext();
    }

    public void user_fill_Password_field(String password){
        signUpPages.user_fill_Password_field(password);
    }

    public void user_should_be_directed_to_Beranda_page_youtube_music(){
        signUpPages.verifyLoginUser();
    }

    public void user_click_on_play_music(){
        signUpPages.clickOnMusicList();
    }

    public void music_should_be_playing(){
        signUpPages.playingBarShouldBeShown();
    }

}
