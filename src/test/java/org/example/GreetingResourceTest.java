package org.example;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static org.hamcrest.CoreMatchers.is;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class GreetingResourceTest {

	@Test
	public void testHelloEndpoint() {
		given()
				.when().get("/hello-resteasy")
				.then()
				.statusCode(200)
				.body(is("Hello RESTEasy after webhook"));
	}
}
