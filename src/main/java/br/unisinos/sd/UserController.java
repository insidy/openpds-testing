package br.unisinos.sd;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import java.time.LocalDate;

import static javax.ws.rs.core.Response.ok;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@Produces(APPLICATION_JSON_UTF8_VALUE)
@Path("/user")
@Component
public class UserController {


    @GET
    public UserData test() {
        //return ok("esta é uma resposta").build();
        return new UserData();
        // example of jersey http request: https://jersey.java.net/apidocs/2.22/jersey/javax/ws/rs/client/Invocation.Builder.html
        // and more details here: http://blog.dejavu.sk/2015/01/07/reactive-jersey-client-part-2-usage-and-supported-reactive-libraries/
        // and with some code here: https://github.com/shamoh/jersey--examples--rx-client-java8-webapp
    }

    public class UserData {
        public String name = "hello";
        public int id = 1111234;
        public LocalDate date = LocalDate.now();
    }
}
