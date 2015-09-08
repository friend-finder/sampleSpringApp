This is a sample (and simple) Spring application.

Setup
================
Before attempting to run this application, I recommend to run it on a Linux distro (preferably Ubuntu 14.04).

I provided a "setup.sh" file in the resources folder (.../sampleSpringApp/src/main/resources) that sets up all of the
necessary tools to get this app up and running. So, run:

sudo ./setup.sh

This will set up the Java 8 SDK, IntelliJ, MySQL, and the sample database that the app will be using. After running this
script successfully, make sure to change the password to the one you used when setting up the root of your MySQL.

Finally, open up the project in IntelliJ and run the app by right-clicking "Application" and clicking
"Run 'Application.main()'". After running successfully, use DHC to send API calls to test out the application.

The API documentation is provided below.

Sample App API
===============
Get all users

GET localhost:8080/sampleApp/v1/user


Get user by ID

GET localhost:8080/sampleApp/v1/user/{id}


Get user by e-mail

GET localhost:8080/sampleApp/v1/user/lastName/{email}


Get users by first name and last name

GET localhost:8080/sampleApp/v1/user/name?firstName={firstName}&lastName={lastName}


Add a user

POST localhost:8080/sampleApp/v1/user

Sample JSON:
{
    "firstName": "John",
    "lastName": "Doe",
    "email": "jdoe@vt.edu"
}


Remove a user

DELETE localhost:8080/sampleApp/v1/user/{id}