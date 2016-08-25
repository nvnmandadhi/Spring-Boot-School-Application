package com.naveen.school.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.naveen.school.model.Role;
import com.naveen.school.model.User;
import com.naveen.school.model.UserStatus;
import com.naveen.school.repositories.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(arg0);
		String password = user.getPassword();
		boolean enabled = user.getStatus().equals(UserStatus.ACTIVE);
		boolean credentialsNotExpired = user.getStatus().equals(UserStatus.ACTIVE);
		boolean accountNonExpired = user.getStatus().equals(UserStatus.ACTIVE);
		boolean accountNonLocker = user.getStatus().equals(UserStatus.ACTIVE);

		Collection<GrantedAuthority> authorities = new ArrayList<>();
		for (Role role : user.getRoles()) {

		}
		return null;
	}

}
