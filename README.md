### Example App to use Docker and docker-compose

To start the app execute the following command:
(the first time will possibly fail since the database takes to long to come up.
just try it a second time ;)
```console
./mvnw clean package && docker-compose up --build --force-recreate
```
Good luck ! 🤞🏽

http://localhost:8083/api/employees

