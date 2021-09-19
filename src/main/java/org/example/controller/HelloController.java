package org.example.controller;

import org.example.entity.User;
import org.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    // TODO 这个注解可以不需要，一个实现的时候可以使用类型反射
    @Qualifier("impl1") //取得bean，指定bean名称为impl1
    private HelloService helloService;

    @ResponseBody
    // TODO 指定是 GET 还是 POST 请求
    @RequestMapping("/hello")   //监听hello请求
    public String hello() {
        User u1 = new User();
        u1.setName("bbb");
        u1.setAge(18);
        helloService.addUser(u1);
        helloService.delUser(4);
        User user = helloService.getUser(1);  //从Service取得id为1的数据
        return "hello " + user.getName() + ", uid=" + user.getId() + ".";
    }
}
