#Please visit https://opensource-demo.orangehrmlive.com/index.php/dashboard
Feature: Test Orange HRM website

  Background: Given user is on login page
    Then login using userid: Admin and Password: admin123

  @Admin
  Scenario Outline: Verifying atleast 2 users
    Then user clicks on admin
    And user navigate to user management
    Then user clicks on users
    Then user enters <username>

    Examples: 
      | username |
      | Mubeen1  |
      | Raxil    |

  @Leave
  Scenario Outline: Verifying Employee name column
    Then user navigate to leave
    And user clicks on my leave
    Then user verify Employee Name column presence
