$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Login.feature");
formatter.feature({
  "name": "Login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test login with valid credentails",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to Login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "user is navigated to home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "John Doe",
        "ThisIsNotAPassword"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test login with valid credentails",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.navigateToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters John Doe and ThisIsNotAPassword",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.enterUsername(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.Click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.homepage()"
});
formatter.result({
  "status": "passed"
});
});