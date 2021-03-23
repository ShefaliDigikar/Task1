package ra;
import java.util.Scanner;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.RestAssured;
import java.util.List;
import io.restassured.parsing.Parser;
import org.json.simple.JSONValue;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class Demo1_GET_Request {
	
	/*@Test
	void getUserDetails() 
	{
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET);
        String responseBody = response.getBody().asString();
        Object obj = JSONValue.parse(responseBody);
        JSONArray json = (JSONArray) obj;
        
        for (int i = 0; i < json.size(); i++) {
            Object obj1 = JSONValue.parse(json.get(i).toString());
            JSONObject obj2 = (JSONObject) obj1;
            System.out.println("Username- " + (String) obj2.get("username"));
            System.out.println("Name- " + (String) obj2.get("name"));
            System.out.println("Email- " + (String) obj2.get("email"));
            Object obj3 = JSONValue.parse(obj2.get("address").toString());
            JSONObject obj4 = (JSONObject) obj3;
            System.out.println("Street- " + (String) obj4.get("street"));
            System.out.println("Suite- " + (String) obj4.get("suite"));
            System.out.println("City- " + (String) obj4.get("city"));
            System.out.println("Phone- " + (String) obj2.get("phone"));
            System.out.println("Website- " + (String) obj2.get("website"));
            System.out.println();
	}
	}*/
	
	/*
	@Test
	void getPostDetails()
	{
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		 RequestSpecification httpRequest = RestAssured.given();
		 Response response = httpRequest.get("/posts");
		 List<String> posts = response.jsonPath().getList("body");
		 for(int i=0; i< posts.size();i++ )
		 {
			 System.out.println("Post "+(i+1)+" ");
			 System.out.println(posts.get(i));
			 System.out.println();
		 }
		 
	}*/
		 
	
	

	@Test
	void getPostComments()
	{
		String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Post ID ");
		s= sc.next();
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts/"+s;
		 RequestSpecification httpRequest = RestAssured.given();
		 Response response = httpRequest.get("/comments");
		 List<String> posts = response.jsonPath().getList("body");
		 
		 for(int i=0; i< posts.size();i++ )
		 {
			 System.out.println("Comment "+(i+1)+" ");
			 System.out.println(posts.get(i));
			 System.out.println();
		 }
		 
	}
	
	
	
	

	
}