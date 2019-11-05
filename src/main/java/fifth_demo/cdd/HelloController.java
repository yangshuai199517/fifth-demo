package fifth_demo.cdd;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public Object sayhello(){
        JsonDemos jsonDemo = new JsonDemos();
        int i=100;
        return jsonDemo;
    }
}
