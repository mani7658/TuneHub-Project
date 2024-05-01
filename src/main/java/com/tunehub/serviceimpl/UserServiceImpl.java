package com.tunehub.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.entity.User;
import com.tunehub.repository.UserRepository;
import com.tunehub.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
    @Autowired
    UserRepository userRepository;
	private User user;
  
	
	@Override
	public void saveUser(User user) {
    	userRepository.save(user);
		
	}
	public User emailExists(User user) {
    	if(userRepository.findByEmail(user.getEmail())!=null){
    		System.out.println("Present");
    		return user;
    		}
    	else {
    		System.out.println("Absent");
    		return null;
    	}
		
	}
	@Override
	public boolean validUser(String email, String password) {
		
    	User user=userRepository.findByEmail(email);
    	
    	String dbpwd = user.getPassword();
    	
    	if(password.equals(dbpwd)) {
    	return true;
    	}else {
		return false;
		
	}
	}
	@Override
	public String getRole(String email) {
		User user=userRepository.findByEmail(email);
		
		return user.getRole();
	}

}
	
