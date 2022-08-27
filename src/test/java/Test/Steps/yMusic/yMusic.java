package Test.Steps.yMusic;

public class yMusic {

    Test.Pages.yMusic.yMusic yMusic;

    public void user_goto_youtube_music_login(){
        yMusic.open();
    }

    public void user_click_on_button_SIGN_IN(){
        yMusic.clickButtonSignIn();
    }

    public void user_fill_Email_or_phone_field_with(String email){
        yMusic.user_fill_Email_or_phone_field_with(email);
    }

    public void user_click_button_Next(){
        yMusic.clickButtonNext();
    }

    public void user_fill_Password_field(String password){
        yMusic.user_fill_Password_field(password);
    }

    public void user_should_be_directed_to_Beranda_page_youtube_music(){
        yMusic.verifyLoginUser();
    }

    public void user_click_on_play_music(){
        yMusic.clickOnMusicList();
    }

    public void music_should_be_playing(){
        yMusic.playingBarShouldBeShown();
    }

}
