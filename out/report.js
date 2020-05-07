$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Shopping.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping",
  "description": "",
  "id": "shopping",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Buying a new sweaters",
  "description": "",
  "id": "shopping;buying-a-new-sweaters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is logged in to CodersLab shop and search Hummingbird Printed Sweater",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User chooses Hummingbird Printed Sweater",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User checks the discount",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User select M size",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User select 5 pieces",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click ADD TO CART",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click Proceed to Checkout",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User select an Address",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User select Shipping Method",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User select Payment Method",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User sees \"Information successfully updated.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User close window",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingSteps.userIsLoggedInToCodersLabShop()"
});
formatter.result({
  "duration": 4790657338,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.userChoosesHummingbridPrintedSweaters()"
});
formatter.result({
  "duration": 594866748,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.userChecksTheDiscount()"
});
formatter.result({
  "duration": 131080962,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.userSelectMSize()"
});
formatter.result({
  "duration": 362373784,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.userSelect5Pieces()"
});
formatter.result({
  "duration": 7985905721,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.userClickADDTOCART()"
});
formatter.result({
  "duration": 1715383536,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.userClickProceedToCheckout()"
});
formatter.result({
  "duration": 1101420326,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.userSelectAnAddress()"
});
formatter.result({
  "duration": 1006223041,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.userSelectShippingMethod()"
});
formatter.result({
  "duration": 985943492,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.userClickOnSaveButton()"
});
formatter.result({
  "duration": 1054509625,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});