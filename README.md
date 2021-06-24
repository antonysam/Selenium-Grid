# Selenium-Grid
Executing the test script in already opened browser in the node machine

## cmd

_Hub_
```
java -jar selenium-server-standalone-3.141.59 -role hub
```
_Node_
```
java java -Dwebdriver.chrome.driver="Driver path\\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role node URL\\register
```
_Launch chrome in debugger_
```
chrome.exe --remote-debugging-port=9228 --user-data-dir=path\chromedata
```
