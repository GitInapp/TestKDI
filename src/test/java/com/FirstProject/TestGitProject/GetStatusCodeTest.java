package com.FirstProject.TestGitProject;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GetStatusCodeTest {

 
 @BeforeClass
   public void setBaseUri () {

     RestAssured.baseURI = "http://maps.googleapis.com";
    
 }
 
 @Test
 public void test01()  {
   Response res  =given ().param ("query", "chicago")
   .when()
   .get ("/maps/api/geocode/json?address=chicago&sensor=false&#8221")
   .then()
   .contentType(ContentType.JSON)
   .extract().response();

   System.out.println (res.asString ());

}
}


