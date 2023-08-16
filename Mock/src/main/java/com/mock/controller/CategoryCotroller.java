package com.mock.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mock.entity.Category;

@RestController
@RequestMapping(path = "category")
public class CategoryCotroller {
	
	static List<Category> categories = new ArrayList<>();
	
	
@GetMapping()
@ResponseBody
public List<Category> getAllCategories(){
	return categories;
}

}
