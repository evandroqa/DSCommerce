package com.devsuperior.dscommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dscommerce.entities.User;
import com.devsuperior.dscommerce.services.exceptions.ForbiddenException;

@Service
public class AuthService {
	
	@Autowired
	private UserService userService;
	
	public void validateSelfOrAdmin(long userId) {
		User user = userService.authenticated();
		if (!user.hasHole("ROLE_ADMIN") && !user.getId().equals(userId)) {
			throw new ForbiddenException("Esse pedido não é seu, e vc não é ADMIN!!!");
		}
	}

}
