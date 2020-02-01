package com.microsoft.appservice.samples.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }

}

@Controller("/")
class ShowController {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello App Service from Micronaut at 4:33pm";
    }

}
