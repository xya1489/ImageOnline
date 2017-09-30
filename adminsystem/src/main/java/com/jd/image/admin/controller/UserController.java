package com.jd.image.admin.controller;

import com.jd.image.admin.entity.User;
import com.jd.image.admin.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/26 0026.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

        @RequestMapping(method= RequestMethod.GET)
        public ResponseEntity<User> getById(@RequestParam("id") String id){
            User user = null;
            try {
               user=  userService.findById(id);
            } catch (Exception e) {
                e.printStackTrace();
                return  new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
            }

            return  new ResponseEntity<>(user, HttpStatus.OK);
        }
}
