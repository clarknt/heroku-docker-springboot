# heroku-docker-springboot
Sample setup for publishing a Spring Boot app on Heroku within a Docker container.

Adapted from these official sources:
- [Spring Boot with Docker](https://spring.io/guides/gs/spring-boot-docker/)
- [Container Registry & Runtime (Docker Deploys)](https://devcenter.heroku.com/articles/container-registry-and-runtime)

## Local launch

### Build
```sh
$ ./mvnw package
$ docker build -t heroku-docker-springboot .
```

### Run
```sh
$ docker run -p 8080:8080 -e PORT=8080 heroku-docker-springboot
```
The PORT environment variable is set the same way Heroku would.

### Test
```sh
$ curl localhost:8080
```

## Heroku launch

### Create
```sh
$ heroku container:login
$ heroku create
```

### Push/release
```sh
$ heroku container:push web
$ heroku container:release web
```

### Test
```sh
$ heroku open
```
