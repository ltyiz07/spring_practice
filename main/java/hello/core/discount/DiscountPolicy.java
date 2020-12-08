package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
	// @return占싼댐옙. 占쏙옙占쏙옙 占쏙옙占?占쌥억옙占쏙옙  
	int discount(Member member, int price);
}
