package com.sigres.trading.InitialPhatStack.web.service;

/* Initial PhatStack skeleton 
 * Bisham Singh
 * June 13, 2019
 */

/* test with : http://localhost:8080/api/users
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sigres.trading.InitialPhatStack.business.service.UserService;
import com.sigres.trading.InitialPhatStack.data.entity.User;

@RestController
@RequestMapping(value="/api")
public class UserServiceController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method= RequestMethod.GET, value="/users")
	public List<User> getUsers () {
		return (this.userService.get());
		
	}

}
