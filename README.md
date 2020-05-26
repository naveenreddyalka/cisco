# Malware Loopup Service

## Requierments 
Java 8+ and Gradle 4+

## Installation

To run from main directory use the below commands

```bash
./gradlew bootRun 
or 
gradle bootRun```

## Usage

Access the application via 

```bash
http://localhost:8080/malware/
```

This application has Oauth2 setup via GitHub, on the welcomr page you will need to click the link to get authenticated

This Applciation provides one API 

```bash
GET /malware/v1/urlinfo?url={URL}
```

Sample: http://localhost:8080/malware/v1/urlinfo?url=www.test.com

Access the database via the below URL to update UrlInfo 

```python
http://localhost:8080/malware/h2/
```
This applciation uses 
Spring Boot framework and its bootstrapping capabilities 
an immemory cache to optimizate API repsonse, the TTL is 30 sec 
an immemory database for url managment 
Oauth2 Security with GitHub Integration JPA for the ease to moving to another distributed DB
