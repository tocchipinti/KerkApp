# KerkApp
This repository contains a microservice for the KerkApp project.

# Keycloak
Keycloak is an OAuth 2 and OpenId server used to manage the users, groups and roles in this project.

## Architecture
![alt text](https://github.com/KerkApp/newsservice/blob/master/kerkapp.png "KerkApp Architecture")


# Startup
To start the container use the following command:

`docker-compose -f keycloak-postgres.yml up`

This docker command will start two containers. One with a Postgres-database and one with the Keycloak server.

It will also import a realm called **kerkapp** and it will import a user with name **testuser** and password **password**. The container will also import a default role called **userrole** and a group called **usergroup**

Then go to [http://localhost:8080/auth/](http://localhost:8080/auth/) to see the administration dashboard. Here you can login with the default username **admin** and the default password **password**