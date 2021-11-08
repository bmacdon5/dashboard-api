# MCMS - Dashboard API

## Dockerfile creation

When creating your container image for this Spring Boot application, keep in
mind this application uses Flyway to perform database migrations. Migrations
help us initialize, seed, and modify our database so the API is ready to be
accessed.

> **_Note_**: **You will need to explicitly run `flyway migrate` in your container image
> to seed the database with condenser entries.**

