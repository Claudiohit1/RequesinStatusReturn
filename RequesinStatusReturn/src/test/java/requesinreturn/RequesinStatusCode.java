package requesinreturn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RequesinStatusCode {

	@Test
	public void statusCodeId7() {

		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		int code = response.getStatusCode();
		System.out.println("O status code retornado é " + code);
		assertEquals(200, code);

	}

	@Test
	public void getTestValidarBodyId7() {
		Response response = RestAssured.get("https://reqres.in/api/users?id=7");
		String bodyResponse = response.asPrettyString();
		System.out.println(bodyResponse);
		assertTrue(bodyResponse.contains("name"));

	}

	@Test
	public void statusCodeId8() {

		Response response = RestAssured.get("https://reqres.in/api/users?page=8");
		int code = response.getStatusCode();
		System.out.println("O status code retornado é " + code);
		assertEquals(200, code);

	}

	@Test
	public void getTestValidarBodyId8() {
		Response response = RestAssured.get("https://reqres.in/api/users?id=8");
		String bodyResponse = response.asPrettyString();
		System.out.println(bodyResponse);
		assertTrue(bodyResponse.contains("name"));
	}

}
