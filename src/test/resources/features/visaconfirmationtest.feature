Feature: visaConfirmationTest
   @smoke @sanity @regression
  Scenario: An australian com in to UK for Tourism.
    Given I am on homepage
  When Click on start button
  And Select a Nationality 'Australia'
  And Click on Continue button
  And Select reason 'Tourism'
  And Click on Continue button
  Then verify result 'You will not need a visa to come to the UK'
@regression
  Scenario: A Chilean Coming To The UK For Work And Plans On Staying For Longer Than Six Months
  Given I am on homepage
 When Click on start button
  And Select a Nationality Chile
  And Click on Continue button
  And Select reason Work academic visit or business
 And Click on Continue button
 And Select intendent to stay for 'longer than 6 months'
 And Click on Continue button
  And Select have planning to work for 'Health and care professional'
  And Click on Continue button
  Then verify result You need a visa to work in health and care

    @sanity @regression
  Scenario: A Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An
  Article10Or20Card
  Given I am on homepage
  When Click on start button
  And Select a Nationality Colombia
  And Click on Continue button
  And Select reason Join partner or family for a long stay
 And Click on Continue button
  And verify result You’ll need a visa to join your family or partner in the UK

