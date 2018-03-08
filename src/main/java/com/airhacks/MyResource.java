package com.airhacks;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDateTime;

@Path("test")
public class MyResource {

    @GET
    public String hellowWorld() {
        return "Hello world! It's " + LocalDateTime.now();
    }
}
