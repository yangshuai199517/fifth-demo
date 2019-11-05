package fifth_demo.hello;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "hello")
@PropertySource("classpath:application.properties")
public class HelloServiceProperties {
    private static final  String MSG = "world";
    private String msg = MSG;
    public void setMsg(String msg) {
    this.msg = msg;
}
    public String getMsg(){
        return this.msg;
    }
}
