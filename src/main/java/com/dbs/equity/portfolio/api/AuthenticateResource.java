package com.dbs.equity.portfolio.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.equity.portfolio.model.AuthenticationRequest;
import com.dbs.equity.portfolio.model.AuthenticationResponse;
import com.dbs.equity.portfolio.service.MyUserDetailsService;
import com.dbs.equity.portfolio.util.JwtUtil;

@RestController
@RequestMapping("/v1/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AuthenticateResource {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private MyUserDetailsService myUserDetailsService;

	@Autowired
	private JwtUtil jwtUtil;

	@PostMapping(value = "/authenticate")
	public ResponseEntity<AuthenticationResponse> createToken(@RequestBody AuthenticationRequest authenticateRequest) throws Exception {

		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticateRequest.getUsername(),
				authenticateRequest.getPassword()));

		final UserDetails userDetails = myUserDetailsService.loadUserByUsername(authenticateRequest.getUsername());
		final String jwt = jwtUtil.generateToken(userDetails);
		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}

}
