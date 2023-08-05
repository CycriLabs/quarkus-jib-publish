package com.cycrilabs.eam.comments.server;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@RequestScoped
@Path("hello")
public class CommentsResource {
    @GET
    public String create() {
        return "Hello";
    }
}
