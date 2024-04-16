package com.franklin.OnlineVoting.Controllers;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController implements ErrorController {

    
    
    @GetMapping(value = {"/", "", "/index"})
    public String index() {
       
        return "index";
    }
            
    @GetMapping("/photos")
    public String photos(){
        return "photos";

    }
    
    @GetMapping("/video")
    public String video(){
        return "video";

    }

}
    
   