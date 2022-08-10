Feature: Verifing Adactin Hotel Details

  Scenario Outline: Verifin Adactin Hotel login with valid data
    Given User on the Adactin Hotel page
    When User should login "<userName>" and "<password>"
    Then User should verify success message
    And User should Search hotels "<location>","<hotel>","<roomType>","<numOfRooms>","<adultsPerRoom>" and "<childrenperRoom>"
    Then User should verify select hotel
    Then User should selecthotel
    Then user should verify Book a Hotel Page
    Then User Should  book the hotel "<firstName>","<lastName>","<address>","<creditCardNo>","<creditCardType>","<expMonth>","<exYear>" and "<cvvNo>"

    Examples: 
      | userName         | password    | location  | hotel          | roomType     | numOfRooms | adultsPerRoom | childrenperRoom | firstName | lastName | address      | creditCardNo     | creditCardType   | expMonth | exYear | cvvNo |
      | muralimoothedath | R@manadhan1 | Sydney    | Hotel Sunshine | Standard     | 4 - Four   | 4 - Four      | 4 - Four        | murali    | krishna  | moothedath   | 1234253647857765 | American Express | February |   2012 |   455 |
      | muralimoothedath | R@manadhan1 | Melbourne | Hotel Creek    | Deluxe       | 3 - Three  | 3 - Three     | 3 - Three       | ram       | kumar    | padinjarodan | 1234253647857765 | American Express | February |   2012 |   455 |
      | muralimoothedath | R@manadhan1 | Brisbane  | Hotel Hervey   | Double       | 2 - Two    | 2 - Two       | 4 - Four        | akash     | chopra   | chennai      | 1234253647857765 | American Express | February |   2012 |   455 |
      | muralimoothedath | R@manadhan1 | Adelaide  | Hotel Sunshine | Deluxe       | 4 - Four   | 4 - Four      | 3 - Three       | sone      | muthu    | kerala       | 1234253647857765 | American Express | February |   2012 |   455 |
      | muralimoothedath | R@manadhan1 | Melbourne | Hotel Hervey   | Super Deluxe | 3 - Three  | 3 - Three     | 2 - Two         | arun      | pu       | pune         | 1234253647857765 | American Express | February |   2012 |   455 |
      | muralimoothedath | R@manadhan1 | Sydney    | Hotel Sunshine | Deluxe       | 2 - Two    | 4 - Four      | 3 - Three       | krishna   | kumar    | thrissur     | 1234253647857765 | American Express | February |   2012 |   455 |
      | muralimoothedath | R@manadhan1 | Adelaide  | Hotel Cornice  | Double       | 4 - Four   | 2 - Two       | 2 - Two         | balan     | murali   | tamilnadu    | 1234253647857765 | American Express | February |   2012 |   455 |
