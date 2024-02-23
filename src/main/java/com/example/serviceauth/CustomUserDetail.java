package com.example.serviceauth;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.entity.User;


public class CustomUserDetail implements UserDetails {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	
	public CustomUserDetail(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return List.of(() -> user.getPrivilage());
	}
	
	public String getName() {
		return user.getName();
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getEmpid();
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return user.getEmpemail();
	}

	public String getEmpmobile() {
		// TODO Auto-generated method stub
		return user.getEmpmobile();
	}
	
	public Boolean getAvailability() {
		// TODO Auto-generated method stub
		return user.getAvailability();
	}
	
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}

