package com.Json.WriteJson;

//Writing JSON into a file
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class App {

	public static void main(String[] args) {
		//First Json Object
      JSONObject obj = new JSONObject();
      
      //Key Value Pairs
      obj.put("FirstName", "Dipen");
      obj.put("LastName", "Sirsat");
      obj.put("Email", "dipensirsat@gmail.com");
      obj.put("Contact","9822389292");
      
       
      //Write JSON file
      try (FileWriter file = new FileWriter("JSON File//Details.json")) {
          file.write(obj.toJSONString()); 
          file.flush();

      } catch (IOException e) {
          e.printStackTrace();
      }
      
      System.out.println("JSON file created");
	}

}