package com.yeonkyu.springtest;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "showForm";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("user") User user,
                              BindingResult bindingResult) {

        System.out.println("bindingResult = " + bindingResult);

        if (bindingResult.hasErrors()) {
            return "showForm";
        }

        System.out.println("user = " + user);
        return "result";
    }
}
