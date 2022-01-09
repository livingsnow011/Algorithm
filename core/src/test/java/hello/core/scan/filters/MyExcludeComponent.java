package hello.core.scan.filters;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//애가 붙은건 제외할꺼야
public @interface MyExcludeComponent {
}
