<h1 align="center">Parking Control API 🚗</h2>

<p align="center">A RESTful API for managing parking spaces in a condominium.</p>

<h2 align="center">💻Technologies useds</h2>
<p align="center">
 <a href="https://spring.io/projects/spring-boot" target="_blank"><img src="https://img.shields.io/badge/Spring_Boot-6DB33F?logo=spring-boot&logoColor=white" alt="Spring Boot Badge"></a>
<a href="https://www.oracle.com/technetwork/java/javase/downloads/index.html"><img alt="Java" src="https://img.shields.io/badge/Java-17-red.svg"/></a>
<a href="https://www.pgadmin.org/" target="_blank"><img src="https://img.shields.io/badge/pgAdmin-4169E1?logo=postgresql&logoColor=white" alt="pgAdmin Badge"></a>
  <a href="https://www.postman.com/" target="_blank">
  <img src="https://img.shields.io/badge/Postman-FF6C37?logo=postman&logoColor=white" alt="Postman Badge">
</a>
</p>
## Endpoints

### Save Parking Spot

Endpoint to save a new parking spot.

- **URL**

  `/parking-spot`

- **HTTP Method**

  `POST`

- **Request Body (JSON)**

  ```json
  {
    "parkingSpotNumber": "A101",
    "licensePlateCar": "ABC1234",
    "brandCar": "Toyota",
    "modelCar": "Corolla",
    "colorCar": "Black",
    "responsibleName": "John Doe",
    "apartment": "101",
    "block": "A"
  }
  ```

- **Responses**

  - 201 CREATED: Parking spot saved successfully.

  - 409 CONFLICT: Data conflict. Returns a message indicating the issue.

### Get All Parking Spots

Endpoint to list all parking spots.

- **URL**

  `/parking-spot`

- **HTTP Method**

  `GET`

- **Response**

  - 200 OK: Returns a list of all parking spots.

### Get Parking Spot by ID

Endpoint to get details of a specific parking spot by ID.

- **URL**

  `/parking-spot/{id}`

- **HTTP Method**

  `GET`

- **URL Parameters**

  `id` - Unique ID of the parking spot.

- **Responses**

  - 200 OK: Returns details of the parking spot.

  - 404 NOT FOUND: Parking spot not found.

### Delete Parking Spot by ID

Endpoint to delete a specific parking spot by ID.

- **URL**

  `/parking-spot/{id}`

- **HTTP Method**

  `DELETE`

- **URL Parameters**

  `id` - Unique ID of the parking spot.

- **Responses**

  - 200 OK: Parking spot deleted successfully.

  - 404 NOT FOUND: Parking spot not found.

### Update Parking Spot by ID

Endpoint to update details of a specific parking spot by ID.

- **URL**

  `/parking-spot/{id}`

- **HTTP Method**

  `PUT`

- **URL Parameters**

  `id` - Unique ID of the parking spot.

- **Request Body (JSON)**

  ```json
  {
    "parkingSpotNumber": "A102",
    "licensePlateCar": "XYZ5678",
    "brandCar": "Honda",
    "modelCar": "Civic",
    "colorCar": "Silver",
    "responsibleName": "Mary Smith",
    "apartment": "102",
    "block": "A"
  }
  ```

- **Responses**

  - 200 OK: Parking spot updated successfully.

  - 404 NOT FOUND: Parking spot not found.

## Project Structure

- **Controller:** Responsible for handling HTTP requests and calling appropriate services.
- **DTO:** Data Transfer Objects to map data received in requests.
- **Models:** Entities representing data in the database.
- **Repository:** Interfaces for interacting with the database.
- **Service:** Business logic of the application.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL (or another relational database)

## How to Run

1. Clone the repository to your local machine.
```sh
  -git clone https://github.com/caiotbraga/parking-control-API.git
```
3. Import the project into your Java IDE.
4. Configure the PostgreSQL database (or another relational database) in the `application.properties` file.
5. Run the `ParkingControlApplication` class to start the server.

## License

This project is licensed under the [MIT License](LICENSE).
