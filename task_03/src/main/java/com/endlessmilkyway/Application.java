package com.endlessmilkyway;

import com.endlessmilkyway.common.StudentDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext ac = new GenericXmlApplicationContext("application.xml");

        StudentDTO student = ac.getBean("student", StudentDTO.class);

        System.out.println("student = " + student);
    }
}