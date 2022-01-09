package hello.core.scan.filters;


import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//애가 붙은 거는 추가할 거야
public @interface MyIncludeComponent {
}
