# Event management application

Simple code reference project

## Task description

Create a locally runnable backend application for Event management (such as concerts,
meetups etc.) in your preferred JVM language. Feel free to use any major framework (Spring
Boot is most welcome). The application should have a persistence layer and a REST API.
User management can be skipped for simplicity.

### Domain Requirements:
* The user should be able to create, read and delete an event. Also to list all available events
* An event should have a name, date, city, country, a guest list and a weather forecast
* Weather forecast should be filled while creating an event by calling an external API (https://openweathermap.org/api)

### Technical Requirements:
* The application should be runnable either by calling a Gradle task, Maven or Docker container. There should be a README outlining how to do it
* The endpoints should return data in JSON format.
