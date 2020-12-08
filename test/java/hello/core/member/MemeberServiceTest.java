package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberSeviceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        // given
        Member member = new Member(1L, "Michael", Grade.VIP);
        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        // then
//        Assertions.assertTrue().isEqualTo(member.getName());
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
