package json.json;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

//import org.json.JSONArray;
//import org.json.JSONObject;

public class QuadraticGraph {

	public static void main(String[] args) throws IOException {
		
		/*
		 * Requesting information from the wolfram alpha server about a quadratic equation. 
		 * Creating a new query and using Full Results API 
		 */
		
		URL url = new URL(
				"http://api.wolframalpha.com/v2/query?appid=AW2RPT-QE67JYQ2&input=quadratic&format=image&title=plot&output=json");
		URLConnection connection = url.openConnection();

		
		String line = null;
		StringBuffer response = new StringBuffer();
		StringBuilder builder = new StringBuilder();
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		
		while ((line = reader.readLine()) != null) {
			response.append(line);
			//Print out in JSON format   
			System.out.println(line);
		}
		
		reader.close();  
		//create JSON object
		JSONObject obj = new JSONObject(response.toString());
		// Access and print out parameters from "queryresults"
		JSONObject obj1 = (JSONObject) obj.get("queryresult");
			
		System.out.println(obj.get("queryresult"));
		System.out.println(obj1.get("success"));
		System.out.println(obj1.length());
		System.out.println(obj1.get("error"));
		System.out.println(obj1.get("timing"));
		System.out.println(obj1.get("parsetiming"));
		System.out.println(obj1.get("id"));
		System.out.println(obj1.get("host"));
		System.out.println(obj1.get("server"));
		System.out.println(obj1.get("version"));
		System.out.println(obj1.get("id"));
		System.out.println(obj1.get("pods"));
		
		
		JSONArray pods = (JSONArray) obj1.get("pods");
		 System.out.println(pods.get(1));
		 System.out.println(pods.length());
		 System.out.println(pods.get(pods.length()-5));
	 
		 
		JSONObject insideArr = pods.getJSONObject(4);
		System.out.println(insideArr.length());
		System.out.println(insideArr.get("subpods"));
		
		
		JSONArray subPods = (JSONArray) insideArr.get("subpods");
		System.out.println(subPods.get(0));
		System.out.println(subPods.length());
		
		
		JSONObject obj2 = subPods.getJSONObject(0);
		System.out.println(obj2);
		System.out.println(obj2.get("img"));

		JSONObject object4 = (JSONObject) obj2.get("img");
		System.out.println(object4.get("src"));
		// link to the quadratic equation
		String link = (String) object4.get("src");
		System.out.println(link);

		// Open the browser
		Desktop browser = Desktop.getDesktop();

		try {
			browser.browse(new URI(link));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
