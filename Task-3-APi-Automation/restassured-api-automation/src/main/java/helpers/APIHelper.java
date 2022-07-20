package helpers;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;


/**
 * APIHelper contains base level REST API operations using rest-assured 
 *
 * @author ravi.jaisinghani
 */
public class APIHelper {
	
	private static String baseURL = "http://localhost:8080/api/v3";
	

    public static Response post(String path, String requestPayload){
    	String apiPath = baseURL + path;
        return given().
        		contentType(ContentType.JSON).
        		accept(ContentType.JSON).
                body(requestPayload).
                when().
                post(apiPath).
                then().
                extract().
                response();
    }

    public static Response get(String path){
    	String apiPath = baseURL + path;
        return given().
        		contentType(ContentType.JSON).
        		accept(ContentType.JSON).
        		when().
        		get(apiPath).
        		then().
        		extract().
        		response();
    }

    public static Response put(String path, String requestPayload){
    	String apiPath = baseURL + path;
        return given().
        		contentType(ContentType.JSON).
        		accept(ContentType.JSON).
                body(requestPayload).
                when().
                put(apiPath).
                then().
                extract().
                response();
    }
    
    public static Response delete(String path){
    	String apiPath = baseURL + path;
        return given().
        		contentType(ContentType.JSON).
        		accept(ContentType.JSON).
                when().
                delete(apiPath).
                then().
                extract().
                response();
    }
}
