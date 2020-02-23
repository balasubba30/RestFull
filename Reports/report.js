$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "User able to login and logout",
  "description": "",
  "id": "user-able-to-login-and-logout",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User enter username, pasword and login to application",
  "description": "",
  "id": "user-able-to-login-and-logout;user-enter-username,-pasword-and-login-to-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigate to Gmail URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Enter user name",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User click login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User check home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "check details",
  "keyword": "But "
});
formatter.match({
  "location": "StepDefinition.user_navigate_to_Gmail_URL()"
});
formatter.result({
  "duration": 378461663,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_user_name()"
});
formatter.result({
  "duration": 326628,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_password()"
});
formatter.result({
  "duration": 127994,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_login_button()"
});
formatter.result({
  "duration": 372512,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_check_home_page()"
});
formatter.result({
  "duration": 367079,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.check_details()"
});
formatter.result({
  "duration": 108071,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User validate profile details",
  "description": "",
  "id": "user-able-to-login-and-logout;user-validate-profile-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User navigate to Profile details page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Enter city",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "check Profile details",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef1.user_navigate_to_Profile_details_page()"
});
formatter.result({
  "duration": 193803,
  "status": "passed"
});
formatter.match({
  "location": "StepDef1.enter_city()"
});
formatter.result({
  "duration": 108675,
  "status": "passed"
});
formatter.match({
  "location": "StepDef1.check_Profile_details()"
});
formatter.result({
  "duration": 105052,
  "status": "passed"
});
});