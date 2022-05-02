$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MakeMyTrip.feature");
formatter.feature({
  "line": 1,
  "name": "Tiket Booking",
  "description": "",
  "id": "tiket-booking",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Booking a Ticket from Chennai to Bangalore",
  "description": "",
  "id": "tiket-booking;booking-a-ticket-from-chennai-to-bangalore",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": ": user is on MakeMyTrip application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": ": user click on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": ": user enters email address",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": ": user click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": ": user enters password",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": ": user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": ": user click on round trip radio button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": ": user enters From location",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": ": user enters To location",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": ": user click on search button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": ": user select departure flight",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": ": user select arriavl flight",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": ": user closes the application",
  "keyword": "But "
});
formatter.match({
  "location": "Logic.user_is_on_MakeMyTrip_application()"
});
formatter.result({
  "duration": 4744047900,
  "status": "passed"
});
formatter.match({
  "location": "Logic.user_click_on_signin_button()"
});
formatter.result({
  "duration": 619146300,
  "status": "passed"
});
formatter.match({
  "location": "Logic.user_enters_email_address()"
});
formatter.result({
  "duration": 503754900,
  "status": "passed"
});
formatter.match({
  "location": "Logic.user_click_on_continue_button()"
});
formatter.result({
  "duration": 5102701100,
  "status": "passed"
});
formatter.match({
  "location": "Logic.user_enters_password()"
});
formatter.result({
  "duration": 10102228000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#password\"}\n  (Session info: chrome\u003d101.0.4951.41)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027AMMA\u0027, ip: \u0027192.168.1.66\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 101.0.4951.41, chrome: {chromedriverVersion: 101.0.4951.41 (93c720db8323..., userDataDir: C:\\Users\\SHAMKU~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:58479}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: c46fd1ebc65de2953948e15251c83a8b\n*** Element info: {Using\u003did, value\u003dpassword}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat com.org.testrunner.RunnerClass.setPassword(RunnerClass.java:67)\r\n\tat com.org.implementation.Logic.user_enters_password(Logic.java:46)\r\n\tat ✽.When : user enters password(MakeMyTrip.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Logic.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Logic.user_click_on_round_trip_radio_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Logic.user_enters_From_location()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Logic.user_enters_To_location()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Logic.user_click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Logic.user_select_departure_flight()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Logic.user_select_arriavl_flight()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Logic.user_closes_the_application()"
});
formatter.result({
  "status": "skipped"
});
});