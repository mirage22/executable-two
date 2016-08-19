package com.exec.two;

import com.exec.one.service.MagicService;

public class Main {

    public static void main(String[] args){

        System.out.println("Executable-Two Main");
        MagicService service = new MagicService();
        System.out.println("MagicService from Executable-ONE");
        System.out.println("MESSAGE: " + service.getMessage());

    }

}
