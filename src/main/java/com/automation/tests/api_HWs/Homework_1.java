package com.automation.tests.api_HWs;

import com.automation.utilities.ConfigurationReader;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Homework_1 {
//    UI names API testing
//    In this assignment, you will test api uinames. This is a free api used to create test users.
//    Documentation for this api is available at https://uinames.com.
//    You can import Postman collection for this API using link:
//    https://www.getpostman.com/collections/e1338b73a8be7a5500e6.
//    Automate the given test cases.
//    You can use any existing project.
//    You can automate all test cases in same class or different classes.
//    TEST CASES
@BeforeAll
public static void setup() {
    baseURI = ConfigurationReader.getProperty("ords.url");
}

//    No params test
//1. Send a get request without providing any parameters
//2. Verify status code 200, content type application/json; charset=utf-8
//3. Verify that name, surname, gender, region fields have value
@Test
@DisplayName("Verify that name, surname, gender, region fields have value")
public void NoParamTest() {
    //given().accept("application/json")
}





//    Gender test
//1. Create a request by providing query parameter: gender, male or female
//2. Verify status code 200, content type application/json; charset=utf-8
//d            2 params test
//1. Create a request by providing query parameters: a valid region and gender
//    NOTE: Available region values are given in the documentation
//2. Verify status code 200, content type application/json; charset=utf-8
//            3. Verify that value of gender field is same from step 1
//            4. Verify that value of region field is same from step 1
//    Invalid gender test
//1. Create a request by providing query parameter: invalid gender
//2. Verify status code 400 and status line contains Bad Request
//3. Verify that value of error field is Invalid gender
//    Invalid region test
//1. Create a request by providing query parameter: invalid region
//2. Verify status code 400 and status line contains Bad Request
//3. Verify that value of error field is Region or language not found
//    Amount and regions test
//1. Create request by providing query parameters: a valid region and amount (must be bigger than 1)
//2. Verify status code 200, content type application/json; charset=utf-8
//            3. Verify that all objects have different name+surname combination
//3 params test
//1. Create a request by providing query parameters: a valid region, gender and amount (must be bigger
//            than 1)
//2. Verify status code 200, content type application/json; charset=utf-8
//            3. Verify that all objects the response have the same region and gender passed in step 1
//    Amount count test
//1. Create a request by providing query parameter: amount (must be bigger than 1)
//2. Verify status code 200, content type application/json; charset=utf-8
//            3. Verify that number of objects returned in the response is same as the amount passed in step 1r
}
