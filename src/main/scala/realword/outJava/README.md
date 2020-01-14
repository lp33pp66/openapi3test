# openapi-java-client

realworld api test
- API version: 0.0.1
  - Build date: 2020-01-14T10:19:13.699929+08:00[Asia/Taipei]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

  For more information, please visit [http://localhost:8080/api](http://localhost:8080/api)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:0.0.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-0.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AuthReq authReq = new AuthReq(); // AuthReq | 
    try {
      UserRes result = apiInstance.authentication(authReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#authentication");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**authentication**](docs/DefaultApi.md#authentication) | **POST** /users/login | auth account
*DefaultApi* | [**registration**](docs/DefaultApi.md#registration) | **POST** /users | regist
*DefaultApi* | [**userGet**](docs/DefaultApi.md#userGet) | **GET** /user | currentuser


## Documentation for Models

 - [AuthData](docs/AuthData.md)
 - [AuthReq](docs/AuthReq.md)
 - [Errors](docs/Errors.md)
 - [ErrorsErrors](docs/ErrorsErrors.md)
 - [RegistData](docs/RegistData.md)
 - [RegistReq](docs/RegistReq.md)
 - [UserData](docs/UserData.md)
 - [UserRes](docs/UserRes.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

contact@example.com
