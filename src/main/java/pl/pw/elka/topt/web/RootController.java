package pl.pw.elka.topt.web;

/**
 * Created by Pawel on 2016-10-10.
 */

import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class RootController {

    @GetMapping
    public String home() {
        return "home";
    }
}
