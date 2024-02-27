package com.example.demo;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class UserController {
    @GetMapping("/user")
    public List<User> getUsers() {
        User user = new User();
        user.setId("1");
        user.setName("Bob");
        user.setMemberCode("TEST001");
        user.setTel("0000000000");

        User user2 = new User();
        user.setId("2");
        user.setName("Mom");
        user.setMemberCode("TEST002");
        user.setTel("0900030000");

        return List.of(user, user2);
    }

    @GetMapping("/user/{id}")
    public User getById(@PathVariable("id") String id) {
        // 取得使用者詳細資料後回傳
        User user = new User();
        user.setId(id);
        user.setName("Bob");
        user.setMemberCode("TEST001");
        user.setTel("0000000000");
        user.setOrderCountSum(199);

        return user;
    }
    
    @PostMapping("/user")
    public HttpStatus add(@RequestBody Object entity) {
        //TODO: process POST request
        // 新增使用者資料
        return HttpStatus.OK;
    }
    
    @PutMapping("/user/{id}")
    public HttpStatus editById(@PathVariable("id") long id, @RequestBody Object entity) {
        //TODO: process PUT request
        // 帶入id更新部分使用者資料
        return HttpStatus.OK;
    }

    @DeleteMapping("/user/{id}")
    public HttpStatus deleteById(@PathVariable("id") long id) {
        //TODO: process PUT request
        // 刪除使用者資料
        return HttpStatus.OK;
    }
}
