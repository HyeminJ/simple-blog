package com.example.blog.controller;

import com.example.blog.vo.Member;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BlogController {
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello, Hyemin";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Member> list(){
        List<Member> memberList = Arrays.asList(
                new Member[]{new Member(1, "Hyemin Jung", "gplas5643@gmail.com"),
                             new Member(2, "Hyemin Jung", "gplas56431@gmail.com"),
                             new Member(3, "Hyemin Jung", "gplas56431@gmail.com"),
                             new Member(4, "Hyemin Jung", "gplas56432@gmail.com"),
                             new Member(5, "Hyemin Jung", "gplas56433@gmail.com")}
                );

        //test
        long startTime = System.currentTimeMillis();
        for (Member member : memberList) {
            System.out.println(member);
        }
        System.out.println((System.currentTimeMillis() - startTime) + "ms");


        memberList.forEach(System.out::println);
        System.out.println("lamda" + (System.currentTimeMillis() - startTime) + "ms");
        //test

        return memberList;
    }
}
