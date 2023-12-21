package com.tutorial._03.springboot.sample._01.helloboot;

public class Hello {
    private String name;
    private String message;

    public Hello() {
    }

    public Hello(String name, String message) {
        this.name = name;
        this.message = message;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
