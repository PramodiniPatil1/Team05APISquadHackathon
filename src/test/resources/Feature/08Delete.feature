@program
Feature: Validating API 

Background:
Given Admin set Authorization to Bearer token

 @deleteProgramByName
 Scenario Outline: Check if admin is able to Delete program by programName with valid/invalid details
 Given Admin creates delete Request for the LMS with request body "<Scenario>"
 When Admin sends HTTPS Request and request Body with "programName" endpoint
 Then Admin receives StatusCode with statusText "<Scenario>" for Program

 Examples:
 | Scenario                           |
 | DeleteProgramByInvalidName         |
 | DeleteProgramByNameInvalidEndpoint |
 | DeleteProgramByNameInvalidMethod   |
 | DeleteProgramByNameInvalidBaseURI  |
 | DeleteProgramByNameNoAuth          |
 | DeleteProgramByValidName           |
 
 