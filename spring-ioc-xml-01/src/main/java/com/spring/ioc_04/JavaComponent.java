package com.spring.ioc_04;

public class JavaComponent {
    /**
     * This method will be called when the bean starts to be initialized.
     */
    public void init() {
        System.out.println("JavaComponent.init()");
    }

    /**
     * This method will be called before the bean is destroyed.
     */
    public void destroy() {
        System.out.println("JavaComponent.destroy()");
    }
}
