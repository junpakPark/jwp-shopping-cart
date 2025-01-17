package cart.controller;

import static io.restassured.RestAssured.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ViewControllerTest {

	@Value("${local.server.port}")
	int port;

	@BeforeEach
	public void setPort() {
		RestAssured.port = port;
	}

	@Test
	@Transactional
	void displayHomeTest() {
		given()
			.when()
			.get()
			.then()
			.statusCode(HttpStatus.OK.value())
			.contentType(ContentType.HTML);
	}

	@Test
	void displayAdminTest() {
		given()
			.when()
			.get("/admin")
			.then()
			.statusCode(HttpStatus.OK.value())
			.contentType(ContentType.HTML);
	}

	@Test
	void displaySettingsTest() {
		given()
			.when()
			.get("/settings")
			.then()
			.statusCode(HttpStatus.OK.value())
			.contentType(ContentType.HTML);
	}

	@Test
	void displayCartPageTest() {
		given()
			.when()
			.get("/cart")
			.then()
			.statusCode(HttpStatus.OK.value())
			.contentType(ContentType.HTML);
	}
}
