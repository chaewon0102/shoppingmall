package com.shop.shoppingmall;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Controller
public class shopController {
	
	@GetMapping("/main")
    public String main() {
		
    	return "pages/tables/data";
    }
	
	

}
