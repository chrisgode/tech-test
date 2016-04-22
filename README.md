# tech test

Tech test is a simple application for demonstration purpose. It implements the following libraries:

- JBehave: implements Behavior Driven Developpement
- Mockito: mock objects at the unit test level
- Selenium: to implement user acceptance tests
- Spring: for its IoC feature and MVC pattern
- Maven: as the compilation and dependency management tool

To run the application:

- Set the location of the persistence file on the project property file '[your-location]/tech-test/tech-test-app/src/main/resources/application.properties'
- Compile the war running the Maven command line 'mvn install -DskipTests' from the parent project root folder
- Get the tech-test-app.war file from the target folder of the tech-test-app project
- publish the war file on a Tomcat 8 application server
- run Tomcat and  access the application at http://[your.domain.name]:[your.http.port.number]/test-tech-app/people/all

To run the application tests: 

- run 'mvn test' from the project root folder to test the application with Maven.

This will run the unit, integration and user acceptance tests.