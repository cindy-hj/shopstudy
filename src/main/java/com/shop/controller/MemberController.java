package com.shop.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.shop.model.Member;
import com.shop.repository.MemberRepository;
import com.shop.service.JwtService;
import com.shop.service.MemberService;

import io.jsonwebtoken.Claims;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin("*")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@Autowired
	private JwtService jwtService;
	
	@PostMapping("/api/account/login")
	public ResponseEntity login(@RequestBody Map<String, String> params, 
			HttpServletResponse res) {
		Member member = memberService.findByIdNameAndPassword(params.get("idname"), params.get("password"));
		
//		MemberRepository.findByIdNameAndPassword("idname","password");
		
		if(member != null) {
			int id = member.getId();
			String token = jwtService.getToken("id", id);
			
			Cookie cookie = new Cookie("token", token);
			cookie.setHttpOnly(true);
			cookie.setPath("/");
			
			res.addCookie(cookie);
			
			return new ResponseEntity<>(id, HttpStatus.OK);
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/api/account/logout")
	public ResponseEntity logout(HttpServletResponse res) {
		Cookie cookie = new Cookie("token", null);
		cookie.setPath("/");
		cookie.setMaxAge(0);
		
		res.addCookie(cookie);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
		
	@GetMapping("/api/account/check")
	public ResponseEntity check(@CookieValue(value = "token", required = false)String token) {
		Claims claims = jwtService.getClaims(token);
		
		if(claims != null) {
			int id = Integer.parseInt(claims.get("id").toString());
			return new ResponseEntity<>(id, HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
	
	// 회원가입
	@PostMapping("/api/member/add")
	public ResponseEntity memberAdd(@RequestBody Member member) {
		
		Member addmember = memberService.findByIdNameAndPassword(member.getIdName(), member.getPassword());
		if(addmember == null) {
			Member newmember = new Member();
			newmember.setIdName(member.getIdName());
			newmember.setPassword(member.getPassword());
			newmember.setTel(member.getTel());
			newmember.setAddress1(member.getAddress1());
			newmember.setAddress2(member.getAddress2());
			
			memberService.save(newmember);
		}
		
		return new ResponseEntity<>(HttpStatus.OK);
	
	}
	
	
}
