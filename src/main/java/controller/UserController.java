package controller;

import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import repository.UserRepository;


@Controller
@RequestMapping("/")
public class UserController {
    private UserRepository userRepository;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegisterPage() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String doRegister(User user) {
        userRepository.save(user);

        return "redirect:/showNewUser/" + user.getEmployeeNo();
    }

    @RequestMapping(value = "/showNewUser/{employeeNo}", method = RequestMethod.GET)
    public String showNewUser(@PathVariable String employeeNo, Model model) {
        User user = userRepository.findByEmployeeNo(employeeNo);
        model.addAttribute(user);
        return "showNewUser";
    }


}
