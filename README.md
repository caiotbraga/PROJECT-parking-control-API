# Parking Control API Documentation

This project consists of a parking control API developed in Spring Boot.

## Controllers

### `ParkingSpotController`

This controller handles operations related to parking spots.

#### Routes

- `POST /parking-spot`: Create a new parking spot.
- `GET /parking-spot`: Get all parking spots.
- `GET /parking-spot/{id}`: Get a specific parking spot by ID.

### Example Usage

#### Creating a New Parking Spot

```http
POST /parking-spot
Content-Type: application/json

{
    "parkingSpotNumber": "A001",
    "licensePlateCar": "ABC1234",
    "brandCar": "Toyota",
    "modelCar": "Corolla",
    "colorCar": "Black",
    "responsibleName": "John Doe",
    "apartment": "101",
    "block": "A"
}
```
### Getting All Parking Spots

```http
GET /parking-spot

