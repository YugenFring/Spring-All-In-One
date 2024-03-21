package com.spring.ioc_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class SomeController {
    /**
     * Retrieve bean by type.
     */
    @Autowired
    private SomeService userServiceImpl;

    /**
     * Retrieve bean by the specified name.
     */
    @Autowired
    @Qualifier("viewServiceImpl")
    private SomeService someService;

    /**
     * Retrieve bean by the specified name.
     */
    @Resource(name = "timeServiceImpl")
    private SomeService timeServiceImpl;

    public void doUserController() {
        String s = userServiceImpl.doService();
        System.out.println(s);
    }

    public void doViewController() {
        String s = someService.doService();
        System.out.println(s);
    }

    public void doTimeController() {
        String s = timeServiceImpl.doService();
        System.out.println(s);
    }
}
