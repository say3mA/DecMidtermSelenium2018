package json.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import javax.json.Json;
import javax.json.stream.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY

      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.
https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=0d9e35dfa3c140aab8bf9cdd70df957f
     */
    public static void main(String[] args)throws MalformedURLException, IOException {
        String sURL = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=0d9e35dfa3c140aab8bf9cdd70df957f";
        Employee emp = null;
        List<Employee> empList = new ArrayList<>();
        URL url = new URL(sURL);
        /**URLConnection request = url.openConnection();
        request.connect();
        JsonArray jsonArray = null;
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        if (root instanceof JsonObject) {
            JsonObject rootObj = root.getAsJsonObject();
        } else if (root instanceof JsonArray) {
            jsonArray = root.getAsJsonArray();
        }
        //Employee[] a = new Employee[jsonArray.size()];
        for (int i = 0; i < 10; i++) {
            try {
                JsonObject jsonobject = jsonArray.get(i).getAsJsonObject();
                JsonElement element = jsonobject.get("articles");
                String a = element.toString();
                System.out.print(a);
            } catch (Exception e) {
                System.out.print("error");
            }**/
        InputStream is = url.openStream();
        JsonParser parser = Json.createParser(is);
        while (parser.hasNext()) {
                     JsonParser.Event e = parser.next();
                     if (e == JsonParser.Event.KEY_NAME) {
                             switch (parser.getString()) {
                                    case "author":
                                             parser.next();
                                            System.out.print(parser.getString());
                                            System.out.print(": ");
                                            break;
                                    case "title":
                                            parser.next();
                                            System.out.println(parser.getString());
                                            System.out.println("---------");
                                            break;
                                 }
                       }

        }
    }}

        //public static void main(String[] args)throws MalformedURLException, IOException {
//        String sURL = "http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources";
//        Employee emp = null;
//        List<Employee> empList = new ArrayList<>();
//        URL url = new URL(sURL);
//        URLConnection request = url.openConnection();
//        request.connect();
//        JsonArray  jsonArray = null;
//        JsonParser jp = new JsonParser();
//        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
//        if (root instanceof JsonObject) {
//            JsonObject rootObj = root.getAsJsonObject();
//        } else if (root instanceof JsonArray) {
//            jsonArray =  root.getAsJsonArray();
//        }
//        //Employee[] a = new Employee[jsonArray.size()];
//        for (int i = 0; i < jsonArray.size()-1; i++) {
//            try {
//                JsonObject jsonobject = jsonArray.get(i).getAsJsonObject();
//                //you code start here
//                JsonElement empEmail = jsonobject.get("empEmail");
//                JsonElement empName = jsonobject.get("empName");
//                JsonElement salary = jsonobject.get("salary");
//                JsonElement department = jsonobject.get("department");
//
//
//               /** a[i].setDepartment(department.toString());
//                a[i].setEmpEmail(empEmail.toString());
//                a[i].setEmpName(empName.toString());
//                a[i].setSalary(salary.toString());
//**/
//                System.out.println(empEmail.toString() + " " + empName.toString() + " " + salary.toString() + " " + department.toString());
//
//
//            }catch(Exception ex){
//
//            }
//        }
//        //Print to the console.
//        /**for(int i = 0; i < a.length-1; i++){
//            empList.add(i,a[i]);
//        }**/