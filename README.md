# Kotlin-Rest-MicroArchitecture
Project for implementation microservices communication in Kotlin - with dockerized containers.

Services for docker-compose:
1) Api-Gateway
2) MockServiceForRest
3) MongoDB

Project only for architecture purpose without GUI - Kotlin with Docker's Container microservices funPlay.

For Play with this rest communication beetween services --> Suggest to use PostMan.


### Simple start

* git clone
* sudo service mongodb stop (be sure if appropriate port for database is free especially -> 27017)
* mvn clean package for all modules
* docker-compose up --build --force-recreate -d

