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
public class Task2 {

	void getPostsDetails()
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
		 
	}
}
