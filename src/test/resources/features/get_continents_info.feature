#Author: gestionEquipajes
  #lenguage: en

  Feature: As user I want to know the continents names so that I can know more about the world
    Scenario: get continents names
      Given the user is connected to the service
      When the user gets the continents information
      Then the user can see the continents names










