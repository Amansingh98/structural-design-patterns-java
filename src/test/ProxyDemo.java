package test;

import com.proxy_pattern.ExpensiveObject;
import com.proxy_pattern.ExpensiveObjectProxy;
import org.junit.Test;

public class ProxyDemo {

    @Test
    public void ExpensiveObjectProxyTest(){
        ExpensiveObject expensiveObject = new ExpensiveObjectProxy();
        expensiveObject.process();
        expensiveObject.process();
    }
}
