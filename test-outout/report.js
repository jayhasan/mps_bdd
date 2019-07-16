$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("USAHomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Home Functionality",
  "description": "",
  "id": "home-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7799063500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify Home page",
  "description": "",
  "id": "home-functionality;verify-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on Select vehicle",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#Then Verify Camry2019 is displayed"
    }
  ],
  "line": 9,
  "name": "user click on Shopping Tools",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on Find a Dealer",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.i_am_in_home_page()"
});
formatter.result({
  "duration": 223717800,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_click_on_Select_vehicle()"
});
formatter.result({
  "duration": 413339200,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_click_on_Shopping_Tools()"
});
formatter.result({
  "duration": 1412704400,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_click_on_Find_a_Dealer()"
});
formatter.result({
  "duration": 1944869300,
  "status": "passed"
});
formatter.after({
  "duration": 1059845300,
  "status": "passed"
});
});