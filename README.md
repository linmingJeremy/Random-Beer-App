# Random-Beer-App
 simple web app that displays details about a random beer.

# Needed IDE and tools
Java Spring Tool Suite; Mysql; Any browser.

# Setup Instructions

1 Import this java spring boot project "beerApp" to java STS workspace.

2 Create database in mysql called "beerApp", the jdbc connection details can be seen as below (or at the place of "application.properties" from the project) :

spring.datasource.name=beerApp
spring.datasource.url=jdbc:mysql://localhost:3306/beerApp?characterEncoding=utf8&useSSL=true
spring.datasource.username=root
spring.datasource.password=1234
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.hbm2ddl.auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.show-sql=true

Please confirm datasource name, url , username and password are consistent with this.

3 Automatically creating the table "beer" by first time running this java project (Spring does the job of creating the table rather than creating the table manually )

4 Execute the "insertData.sql" script to load the data into the database, which is five types of beers information. See details in the script.

5 Restart the java spring boot project service and open the url http://localhost:8080/index, now you can see this web application.

