package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {

	Member findByIdNameAndPassword(String idname, String password);
	

}
