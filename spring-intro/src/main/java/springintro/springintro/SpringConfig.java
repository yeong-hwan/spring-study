package springintro.springintro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springintro.springintro.repository.MemberRepository;
import springintro.springintro.repository.MemoryMemberRepository;
import springintro.springintro.service.MemberService;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
