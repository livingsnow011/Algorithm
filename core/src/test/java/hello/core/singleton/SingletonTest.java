package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {

    @Test
    @DisplayName("스프링이 없는 순수한 DI 컨테이너")
    void pureContainer(){
        AppConfig appConfig1 = new AppConfig();
        // 1. 조회: 호출할 때마다 객체를 생성
        MemberService memberService1 = appConfig1.memberService();

        // 2. 조회: 호출할 때마다 객체를 생성
        AppConfig appConfig2 = new AppConfig();
        MemberService memberService2 = appConfig2.memberService();

        System.out.println("memberService1 = " + memberService1 );
        System.out.println("memberService2 = " + memberService2 );

        //생성된 객체 memberService 1 과 2는 다르다.
        Assertions.assertThat(memberService1).isNotSameAs(memberService2);
    }

    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
    void singletonServiceTest(){
        SingletonService singletonService1 = SingletonService.getInstance();
        SingletonService singletonService2 = SingletonService.getInstance();

        // same == , reference 타입은 주소값 비교
        // equal 자바의 equals 메서드
        Assertions.assertThat(singletonService1).isSameAs(singletonService2);
    }

    @Test
    @DisplayName("스프링 컨테이너와 싱글톤")
    void springContainer(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService1 = ac.getBean("memberService",MemberService.class);
        MemberService memberService2 = ac.getBean("memberService",MemberService.class);

        System.out.println("memberService1 = " + memberService1 );
        System.out.println("memberService2 = " + memberService2 );

        //생성된 객체 memberService 1 과 2는 다르다.
        Assertions.assertThat(memberService1).isSameAs(memberService2);
    }
}
