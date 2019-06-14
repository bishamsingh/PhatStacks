package com.sigres.trading.InitialPhatStack.business.service;

/* Initial PhatStack skeleton 
 * Bisham Singh
 * June 13, 2019
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigres.trading.InitialPhatStack.data.entity.User;
import com.sigres.trading.InitialPhatStack.data.repository.UserRepositary;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
	
	private UserRepositary userRepository;
	
    @Autowired
    public UserService(UserRepositary userRepository) {
        this.userRepository = userRepository;
    }

	public List<User> get () {
		
		Iterable<User> users = this.userRepository.findAll();
		
		List<User> userList = new ArrayList<User> ();
		for (User u: users) {
			userList.add(u);
		}
		return (userList);
	}
}
