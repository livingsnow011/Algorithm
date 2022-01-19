package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//RestAPI의 REST
//뷰가 아닌 메세지 바디로 전송, 테스트할 때 사용
@RestController
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/log-test")
    public String logTest(){
        String name = "Spring";
        System.out.println("name" + name);


        log.trace("trace log={}", name);
        log.debug("trace log={}", name);

        log.info("info log={}",name);
        log.warn("info log={}",name);
        log.error("info log={}",name);

        return "ok";
    }
}
