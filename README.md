1. Download and install Allure commandline application
https://docs.qameta.io/allure/#_installing_a_commandline
2. Open Terminal,navigate to folder with pom.xml
3. run tests
   ```mvn clean test```
4. generate report
   ```allure serve ./target/surefire-reports/```