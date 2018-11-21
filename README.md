## Steps followed during creation of this app:

1. Began with steps to build an java-app using gradle: https://guides.gradle.org/building-java-applications/

2. Followed these steps to add Dropwizard: https://karollotkowski.wordpress.com/2015/10/13/run-dropwizard-with-gradle/

3. Registered a resource: https://www.dropwizard.io/1.3.5/docs/getting-started.html

4. Added a GET call: section 1.2 of https://jersey.github.io/documentation/latest/getting-started.html

## Commands:

• Build the project: this task compiles the classes, runs the tests, and generates a test report
```
./gradlew build
```
The tests are then viewable at `.../dropwizard-demo/build/reports/tests/test/index.html`

• View the gradle tasks
```
/dropwizard-demo > ./gradlew tasks
```

• Start the dropwizard server
```
.../dropwizard-demo > ./gradlew run
```
Once the services are started, you can access:
* application: http://localhost:8080/ (no content)
* admin panel: http://localhost:8081/
* newly added resource: http://localhost:8080/myresource
