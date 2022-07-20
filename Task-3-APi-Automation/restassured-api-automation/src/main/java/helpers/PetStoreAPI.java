package helpers;

import org.json.JSONObject;

import io.restassured.response.Response;

/**
 * PetStoreAPI contains modular function to hit API call's on Pet swagger tool 
 *
 * @author ravi.jaisinghani
 */

public class PetStoreAPI extends APIHelper {
	
	/*This method will create a Pet in Petstore */
	public static Response createPet(int petId,String petName,String categoryName) { 
		String apiPath = "/pet";
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("id",petId);
		jsonObject.put("name", petName);
		JSONObject jsonObjectCategory = new JSONObject();
		jsonObjectCategory.put("id", 1);
		jsonObjectCategory.put("name", categoryName);
		
		jsonObject.put("category",jsonObjectCategory);
		jsonObject.put("status", "available");
		String payloadString = jsonObject.toString();
		Response createPetResponse = APIHelper.post(apiPath, payloadString);
		
		return createPetResponse;
	}
	
	
	/*This method will read a Pet details in Petstore */
	public static Response readPetByID(int Id) { 
		String apiPath = "/pet";
		
		apiPath=apiPath+"/"+String.valueOf(Id);
		
		Response readPetResponse = APIHelper.get(apiPath);
		
		return readPetResponse;
	}
	
	
	/*This method will update a Pet in Petstore */
	public static Response updatePetByID(int petId,String UpdatepetName,String categoryName) { 
		String apiPath = "/pet";
				
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("id",petId);
		jsonObject.put("name", UpdatepetName);
		JSONObject jsonObjectCategory = new JSONObject();
		jsonObjectCategory.put("id", 1);
		jsonObjectCategory.put("name",categoryName );
		
		jsonObject.put("category",jsonObjectCategory);
		jsonObject.put("status", "available");
		String payloadString = jsonObject.toString();
		
		Response updatePetResponse = APIHelper.put(apiPath,payloadString);
		
		return updatePetResponse;
	}
	
	
	/*This method will delete a Pet in Petstore */
	public static Response deletePetByID(int Id) { 
		String apiPath = "/pet";
		
		apiPath=apiPath+"/"+String.valueOf(Id);
		
		Response readPetResponse = APIHelper.delete(apiPath);
		
		return readPetResponse;
	}
	
	
	/*This method will create a order in Petstore */
	
	public static Response createStoreOrder(int orderId,int petId,int quantity) { 
		String apiPath = "/store/order";
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("id",orderId);
		jsonObject.put("petId", petId);
		jsonObject.put("quantity", quantity);
		
		jsonObject.put("shipDate","2022-07-20T14:19:22.767Z");
		jsonObject.put("status", "approved");
		
		jsonObject.put("complete", true);
		
		String payloadString = jsonObject.toString();
		Response createStoreOrderResponse = APIHelper.post(apiPath, payloadString);
		
		return createStoreOrderResponse;
	}
	
	
	/*This method will read a order in Petstore */
	public static Response readStoreOrderByID(int Id) { 
		String apiPath = "/store/order";
		
		apiPath=apiPath+"/"+String.valueOf(Id);
		
		Response readStoreObjectResponse = APIHelper.get(apiPath);
		
		return readStoreObjectResponse;
	}
	
	
	/*This method will delete a order in Petstore */
	public static Response deleteStoreOrderByID(int Id) { 
		String apiPath = "/store/order";
		
		apiPath=apiPath+"/"+String.valueOf(Id);
		
		Response readStoreObjectResponse = APIHelper.delete(apiPath);
		
		return readStoreObjectResponse;
	}
	
	/*This method will create a User in Petstore */
	public static Response createUser(int userId,String userName,String firstName,String lastName,String email) { 
		String apiPath = "/user";
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("id",userId);
		jsonObject.put("username", userName);
		jsonObject.put("firstName", firstName);
		
		jsonObject.put("lastName",lastName);
		jsonObject.put("email", email);
		
		jsonObject.put("password", "12345");
		jsonObject.put("phone", "12345");
		jsonObject.put("userStatus", 1);
		
		
		String payloadString = jsonObject.toString();
		Response createUserResponse = APIHelper.post(apiPath, payloadString);
		
		return createUserResponse;
	}
	
	
	/*This method will read a user details in Petstore */
	public static Response readUserByUserName(String userName) { 
		String apiPath = "/user";
		
		apiPath=apiPath+"/"+userName;
		
		Response readUserResponse = APIHelper.get(apiPath);
		
		return readUserResponse;
	}
	
	/*This method will update a user details in Petstore */
	public static Response updateUserByUserName(int userId,String userName,String updatefirstName,String lastName,String email) { 
		String apiPath = "/user";
		
		apiPath=apiPath+"/"+userName;
		
        JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("id",userId);
		jsonObject.put("username",userName );
		jsonObject.put("firstName", updatefirstName);
		
		jsonObject.put("lastName",lastName);
		jsonObject.put("email", email);
		
		jsonObject.put("password", "12345");
		jsonObject.put("phone", "12345");
		jsonObject.put("userStatus", 1);
		
		
		String payloadString = jsonObject.toString();
		Response updateUserResponse = APIHelper.put(apiPath,payloadString);
		
		return updateUserResponse;
	}
	
	/*This method will delete a User in Petstore */
	public static Response deleteUserByUserName(String userName) { 
		String apiPath = "/user";
		
		apiPath=apiPath+"/"+userName;
		
		Response readUserResponse = APIHelper.delete(apiPath);
		
		return readUserResponse;
	}
	
		
	

}
