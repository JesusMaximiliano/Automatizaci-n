Feature: Login

  Scenario Outline: Login succesful
    Given Opens browser
    And User is in the login
    When User valid user <username> and <password>
    And Clics login button
    Then User is directed home page

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
