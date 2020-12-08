package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {

	public static void main(String[] args) {
		AppConfig appConfig = new AppConfig();
		MemberService memberService =appConfig.memberService(); 
		OrderService orderService = appConfig.orderService();
		
		Long memberId = 1L;
		Member member = new Member(memberId, "JamesbondA", Grade.VIP);
		Member member2 = new Member(2L, "JamesbondF", Grade.BASIC);
		memberService.join(member);
		memberService.join(member2);
		
		Order order = orderService.createOrder(memberId, "占쏙옙占쏙옙占썲갑", 25000);
		System.out.println("order==" + order);
		Order order2 = orderService.createOrder(2L, "占쏙옙占쏙옙占썲갑", 25000);
		System.out.println("order==" + order2);

	}

}
