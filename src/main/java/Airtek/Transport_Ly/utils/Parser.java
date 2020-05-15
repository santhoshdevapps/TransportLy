package Airtek.Transport_Ly.utils;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Parser {
	JSONParser parser;

	public JSONObject parse(String file) {

		JSONObject orderDetailJSON = null;

		parser = new JSONParser();
		try {
			Object parsedObject = parser.parse(new FileReader(file));
			orderDetailJSON = (JSONObject) parsedObject;
			if (orderDetailJSON.isEmpty()) {
				System.out.println("it is empty/invalid JSON file. Kindly add some valid json fields");
			}

		}catch (NullPointerException e) {
			System.out.println("Null pointer Exception : " + e);
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Json Parsing failed  : " + e);
			e.printStackTrace();
			
		} catch (Exception e) {
			System.out.println("Error message : " + e);
			e.printStackTrace();
		}
		return orderDetailJSON;

	}
}
