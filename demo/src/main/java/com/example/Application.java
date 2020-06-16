package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.Micronaut;

@Controller("/hello")
public class Application {

	@Get
	public String get() {
		return "Hello, Anand";
	}
    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}
