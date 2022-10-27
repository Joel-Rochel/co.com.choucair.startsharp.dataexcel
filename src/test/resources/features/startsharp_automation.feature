#Autor: Joel Rochel

@stories
Feature: StartSharp
  As a user, I want to create a business unit and schedule a meeting with it

  @scenario1
  Scenario Outline: : creation of a business unit and a meeting with it
    Given Joel wants to login to StartSharp
      | strUser   | strPassword   |
      | <strUser> | <strPassword> |
    When Enter the information for the creation of a business unit
      | strNameBusinessUnit   | strParentUnit   |
      | <strNameBusinessUnit> | <strParentUnit> |
    And enter the information to create a meeting
      | strMeetingName   | strMeetingType   | strMeetingNumber   | strStartDate   | strStartHour   | strEndDate   | strEndHour   | strLocation   | strUnit   | strOrganizedBy   | strReporter   | strAttendeeList   |
      | <strMeetingName> | <strMeetingType> | <strMeetingNumber> | <strStartDate> | <strStartHour> | <strEndDate> | <strEndHour> | <strLocation> | <strUnit> | <strOrganizedBy> | <strReporter> | <strAttendeeList> |
    Then Verify that the process is complete
      |strConfirmButton  |
      |<strConfirmButton>|

  Examples:
    | strUser | strPassword | strNameBusinessUnit | strParentUnit | strMeetingName | strMeetingType | strMeetingNumber | strStartDate | strStartHour | strEndDate | strEndHour | strLocation | strUnit | strOrganizedBy | strReporter | strAttendeeList |strConfirmButton|
    ##@externaldata@./src/test/resources/Datadriven/dtDatos.xlsx@Datos@1
   |admin   |serenity   |Exito   |Administration   |Reunion 1   |General   |1234567   |05/03/2022   |14:00   |05/03/2022   |15:00   |HQ-01   |Exito   |Alexis Lopez   |Anna Simmons   |Lillian Cooper   |New Meeting|


  @scenario2
  Scenario Outline:
    Given Joel wants to verify the creation of business unitsp
      | strUser   | strPassword   |
      | <strUser> | <strPassword> |
    When complete only the required fields
      | strNameBusinessUnit   |
      | <strNameBusinessUnit> |
    Then verify the creation of the business unit
      | strConfirmButton   |
      | <strConfirmButton> |

  Examples:
    | strUser | strPassword | strNameBusinessUnit | strConfirmButton  |
    ##@externaldata@./src/test/resources/Datadriven/dtDatos.xlsx@Datos2@1
   |admin   |serenity   |Agil   |New Business Unit|

    

   
  




   



   

   

   

