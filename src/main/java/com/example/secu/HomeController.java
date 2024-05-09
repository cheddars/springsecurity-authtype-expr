package com.example.secu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String index(){
    return "index";
  }

  @GetMapping("/user.html")
  public String user(){
    return "user";
  }

  @GetMapping("/admin.html")
  public String admin(){
    return "admin";
  }
}
