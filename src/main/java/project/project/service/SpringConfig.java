package project.project.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import project.project.repository.JdbcMemberRepository;
import project.project.repository.MemberRepository;
import project.project.repository.MemoryMemberRepository;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;

    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }
//    @Bean
//    public MemberService memberService(){
//        return new MemberService(memberRepository());
//    }
    @Bean
    public MemberRepository memberRepository(){
        return new JdbcMemberRepository(dataSource);
    }
}
