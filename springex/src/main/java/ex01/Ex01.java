package ex01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Hello hello = ctx.getBean("hello", Hello.class);
        hello.message("이이름");

        ctx.close();
    }
}
