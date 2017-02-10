package com.alvachien.learning.java.acolingo2.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.alvachien.learning.java.acolingo2.entities.Member;


public interface MemberRepository extends CrudRepository<Member, Integer> {
    List<Member> findByLastName(String lastName);
}
