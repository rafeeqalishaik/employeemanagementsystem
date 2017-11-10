#SHORT DESCRIPTION

Employee Management System is a simple spring boot application which allows CRUD operations on employee documents in mongo db.

#PRE-REQUISTIES

1. Java JDK installed on machine.

reference for configuring java on machine:
https://www.wikihow.com/Install-the-Java-Software-Development-Kit
https://www.wikihow.com/Set-Java-Home

2. Eclipse IDE or STS IDE or Any Other IDE to run and alter the code.

reference for different IDE's:
http://www.eclipse.org/downloads/
https://spring.io/tools/sts/all

3. Mongo DB setup on machine

reference for installing mongo db:
https://docs.mongodb.com/v3.0/installation/

4. Postman to test the application

reference link: https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=en

#APPLICATION PROPERTIES
1. change application properties if required. properties like
- server port
- mongo db port
- mongo db IP
- mongo db user
- mongo db password etc.

reference for all common properties:
https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html

#HOW TO RUN

1. Once pre-requisties are done.
2. clone project to your local machine and import into IDE workspace.
3. Now run the EmployeeManagementSystem.java from main menu run.
4. Check the working functionality of the application using postman.

#END-POINTS
1. List all employees - /employees/allEmployees
2. Add employee - /employees/addEmployee
3. Update an employee - /employees/updateEmployee
4. List employee by designation - /employees/getEmployeeByDesignation/{designation}
5. List employee by domain - /employees/getEmployeeByDomain/{domain}
6. List employee by employeeName - /employees/deleteEmployee/{employeeName}