package practice.task_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

  @GetMapping("/register")
  public String registerView(){
    return "register";
  }
}
