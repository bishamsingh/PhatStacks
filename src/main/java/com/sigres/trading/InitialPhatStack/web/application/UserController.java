package com.sigres.trading.InitialPhatStack.web.application;

/* Initial PhatStack skeleton 
 * Bisham Singh
 * June 13, 2019
 */

/* test with : http://localhost:8080/users
 * 
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sigres.trading.InitialPhatStack.business.service.UserService;
import com.sigres.trading.InitialPhatStack.data.entity.User;

import java.util.List;

@Controller
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
    @RequestMapping(method= RequestMethod.GET)
    public String getUsers(Model model) {
    	
        List<User> userList = this.userService.get();
        
        for (User u: userList)
        	System.out.println("Here " + u.getFirstName());
        
        model.addAttribute("users", userList);
        return ("users");
    }

}
