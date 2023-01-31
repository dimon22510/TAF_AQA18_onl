Feature: Initial study test Cucumber

  Scenario: Simple test with  body

    Scenario: Simple test with Given
      Given open browser

      Scenario: Simple test with Given and When
        Given open browser
        When urlLoginPageOpened

      Scenario: Simple test with all the keywords
        Given open browser
        When urlLoginPageOpened
        Then usernameIsDisplayed

        Scenario: Using AND
          Given open browser
          And urlLoginPageOpened
          Then usernameIsDisplayed
          * passwordIsDisplayed


        Scenario: Using But
          Given open browser
          And urlLoginPageOpened
          Then usernameIsDisplayed
          But error is not displayed