# simple-reservation-system

An amenity reservation system where users/residents can log in and reserve a time to use a service such as fitness
center, pool, or sauna in a hypothetical apartment complex. Each amenity will have a certain capacity (number of people
that can use the service at the same time) so that people can make use of the amenities safely during the Covid-19
pandemic. Whole development process and technical decisions has been explained in this tutorial:

*https://www.freecodecamp.org/news/spring-boot-tutorial-build-fast-modern-java-app/*

## Technologies

* Spring Boot
* Thymeleaf
* Hibernate
* Swagger
* Spring Security
* Bootify
* Maven
* JPA
* H2 In-Memory Database
* Bootstrap

## Use Cases / User Stories

* Users should be able to log in.
* We will assume that the accounts of residents are pre-created and there will be no sign-up feature.
* Users should be able to view their reservations.
* Users should be able to create new reservations by selecting the amenity type, date, and time.
* Only logged-in users should be able to see the reservations page and create reservations.
* We should check the capacity and only create new reservations if the current number of reservations does not exceed
  the capacity.

### Things todo list

1. Clone this repository: `git clone https://github.com/hendisantika/simple-reservation-system.git`
2. Navigate to the folder: `cd simple-reservation-system`
3. Run the application: `mvn clean spring-boot:run`
4. Open your favorite browser: http://localhost:8080

### Image Screen shots

Login Page

![Login Page](img/login.png "Login Page")

Home Page

![Home Page](img/home.png "Home Page")

Add Reservation

![Add Reservation](img/add.png "Add Reservation")

![Add Reservation](img/add2.png "Add Reservation")

List Reservation

![List Reservation](img/list1.png "List Reservation")

![List Reservation](img/list2.png "List Reservation")

Logout Page

![Logout Page](img/logout.png "Logout Page")