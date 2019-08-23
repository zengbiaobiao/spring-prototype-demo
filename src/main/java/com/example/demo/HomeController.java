package com.example.demo;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zengsam
 */
@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private ObjectFactory<UserService> objectFactory;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PermissionService permissionService;


    @GetMapping("/index")
    public String index() {
        System.out.println(getUserService());
        System.out.println(objectFactory.getObject());
        System.out.println(roleService);
        System.out.println(permissionService);
        System.out.println("=========================");
        return "OK";
    }

    @Lookup("userService")
    public UserService getUserService() {
        return null;
    }
}
