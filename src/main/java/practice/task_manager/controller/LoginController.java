package practice.task_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import practice.task_manager.LoginForm;

@Controller
public class LoginController {

  @GetMapping("/login")
  public String loginView(LoginForm form){
    return "login";
  }
}
