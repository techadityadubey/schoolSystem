package com.digi.school.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.digi.school.model.LoggedUser;
import com.digi.school.model.Users;
import com.digi.school.repository.UserLoginRepo;

@Service("customUserDetailsService")
@Transactional
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserLoginRepo userLoginRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username+" = user Name form ui");
		Users user = userLoginRepo.findByUsername(username);
		System.out.println("user="+user.toString());

		if (user == null)
			throw new UsernameNotFoundException("User Not Found");

		return new LoggedUser(user.getUsername(), user.getPassword(), user.getFirstName(), user.getLastName(),getGrantedAuthorities(user));
		

	}

	

	private List<GrantedAuthority> getGrantedAuthorities(Users user) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_"+user.getGroup().getRole().getName()));
		System.out.println(user.getGroup().getRole().getName());
		return authorities;
	}

}
