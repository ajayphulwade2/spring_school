package com.ajinternatinal.AjINational.controller;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping(value = {"", "/","/home"})
//	@ResponseBody
	public String homepage(Model model) {
		model.addAttribute("username", "Randy Disher");
		return "home.html";
		
	}
	/*
	 * @RequestMapping(value = {"/courses"}) public String courses(Model model) {
	 * return "courses.html";
	 * 
	 * }
	 */
	/*
	 * @GetMapping("/image") public ResponseEntity<Resource> getImage() throws
	 * Exception { // Path to the image file Path path =
	 * Paths.get("src/main/resources/static/imagespring.png"); // Load the resource
	 * Resource resource = new UrlResource(path.toUri()); // Return ResponseEntity
	 * with image content type return ResponseEntity.ok()
	 * .contentType(MediaType.IMAGE_JPEG) .body(resource); }
	 */

}
