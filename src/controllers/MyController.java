package controllers;

import annotations.AnnotationController;
import annotations.Get;

@AnnotationController
public class MyController {
    @Get(value = "/hola")
    public void hola() {
        System.out.println("hii guys");
    }

    public static void main (String[] args) {
        System.out.println("This is my controller");
    }
}