package fifth_demo.hello;


import org.springframework.stereotype.Component;

public class HelloService {
    private String msg;
    public String sayHello(){
        return "hello"+msg;
    }
    public void setMsg( String msg){
        this.msg = msg;
    }

}
