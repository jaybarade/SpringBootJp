package com.jpcode.productlsit.xdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApp {

    private MyComponent myComponent;


    //This is DI(Dependancy Injection)  with constructor ki help se
    @Autowired // DI in inject this class
    public  MyApp(MyComponent myComponent){
        this.myComponent=myComponent;
    }

    public  void run(){
        myComponent.getmessage();
    }
}
