@Book_appointment
Feature: User appointment

  @Tokyocura
  Scenario Outline: User should be able to book appointment for Tokyo facility
    Given User logs into system succesfully
    When User selects <Facility> details
    And clicks on submit
    Then Appointment should be created succesfully

    Examples: 
      | Facility                        |
      | Tokyo CURA Healthcare Center    |
      | Hongkong CURA Healthcare Center |
      | Seoul CURA Healthcare Center    |
