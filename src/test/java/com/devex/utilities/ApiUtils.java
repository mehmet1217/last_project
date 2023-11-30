package com.devex.utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiUtils {

    public static String getAccessToken(String email, String password) {

        Map<String, Object> tokenMap = new HashMap<>();
        tokenMap.put("email", email);
        tokenMap.put("password", password);

        Response response = given().accept(ContentType.JSON)
                .and()
                .contentType(ContentType.JSON)
                .body(tokenMap)
                .when()
                .post(ConfigurationReader.get("postLogin"));
        String token = response.path("token");

        return token;
    }
}
