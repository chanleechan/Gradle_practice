package project.project.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.project.domain.Member;

import java.util.List;
import java.util.Optional;

class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("하하");

        repository.save(member);
        Member result = repository.findById(member.getId()).get();
        Assertions.assertEquals(result, member);

    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("하하2");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("하하3");
        repository.save(member2);

        Member result = repository.findByName("하하2").get();

        Assertions.assertEquals(result,member1);

    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName(("하하2"));
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("하하3");
        repository.save(member2);

        List<Member> result = repository.findAll();

        Assertions.assertEquals(result.size(),2);
    }
}
