@signUp
Feature: Sign Up
  As a user
  I want to sign up into cermati
  So that i can create new user

  @TestCase01
  Scenario: Verify success login user free
    Given user goto youtube music login
    When user click on button SIGN IN
    And user fill Email or phone field with "free@gmail.com"
    And user click button Next
    And user fill Password field "password@123"
    And user click button Next
    Then user should be directed to Beranda page youtube music

  @TestCase02
  Scenario: Verify success login user premium
    Given user goto youtube music login
    When user click on button SIGN IN
    And user fill Email or phone field with "premium@gmail.com"
    And user click button Next
    And user fill Password field "password@123"
    And user click button Next
    Then user should be directed to Beranda page youtube music

  @TestCase03
  Scenario: Verify success play music for guest
    Given user goto youtube music page
    When user click on play music
    Then music should be playing

