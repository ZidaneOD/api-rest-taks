
# API'S TASKS

El proyecto se hizo con el Framework de Spring Boot 3 y con conexion a una bd en PostgrateSQL 16.




## API Reference

POSTMAN: https://www.postman.com/grey-zodiac-741435/workspace/public/collection/25731346-f5dedf54-a1f1-40d8-879a-a12d1ac15ced?action=share&creator=25731346

### EJEMPLOS:

#### Get all estados

```http
  GET /api/estado
```

#### Get estado

```http
  GET /api/estado/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Integer` | **Requiere**. Id del estado a buscar |

#### Guardar estado

```http
  POST /api/estado
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `nombEstado`      | `String` | **Requiere**. Nombre del estado para guardar |







## Authors

- [@Zidane](https://github.com/ZidaneOD)

