package test.test.project;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TestDemo {

	// public static void main(String[] args) {
	@Test
	public void getAllBookings() {
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").basePath("/booking").when().log().all()
				.get().then().log().all().statusCode(200);
	}

	@Test
	public void getBookingsById() {
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").basePath("/booking/413").when().log().all()
				.get().then().log().all().statusCode(201);

	}

	@Test
	public void getBookingsByIdbff() {
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").basePath("/booking/413").when().log().all()
				.get().then().log().all().statusCode(201);

	}
}
