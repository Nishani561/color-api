package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pro3 {
    @RequestMapping("/")
	public String getMyFav(){
        String yourFavColor ="Green";
        return "My favorite color is" + yourFavColor;
	}
}
