package springFrameworkDiscovery;

import org.springframework.context.annotation.Bean;
import springFrameworkDiscovery.services.HelloWorldMessageProvider;
import springFrameworkDiscovery.services.MessageProvider;
import springFrameworkDiscovery.services.MessageRenderer;
import springFrameworkDiscovery.services.StandardOutMessageRenderer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    // equivalent to <bean id="provider" class=".."/>
    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }
    // equivalent to <bean id="renderer" class=".."/>
    @Bean
    public MessageRenderer renderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
