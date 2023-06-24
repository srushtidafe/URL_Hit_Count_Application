package com.Geekster.URLHitCount.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

public class UrlHit {

    public String name;
    public int count;

    public  UrlHit(){
        System.out.println("Default Constructor is Called");
    }
    public UrlHit(String name){
        this.name=name;
        System.out.println("Parameterized Constructor is Called "+this.name);
    }

}
