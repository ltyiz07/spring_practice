package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("10% discount for VIP")
    void vip_o() {
        // given
        Member member = new Member(1L, "memberVIP", Grade.VIP);
        // when
        int discount1 = discountPolicy.discount(member, 1000);
        // then
        Assertions.assertThat(discount1).isEqualTo(100);
    }

    @Test
    @DisplayName("no discount for NORMAL client")
    void vip_x() {
        Member member = new Member(1L, "memberBasic", Grade.BASIC);

        int discount = discountPolicy.discount(member, 20000);

        Assertions.assertThat(discount).isEqualTo(0);
    }

}
