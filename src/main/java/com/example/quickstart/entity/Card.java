package com.example.quickstart.entity;

import lombok.Data;

/**
 * Created by lenovo on 2018/9/10.
 */
@Data
public class Card{
private String imgLink;
private String called;
private  String collect;
public Card(){

}
public Card(String imgLink,String called,String  collect){
    this.imgLink=imgLink;
    this.called=called;
    this.collect=collect;
  }

}
