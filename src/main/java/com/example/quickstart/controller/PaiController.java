package com.example.quickstart.controller;


import com.example.quickstart.dao.PaiDao;
import com.example.quickstart.entity.Card;
import com.example.quickstart.entity.Logo;
import com.example.quickstart.entity.Pai;
import com.example.quickstart.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by lenovo on 2018/9/10.
 */
@Controller
public class PaiController {
@Resource
    private PaiDao paiDao;

@GetMapping("pai")
    public String getAll(ModelMap map) {
    List<Pai> paiList = paiDao.getPais();
    List<Card>cardList=paiDao.getCards();
    User user = paiDao.getUser();
    Logo logo= paiDao.getLogo();

    map.addAttribute("cardList",cardList);
    map.addAttribute("paiList", paiList);
    map.addAttribute("user", user);
    map.addAttribute("logo",logo);
    return  "pai";
}
}
