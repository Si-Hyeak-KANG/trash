
package com.noterror.app.api.domain.member.repository;

import com.noterror.app.api.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String Email);
}

