package com.example.quickstart.dao;

import com.example.quickstart.entity.Card;
import com.example.quickstart.entity.Logo;
import com.example.quickstart.entity.Pai;
import com.example.quickstart.entity.User;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lenovo on 2018/9/10.
 */
@Configuration
@Data
public class PaiDao {
    public List<Pai>getPais(){
        Pai[] pais={
                new Pai("1.png","跑步好搭档","7篇文章"),
                new Pai("2.png","给现代人的护眼小技巧","5篇文章"),
                new Pai("3.png","青年居家生活指南","6篇文章"),

        };
        List<Pai>paiList= Arrays.asList(pais);
        return paiList;
    }
    public List<Card> getCards(){
        Card[] cards={
                new Card("11.png","你应该知道PPT的技巧","15篇文章"),
                new Card("12.png","青年生活居家指南","13篇文章"),
                new Card("13.png","国产游戏独立之光","19篇文章"),
                new Card("14.png","嘿Sir,你能帮我做什么","10篇文章"),
                new Card("15.png","Android玩机指南","15篇文章"),
                new Card("16.png","少数派带你看WWDC 2018","28篇文章"),
                new Card("17.png","把Mac菜单栏变成工具箱","14篇文章"),
                new Card("18.png","玩转二维码","16篇文章"),
                new Card("21.png","GIF还能这么玩","11篇文章"),
                new Card("22.png","旧设备换新手机","19篇文章"),
                new Card("23.png","文件传输,有这些就够了","13篇文章"),
                new Card("24.png","Windows美化手册","15篇文章")

        };
        List<Card>cardList= Arrays.asList(cards);
        return cardList;
    }
    
    public User getUser(){
        User user=new User();
        user.setAvatar("xiaoyao.jpg");

        return user;
    }
    public Logo getLogo(){
        Logo logo=new Logo();
        logo.setLogo("pai.png");
        logo.setName("少数派");
        return logo;
    }
}
