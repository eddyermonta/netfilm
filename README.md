# NetFilm Web Application - Pelicula Controller

## Overview

This is a Spring Boot web controller for managing peliculas (movies) in the NetFilm application. It is part of a larger system that handles multimedia content, with a focus on peliculas. The controller provides endpoints for creating, updating, deleting, and retrieving peliculas.

## Technologies Used

- Spring Boot
- Java
- Maven

## Usage

### Save a Pelicula

```http
POST /peliculas/guardar
```

Create and save a new pelicula.

**Request:**
```json
{
  // Pelicula details here
}
```

**Response:**
- Status: 201 Created
- Body: The created pelicula details.

### Retrieve All Peliculas

```http
GET /peliculas/buscarTodo
```

Retrieve a list of all peliculas.

**Response:**
- Status: 200 OK
- Body: A list of pelicula details.

### Update a Pelicula

```http
PUT /peliculas/actualizar/
```

Update an existing pelicula.

**Request:**
```json
{
  // Updated pelicula details here
}
```

**Response:**
- Status: 200 OK if the update is successful, 404 Not Found otherwise.

### Delete a Pelicula

```http
DELETE /peliculas/borrar/{id}
```

Delete a pelicula by its ID.

**Response:**
- Status: 200 OK if the deletion is successful, 404 Not Found otherwise.

### Retrieve a Pelicula by ID

```http
GET /peliculas/buscar/{id}
```

Retrieve a pelicula by its ID.

**Response:**
- Status: 200 OK with the pelicula details if found, 404 Not Found otherwise.

## Dependencies

- PeliculaService
- MultimediaService
- MultimediaRepository

## Configuration

The controller is configured with the necessary services and repositories through dependency injection in the constructor.

```java
@Autowired
public PeliculaController(PeliculaService peliculaService, MultimediaService multimediaService) {
    this.peliculaService = peliculaService;
    this.multimediaService = multimediaService;
}
```

## Building and Running

To build and run the application, ensure that you have Maven and Java installed. Run the following command:

```bash
mvn spring-boot:run
```

The application will be accessible on `http://localhost:8080`.
