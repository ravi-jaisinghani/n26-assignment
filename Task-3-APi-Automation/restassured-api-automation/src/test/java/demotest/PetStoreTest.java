package demotest;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.jayway.jsonpath.JsonPath;
import helpers.PetStoreAPI;
import io.restassured.response.Response;



/**
 * PetStoreTest contains Test cases for all PetSwagger API tool 
 *
 * @author ravi.jaisinghani
 */


public class PetStoreTest extends PetStoreAPI {
	
	
	Random random= new Random();
	final int id = random.nextInt(100);
	final int quantity = 5;
	final String randomString = RandomStringUtils.randomAlphabetic(4).toLowerCase();
	final String petName = "pet_"+randomString;
	final String categoryName = "category_"+randomString;
	final String userName = "user_"+randomString;
	final String firstName = "first_"+randomString;
	final String lastName = "last_"+randomString;
	final String email = userName+"@example.com";

	//This Test covers CRUD operation on /pet API
	@Test(priority=1)
	public void petCRUDoperationsTest() {

		String jsonResponseString;
		String updatePetName="update_"+randomString;
		Response res = PetStoreAPI.createPet(id,petName,categoryName);		
		System.out.println("Create Pet Response::\n"+ res.asString());
		
		
		Assert.assertEquals(res.statusCode(), 200);
		jsonResponseString = res.asString();
		Assert.assertEquals(petName, JsonPath.read(jsonResponseString, "$.name"));
		
		res = PetStoreAPI.readPetByID(id);
		System.out.println("Read Pet Response::\n"+ res.asString());
		Assert.assertEquals(res.statusCode(), 200);
		jsonResponseString = res.asString();
		Assert.assertEquals(petName, JsonPath.read(jsonResponseString, "$.name"));
		
		
		res = PetStoreAPI.updatePetByID(id,updatePetName,categoryName);
		System.out.println("Read Pet Response::\n"+ res.asString());
		Assert.assertEquals(res.statusCode(), 200);
		jsonResponseString = res.asString();
		Assert.assertEquals(updatePetName, JsonPath.read(jsonResponseString, "$.name"));
		
		
		res = PetStoreAPI.deletePetByID(id);
		System.out.println("Delete Pet Response::\n"+ res.asString());
		Assert.assertEquals(res.statusCode(), 200);
		
	}
	
	//This Test covers CRUD operation on /order API
	@Test(priority=2)
	public void orderCRUDoperationsTest() {

		
		String jsonResponseString;
		Response res = PetStoreAPI.createStoreOrder(id,id,quantity);		
		System.out.println("Create order Response::\n"+ res.asString());
		Assert.assertEquals(res.statusCode(), 200);
		jsonResponseString = res.asString();
		Assert.assertEquals(String.valueOf(id), JsonPath.read(jsonResponseString, "$.id").toString());
		
		res = PetStoreAPI.readStoreOrderByID(id);
		System.out.println("Read order Response::\n"+ res.asString());
		Assert.assertEquals(res.statusCode(), 200);
		jsonResponseString = res.asString();
		Assert.assertEquals(String.valueOf(id), JsonPath.read(jsonResponseString, "$.id").toString());
		
				
		res = PetStoreAPI.deleteStoreOrderByID(id);
		System.out.println("Delete order Response::\n"+ res.asString());
		Assert.assertEquals(res.statusCode(), 200);
		

	}
	
	//This Test covers CRUD operation on /user API
	@Test(priority=3)
	public void userCRUDoperationsTest() {

		String jsonResponseString;
		String updateFirstName="update_first_"+randomString;
		
		Response res = PetStoreAPI.createUser(id,userName,firstName,lastName,email);		
		System.out.println("Create User Response::\n"+ res.asString());
		Assert.assertEquals(res.statusCode(), 200);
		jsonResponseString = res.asString();
		Assert.assertEquals(userName, JsonPath.read(jsonResponseString, "$.username"));
		
		res = PetStoreAPI.readUserByUserName(userName);
		System.out.println("Read User Response::\n"+ res.asString());
		Assert.assertEquals(res.statusCode(), 200);
		jsonResponseString = res.asString();
		Assert.assertEquals(userName, JsonPath.read(jsonResponseString, "$.username"));
		
		
		res = PetStoreAPI.updateUserByUserName(id,userName,updateFirstName,lastName,email);
		System.out.println("Update User Response::\n"+ res.asString());
		Assert.assertEquals(res.statusCode(), 200);
		jsonResponseString = res.asString();
		Assert.assertEquals(updateFirstName, JsonPath.read(jsonResponseString, "$.firstName"));
		
		
		res = PetStoreAPI.deleteUserByUserName(userName);
		System.out.println("Delete User Response::\n"+ res.asString());
		Assert.assertEquals(res.statusCode(), 200);
		

	}
	
	
}
