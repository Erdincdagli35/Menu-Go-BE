package com.edsoft.ed.soft;

import com.edsoft.ed.soft.model.MenuItem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MenuGoApplication {

	public static void main(String[] args) {
		//MenuItem menuItem = new MenuItem("Espresso","Single Espresso",20.0);
		SpringApplication.run(MenuGoApplication.class, args);
	}

}
