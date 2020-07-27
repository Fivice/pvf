package top.fivice.pvf.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index")
public class DemoController {
    @GetMapping("hello")
    public String test(){
        return "hello spring boot";
    }
}
