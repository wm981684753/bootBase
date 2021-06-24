package com.example.myapplication.controller;

import lombok.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/session")
public class SessionController {

    @PostMapping("/set")
    public boolean set(HttpSession session) {
        Map<String, String> userInfo = new HashMap<>();
        userInfo.put("name", "user");
        userInfo.put("sign", "hashTestSign");
        session.setAttribute("user_info", userInfo);
        return true;
    }

    @PostMapping("/get")
    public Object get(HttpSession session) {
        Map<String,String> user_info = (HashMap)session.getAttribute("user_info");
        return user_info.get("sign");
    }
}
