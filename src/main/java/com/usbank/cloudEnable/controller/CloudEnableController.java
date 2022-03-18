package com.usbank.cloudEnable.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moandjiezana.toml.TomlWriter;
import com.usbank.cloudEnable.repository.ApplicationRepository;


@RestController
public class CloudEnableController {
//	@Autowired
//	private ApplicationRepository apprepo;
	//private ConnectToPG connection;

	@GetMapping("/greeting") //change to post mapping.
	public ResponseEntity <String> greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		
		JSONParser parser = new JSONParser();

//        try {
//            Object obj = parser.parse(new FileReader("/Users/axgarla/CloudTools/file.json"));
//
//            JSONObject jsonObject =  (JSONObject) obj;
//
//
//            System.out.println("jsonObject:"+jsonObject);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
      // System.out.println("apprepo.findAll();"+apprepo.findAll());
		//TomlObject application = new TomlObject();
		//Application application = new Application();
	//TomlWriter tomlWriter = new TomlWriter();
//		try {
//			File file = new File("/Users/axgarla/CloudTools/filename1.txt");
//			// Application appl = apprepo.findAll().get(0);
//			//System.out.println("apprepo.findAll();"+appl);
//
//			// tomlWriter.write(appl,file );
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//apprepo.findAll();
		
		//connection.getAllCatalogeName();
		return new ResponseEntity<String>("Hello from Utilities - Happy Friday Evening", HttpStatus.OK);
	}

}
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@Controller
//public class GreetingsController {
//
//	@GetMapping("/greeting")
//	public String index() {
//		return "Greetings from Spring Boot!";
//	}
//
//}
