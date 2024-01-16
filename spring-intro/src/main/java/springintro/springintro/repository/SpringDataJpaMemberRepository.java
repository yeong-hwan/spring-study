package springintro.springintro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springintro.springintro.domain.Member;

import java.util.Optional;


public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name);
}
