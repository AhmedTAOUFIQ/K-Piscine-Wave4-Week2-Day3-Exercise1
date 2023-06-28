package springFrameworkDiscovery;


import springFrameworkDiscovery.services.HelloWorldMessageProvider;
import springFrameworkDiscovery.services.MessageProvider;
import springFrameworkDiscovery.services.MessageRenderer;
import springFrameworkDiscovery.services.StandardOutMessageRenderer;

public class springFrameworkDiscovery {

    public static void main(String[] args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }

}
