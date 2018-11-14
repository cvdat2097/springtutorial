package vng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/add")
    public @ResponseBody String addNewUser(@RequestParam String username, @RequestParam String email) {
        User usr = new User();

        usr.setEmail(email);
        usr.setUsername(username);
        userRepository.save(usr);

        return "Saved";
    }

    @GetMapping(value = "/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}