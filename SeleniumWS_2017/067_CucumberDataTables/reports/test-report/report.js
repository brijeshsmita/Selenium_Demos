$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('com\selenium\cucumber\dataTable.feature');
formatter.feature({
  "line": 1,
  "name": "Data table",
  "description": "Verify that the new user registration is unsuccessful after passing incorrect inputs.",
  "id": "data-table",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "data-table;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the new user registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter invalid data on the page",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 6
    },
    {
      "cells": [
        "First Name",
        "Yoyo"
      ],
      "line": 7
    },
    {
      "cells": [
        "Last Name",
        "Honey Singh"
      ],
      "line": 8
    },
    {
      "cells": [
        "Email Address",
        "someone@someone.com"
      ],
      "line": 9
    },
    {
      "cells": [
        "Re-enter Email Address",
        "someone@someone.com"
      ],
      "line": 10
    },
    {
      "cells": [
        "Password",
        "Password1"
      ],
      "line": 11
    },
    {
      "cells": [
        "Birthdate",
        "01"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User registration should be unsuccessful",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTableStepDefinition.I_am_on_the_new_user_registration_page()"
});
formatter.result({
  "duration": 9493354200,
  "status": "passed"
});
formatter.match({
  "location": "DataTableStepDefinition.I_enter_invalid_data_on_the_page(DataTable)"
});
formatter.result({
  "duration": 2895015700,
  "status": "passed"
});
formatter.match({
  "location": "DataTableStepDefinition.User_registration_should_be_unsuccessful()"
});
formatter.result({
  "duration": 2401415400,
  "status": "passed"
});
});