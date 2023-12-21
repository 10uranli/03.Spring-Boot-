package com.tutorial._03.springboot.sample._01.helloboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    static List<Hello> helloList = new ArrayList<Hello>();

    @RequestMapping(value = "/hello/{id}")
    public ResponseEntity<Hello> getHello(@PathVariable int id){
        try{
            Hello hello = helloList.get(id);
            return new ResponseEntity<>(hello,
                    HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

    @PostMapping(value = "/hello")
    public ResponseEntity<Hello> postHello(@RequestBody Hello hello){
        helloList.add(hello);
        return new ResponseEntity<>(hello,
                HttpStatus.OK);
    }
}
