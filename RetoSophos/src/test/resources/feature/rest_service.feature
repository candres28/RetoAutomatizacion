Feature: Response from a rest service
  I as user of the application
  I need to guarantee the rest service
  to validate the value sent


  Scenario: Rest service
    Given user is on the home page
    When The user is consuming a rest service POST
      | firstname  | valuefirst    | lastname  | valuelastname | email | valueemail                | phone | valuephone | gender | valuegender |
      | first_name | Carlos Andres | last_name | Garcia        | email | carlosemail2020@gmail.com | phone | 789067     | gender | male        |
    Then the user observes the response the code 200