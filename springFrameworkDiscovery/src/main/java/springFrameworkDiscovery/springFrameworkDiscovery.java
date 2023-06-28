package springFrameworkDiscovery;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springFrameworkDiscovery.services.HelloWorldMessageProvider;
import springFrameworkDiscovery.services.MessageProvider;
import springFrameworkDiscovery.services.MessageRenderer;
import springFrameworkDiscovery.services.StandardOutMessageRenderer;

public class springFrameworkDiscovery {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext
                ("spring/app-context.xml");
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }

}
