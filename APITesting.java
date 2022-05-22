import java.util.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testing.Assert;
import org.testing.annotations.Test;
import io.restassured.RestAssured.given;
import java.swing.*;
import org.testng.annotations.Test;


public class APITesting {

    @Test
    public void Get_Status() {
    RestAssured.baseURI = "http://lhr.nu.edu.pk/fsc/fyp";
    RequestSpecification request_url = given();
    Response response_url = request_url.request(Method.GET, "");
    System.out.println("The status of the requested page is ");
    System.out.println(response_url.getStatusLine());
    Response response_url1 = given().get("http://lhr.nu.edu.pk/fsc/fyp");
    assertEquals(200,response_url1.getStatusCode());
    }
}
