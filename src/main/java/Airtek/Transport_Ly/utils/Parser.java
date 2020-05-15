package Airtek.Transport_Ly.utils;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Parser {
	JSONParser parser;

	public JSONObject parse(String file) {

		JSONObject orderDetailJSON = null;

		parser = new JSONParser();
		try {
			Object parsedObject = parser.parse(new FileReader(file));
			orderDetailJSON = (JSONObject) parsedObject;

		} catch (Exception e) {
			System.out.println("Error message : " + e);
			e.printStackTrace();
		}
		return orderDetailJSON;

	}
}
