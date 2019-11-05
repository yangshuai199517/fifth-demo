package fifth_demo.cdd;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public Object sayhello(){
        JsonDemo jsonDemo = new JsonDemo();
        return jsonDemo;
    }
}
