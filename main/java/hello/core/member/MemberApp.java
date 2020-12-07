package hello.core.member;

import hello.core.member.Grade;
import hello.core.member.MemberServiceImpl;
import hello.core.member.Member;
import hello.core.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member1 = new Member(1L, "James Bond", Grade.VIP);



        memberService.join(member1);
        Member findMember = memberService.findMember(1L);

        System.out.println("New Member" + member1.getName());
        System.out.println("Find Member" + findMember.getName());
        System.out.println("***********************대한민국");

    }
}

