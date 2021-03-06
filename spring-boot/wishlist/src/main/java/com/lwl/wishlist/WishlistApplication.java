package com.lwl.wishlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
public class WishlistApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WishlistApplication.class, args);
	}

	@Override
	protected WebApplicationContext run(SpringApplication application) {
		return super.run(application);
	}

}
