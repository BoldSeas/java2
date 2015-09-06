Feature: Login

Scenario: Login Successfully
  Given I visit "/"
  And I click on "Sign in"
  Then I will see "Please Sign In"
  When I fill in "inputEmail" with "user"
  And I fill in "inputPassword" with "demo"
  And I click on "Sign in"
  Then I will see "Welcome to the Spring MVC Quickstart application!"
  And I will see "Logout"

Scenario: Login Fail
  Given I visit "/"
  And I click on "Sign in"
  Then I will see "Please Sign In"
  When I fill in "inputEmail" with "tom"
  And I fill in "inputPassword" with "any_password"
  And I click on "Sign in"
  Then I will see "Sign in error. Please try again."
  And I will see "Sign Up"

Scenario: Sign up Fail
  Given I visit "/signup"
  And I click on "Sign up"
  Then I will see "Form contains errors. Please try again."

Scenario: Sign up Successfully
  Given I visit "/signup"
  When I fill in "email" with "jerry@126.com"
  And I fill in "password" with "jerry000"
  And I click on "Sign up"
  Then I will see "Congratulations jerry@126.com! You have successfully signed up."