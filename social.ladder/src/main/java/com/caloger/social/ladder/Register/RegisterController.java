package com.caloger.social.ladder.Register;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @GetMapping("")
    public ModelAndView RegistrationForm(ModelMap model, HttpServletRequest httpServletRequest) {

        return new ModelAndView("Registration/register", model);
    }

    @GetMapping("/success")
    public ModelAndView RegistrationFormWithErrors() {
        return new ModelAndView("Registration/success");
    }

    @PostMapping("")
    public RedirectView handleRegistration(RegistrationRequest registrationRequest, RedirectAttributes redirectAttributes) {
        RegistrationResponse registrationResponse = new RegistrationResponse();
        boolean error = false;
        if(registrationRequest.getEmail() == "") {
            error = true;
            registrationResponse.setEmailError("Email is missing.");
        }

        if(!registrationRequest.getPassword().equals(registrationRequest.getPasswordConfirmation())){
            error = true;
            registrationResponse.setPasswordError("Passwords do not match.");
        }

        if(registrationRequest.getPassword() == ""){
            error = true;
            registrationResponse.setPasswordError("Password is missing.");
        }

        if(error) {
            redirectAttributes.addFlashAttribute("emailError", registrationResponse.getEmailError());
            redirectAttributes.addFlashAttribute("passwordError", registrationResponse.getPasswordError());
            return new RedirectView("/register");
        } else {
            return new RedirectView("/register/success");
        }
    }
}
