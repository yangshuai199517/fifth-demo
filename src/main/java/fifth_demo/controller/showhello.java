package fifth_demo.controller;

import fifth_demo.hello.HelloService;
import fifth_demo.hello.HelloServiceProperties;
import fifth_demo.jpa.FirstTable;
import fifth_demo.jpa.FirstTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigurationProperties(HelloServiceProperties.class )
@RestController
public class showhello {

    @Autowired
    HelloServiceProperties helloServiceProperties;
    @GetMapping("/helloo")
    public String show(){
        return helloServiceProperties.getMsg();
    }


    @Autowired
    private  FirstTableRepository firstTableRepository;
    @GetMapping("/insert")
    public String insert(@RequestParam(name = "name")String name,@RequestParam(name = "age") Long age){
        FirstTable firstTable = new FirstTable();
        firstTable.setAge(age);
        firstTable.setName(name);
        firstTableRepository.save(firstTable);


        return "success";
    }
    @GetMapping("/show")
    public FirstTable show(@RequestParam(name = "name")String name){


        return   firstTableRepository.findByName(name);
    }

}
