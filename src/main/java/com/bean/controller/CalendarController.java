package com.bean.controller;

import com.bean.service.UserService;
import com.bean.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mac on 2017. 6. 18..
 */
@Controller
@RequestMapping("/calendar")
public class CalendarController {


    @RequestMapping("/hello")
    public String hello(Model model) {
        System.out.println("hello() 실행은 됨");
        model.addAttribute("message", "Hello, World!!!");
        return "hello";
    }

    @RequestMapping("/calendar")
    public String list(Model model) {
        System.out.println("dddd");
        return "calendar/calendar";
    }

// 페이지 조회하면서 넘길 시..페이지에가 모델을 덜져서...js에서 처리하여 화면에 매핑하여 주면 될듯..
    


//    @Autowired
//    private UserService userService;

//    @RequestMapping("/list")
//    public String list(Model model) {
//        System.out.println(userService.findAll());
//        model.addAttribute("list", userService.findAll());
//        return "user/list";
//    }
//
//    @GetMapping("/add")
//    public String add() {
//        return "user/add";
//    }
//
//    @PostMapping("/add")
//    public String postUser(User user) {
//        userService.save(user);
//        return "redirect:/user/list";
//    }
//
//    @GetMapping("/modify/{userid}")
//    public String mod(@PathVariable String userid, Model model){
//        User user = userService.findById(userid);
//        model.addAttribute("data", user);
//        return "user/modify";
//    }
//
//    @PostMapping("/modify")
//    public String postModify(User user) {
//        userService.save(user);
//        return "redirect:/user/list";
//    }
//
//    @RequestMapping("/delete/{userid}")
//    public String delete(@PathVariable String userid) {
//        userService.delete(userid);
//        return "redirect:/user/list";
//    }

}
