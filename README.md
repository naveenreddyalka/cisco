# Malware Loopup Service

## Requierments 
Java 8+ and Gradle 4+

## Installation

To run from main directory use the below commands

```bash
./gradlew bootRun 
or 
gradle bootRun
```

## Usage

Access the application via 

```bash
http://localhost:8080/malware/
```

This application has Oauth2 setup via GitHub, on the welcome page you will need to click the link to get authenticated

This Applciation provides one API 

```bash
GET /malware/v1/urlinfo?url={URL}
```

Sample request URL:

```
http://localhost:8080/malware/v1/urlinfo?url=www.test.com
```
Sample response:
```
{
   "responseDateTime":"2020-05-26T00:44:10.701+0000",
   "urlStatus":"URL_SAFE"
}
```

Access the database via the below URL to update UrlInfo(just submit)

```python
http://localhost:8080/malware/h2/
```
This applciation uses <br />
Spring Boot framework and its bootstrapping capabilities <br />
an immemory cache to optimizate API repsonse, the TTL is 30 sec <br />
an immemory database for url managment <br />
Oauth2 Security with GitHub Integration JPA for the ease to moving to another distributed DB<br />

The Flow looks something like the below 


![Main Page](/pic/1.png)
![Main Page](/pic/2.png)
![GitHub Page](/pic/3.png)
![PostLogin Page](/pic/4.png)
![Submit good url Page](/pic/5.png)
![Submit bad url Page](/pic/6.png)
![H2 home Page, just submit](/pic/7.png)
![H2 Main Page](/pic/8.png)
