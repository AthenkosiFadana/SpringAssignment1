Documentation: Spring Boot Application
Overview
This is a simple Spring Boot application that demonstrates basic web functionality. The application defines RESTful endpoints to serve course information and uses JSP (JavaServer Pages) for rendering dynamic web content.

Project Structure

Main Application Class: SpringAssignment1Application
•	Entry point of the application.
•	Defines REST endpoints and configures view resolver.

View Templates (inside src/main/webapp/WEB-INF/views/):
•	index.jsp: Landing page with links.

Application Components

1. SpringAssignment1Application
Annotations:
•	@SpringBootApplication: Main Spring Boot application annotation.
•	@Controller: Marks this class as a Spring MVC controller.

Endpoints:
•	@GetMapping("/"): Maps the root URL to the index() method, which returns index (resolved by JSP).
•	@GetMapping("/courses"): Maps /courses URL to getCourses() method, returning course information in HTML format.

Bean Configuration:
•	@Bean viewResolver(): Configures and returns an InternalResourceViewResolver bean.
•	Resolves view names using JSP files located under /WEB-INF/views/.

2. index.jsp
Purpose:
•	Displays a welcome message.
•	Provides a link to view available courses.

Running the Application
1.	Build and Run:
•	Use Maven or Gradle to build the application.
•	Run the main method of SpringAssignment1Application to start the Spring Boot application.

2.	Accessing the Application:
•	Open a web browser and navigate to http://localhost:8080/.
•	Click the link to view available courses.

Testing Endpoints
•	Access the home page: http://localhost:8080/
•	View course information: http://localhost:8080/courses

Dependencies
•	Spring Boot Starter Web: Handles web-related dependencies.
•	Spring Boot Starter Tomcat: Embedded servlet container.

Notes
•	Ensure proper configuration of pom.xml or build.gradle for necessary Spring Boot dependencies.
•	The application uses embedded Tomcat for running the web server.
•	Customize index.jsp and other JSP files under WEB-INF/views/ for UI modifications.

References
•	Spring Boot Documentation
•	Spring MVC Documentation
