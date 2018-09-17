package com.example.quickstart.entity;

import lombok.*;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lenovo on 2018/9/10.
 */
@Data
public class Pai {
    private String title;
    private String pic;
    private String collect;
    public Pai(){

    }
    public Pai(String pic,String title,String collect){
this.pic=pic;
this.title=title;
this.collect=collect;
    }
}
