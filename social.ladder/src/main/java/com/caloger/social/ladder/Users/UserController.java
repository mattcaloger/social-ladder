package com.caloger.social.ladder.Users;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("")
    public ModelAndView UserHome(Authentication authentication, ModelMap modelMap) {
        UserDetails details = (UserDetails) authentication.getPrincipal();

        modelMap.addAttribute("username", details.getUsername());
        return new ModelAndView("user/user", modelMap);
    }
}
