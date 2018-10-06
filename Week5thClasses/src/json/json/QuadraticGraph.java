package json.json;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;


//import org.json.JSONArray;
//import org.json.JSONObject;


public class QuadraticGraph {




	


	
	public static void main(String[] args) throws IOException {



	URL url = new URL("http://api.wolframalpha.com/v2/query?appid=AW2RPT-QE67JYQ2XT&input=quadratic&format=image&title=plot&output=json");
	URLConnection connection = url.openConnection();

	//connection.addRequestProperty("Referer",  "http://google.com");
	//connection.setDoOutput(true);
	//connection.setAllowUserInteraction(false);
	String line=null;
	StringBuffer response = new StringBuffer(); 
	StringBuilder builder = new StringBuilder();
	BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

	while((line = reader.readLine()) != null) {
	   response.append(line);
	   //System.out.println(line);
	  }
	//System.out.println();
	reader.close();
	JSONObject obj = new JSONObject(response.toString()); 

	JSONObject dd= (JSONObject) obj.get("queryresult"); 

	System.out.println(obj.get("queryresult"));
	System.out.println(dd.get("success"));
	System.out.println(dd.length());
	System.out.println(dd.get("error"));
	System.out.println(dd.get("timing"));
	System.out.println(dd.get("parsetiming"));
	System.out.println(dd.get("id"));
	System.out.println(dd.get("host"));
	System.out.println(dd.get("server"));
	System.out.println(dd.get("version"));

	System.out.println(dd.get("id"));
	System.out.println(dd.get("pods"));

	//JSONObject ee = dd.getJSONObject("subpods"); 
	//System.out.println(ee);

	//System.out.println(dd.get("subpods"));
	//System.out.println(dd.get("img"));
	//SONOBject res = wolframJson.get("queryresult");

	//JSONArray arr = pod.getJSONArray("subpod");
	JSONArray pod = (JSONArray) dd.get("pods");
	System.out.println(pod.get(1));
	System.out.println(pod.length());
	System.out.println(pod.get(pod.length()-5));
	JSONObject insideArr = pod.getJSONObject(4); 
	System.out.println(insideArr.get("subpods"));
	System.out.println(insideArr.length());
	JSONArray pod2 = (JSONArray) insideArr.get("subpods");
	System.out.println(pod2.get(0));
	System.out.println(pod2.length()); 
	JSONObject ob3 = pod2.getJSONObject(0);
	System.out.println(ob3);
	System.out.println(ob3.get("img"));

	JSONObject ob4= (JSONObject) ob3.get("img");

	System.out.println("////////////////////n\n");
	System.out.println(ob4.get("src"));
	String link = (String) ob4.get("src");
	System.out.println(link);

	Desktop d = Desktop.getDesktop();

	try {
	    d.browse(new URI(link));
	} 
	catch (Exception e)
	{
		System.out.println(e.getMessage());
	} 





	//JSONArray arins = (JSONArray) insideArr.get(""); 

	//System.out.println(pod.get(1));
	//System.out.println("dddd");



	//System.out.println(spod);
	//System.out.println(pod);
	//[{"subpods":
		//[{"img":
		//{"src":"http://www3.wolframalpha.com/Calculate/MSP/MSP16186213c4ee58f2798bd00006693ac2f319gb6cf?MSPStoreType=image/gif&s=45","alt":"quadratic formula","width":136,"title":"quadratic formula","height":23},"title":""}],"scanner":"Formula","numsubpods":1,"id":"Input","position":100,"title":"Input interpretation","error":false},{"subpods":[{"img":{"src":"http://www3.wolframalpha.com/Calculate/MSP/MSP16187213c4ee58f2798bd00004chg39h354a8044e?MSPStoreType=image/gif&s=45","alt":"x^2 - 2 x + 1 = 0\na x^2 + b x + c = 0 | \nx | indeterminate variable\na | quadratic coefficient\nb | linear coefficient\nc | constant coefficient\n(x = (-b ± sqrt(b^2 - 4 a c))/(2 a))","width":204,"title":"x^2 - 2 x + 1 = 0\na x^2 + b x + c = 0 | \nx | indeterminate variable\na | quadratic coefficient\nb | linear coefficient\nc | constant coefficient\n(x = (-b ± sqrt(b^2 - 4 a c))/(2 a))","height":243},"title":""}],"scanner":"Formula","numsubpods":1,"id":"Equation","position":200,"title":"Equation","error":false},{"subpods":[{"img":{"src":"http://www3.wolframalpha.com/Calculate/MSP/MSP16188213c4ee58f2798bd000061bf73881c74c403?MSPStoreType=image/gif&s=45","alt":"quadratic coefficient | 1\nlinear coefficient | -2\nconstant coefficient | 1","width":200,"title":"quadratic coefficient | 1\nlinear coefficient | -2\nconstant coefficient | 1","height":100},"title":""}],"scanner":"Formula","numsubpods":1,"id":"InputValue","position":300,"title":"Input values","error":false},{"subpods":[{"img":{"src":"http://www3.wolframalpha.com/Calculate/MSP/MSP16189213c4ee58f2798bd00004hgdd5ihbc67h1ff?MSPStoreType=image/gif&s=45","alt":"indeterminate variable | 1\n(doubly degenerate)","width":204,"title":"indeterminate variable | 1\n(doubly degenerate)","height":58},"title":""}],"scanner":"Formula","numsubpods":1,"id":"Result","position":400,"title":"Result","error":false,"primary":true,"states":[{"input":"Result__Step-by-step solution","name":"Step-by-step solution"}]},{"subpods":[{"img":{"src":"http://www3.wolframalpha.com/Calculate/MSP/MSP16190213c4ee58f2798bd000028eh7bh7g7ig4a1f?MSPStoreType=image/gif&s=45","alt":"","width":300,"title":"","height":183},"title":""}],"scanner":"Formula","numsubpods":1,"id":"Plot","position":500,"title":"Plot","error":false}]

	//JSONObject o = dd.getJSONObject("success"); 
	//System.out.println(o);
	//JSONArray arr = dd.getJSONArray("subpods"); 
	//System.out.println(arr);

	}}


}
