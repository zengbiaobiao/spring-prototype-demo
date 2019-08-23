package com.example.demo;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Service;

/**
 * @author zengsam
 */
@Service
public class PermissionService implements DisposableBean {
    @Override
    public void destroy() {
        System.out.println("destroy PermissionService");
    }
}
