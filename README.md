# SPRING REST CONTROLLER

## Overview

This project implements a RESTful controller for managing banking accounts within a service-oriented architecture using Spring Boot. The REST Controller provides CRUD (Create, Read, Update, Delete) operations over HTTP, facilitating the management of banking resources through a backend system.

## Features

- RESTful API for banking accounts management
- Endpoint structure follows REST conventions (e.g., `/api/v1/accounts`)
- Supports HTTP methods: GET, POST, PUT, DELETE
- JSON and XML request and response formats
- Robust error handling for common HTTP response codes (e.g., 404 Not Found, 400 Bad Request)
- Example routes include:
    - `/banque/comptes` (GET, POST)
    - `/banque/comptes/{id}` (GET, PUT, DELETE)

## Requirements

- **Java 8+**
- **Spring Boot 2.5+**
- **Maven 3.6+**

## Setup and Installation

To get started, follow the steps below:

1. **Clone the Repository**
   ```sh
   git clone <repository-url>
   cd Spring-Rest-Controller
   ```

2. **Build the Project**
   Use Maven to build the project and resolve all dependencies:
   ```sh
   mvn clean install
   ```

3. **Run the Application**
   You can run the Spring Boot application using:
   ```sh
   mvn spring-boot:run
   ```

   Alternatively, you can build the JAR and run it directly:
   ```sh
   java -jar target/Spring-Rest-Controller-0.0.1-SNAPSHOT.jar
   ```

## API Endpoints Documentation

### **GET /banque/comptes**
- Retrieves a list of all accounts.
- Response format can be JSON or XML.

### **POST /banque/comptes**
- Creates a new account. The account details should be provided in the request body.
- Accepts JSON or XML format for the request body.

### **GET /banque/comptes/{id}**
- Retrieves the account with the specified ID.
- Response format can be JSON or XML.

### **PUT /banque/comptes/{id}**
- Updates an existing account. The updated details should be provided in the request body.
- Accepts JSON or XML format for the request body.

### **DELETE /banque/comptes/{id}**
- Deletes the account with the specified ID.

## Configuration

The application properties can be configured in the `application.properties` or `application.yml` file located in the `src/main/resources` directory. Adjust the following parameters as needed:

- **Server Port**: `server.port` (default: 8082)
- **Database Connection Details**: Update database settings if applicable (using H2 in-memory database).

Example `application.properties` file:
```properties
spring.application.name=Spring-Rest-Controller
spring.datasource.url=jdbc:h2:mem:banque
spring.datasource.username=root
spring.datasource.password=@1234567890@
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
server.port=8082
spring.jpa.hibernate.ddl-auto=create
```

## Technologies Used

- **Spring Boot**: Framework for building the REST API.
- **Maven**: Dependency management and project build.
- **Jackson**: JSON and XML parsing library for request and response handling.
- **H2 Database**: In-memory database for development and testing.
- **Lombok**: Reduces boilerplate code (e.g., getters, setters).

## Testing

To run unit and integration tests, use the following command:
```sh
mvn test
```
Unit and integration tests are available to ensure the robustness of the endpoints and application logic.

## License

This project is open-source and available under the **MIT License**.

## Contribution

Contributions are welcome! To contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch (`feature/your-feature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Open a Pull Request.

## Contact

For further information or questions, feel free to contact the project maintainer at [jaafarelansari@gmail.com](jaafarelansari@gmail.com).

## Author
### Elansari Jaafar
[GitHub Profile](https://github.com/Elansari-Jaafar)

---
Feel free to suggest new features or report issues through GitHub issues. Any feedback or contributions are appreciated!

