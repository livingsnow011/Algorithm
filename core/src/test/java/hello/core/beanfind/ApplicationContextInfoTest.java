package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean(){
        String [] beanDefinitionmNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionmName : beanDefinitionmNames) {
            //오브젝트가 나온다.
            Object bean = ac.getBean(beanDefinitionmName);
            System.out.println("name = " + beanDefinitionmName +
                    " obeject = " + bean);
        }
    }

    @Test
    @DisplayName("애플리케이션(내가 설정한) 빈 출력하기")
    void findApplicationBean(){
        String [] beanDefinitionmNames = ac.getBeanDefinitionNames();

        for (String beanDefinitionmName : beanDefinitionmNames) {
            //BeanDefinition 빈에 대한 메타데이터
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionmName);
            //BeanDefiniton.role -> BeanDefinition.ROLE_APPLICATION
            //내가 어플리케이션을 개발하려고 작성한 빈들
            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = ac.getBean(beanDefinitionmName);
                System.out.println("name = " + beanDefinitionmName + " obeject = " + bean);
            }
        }
    }
}
