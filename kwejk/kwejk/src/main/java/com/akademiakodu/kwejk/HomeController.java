package com.akademiakodu.kwejk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home.html";
    }
    @GetMapping("/add")
    public String add(@RequestParam String name, @RequestParam  String imageUrl, ModelMap modelMap){

        Meme meme = new Meme();
        meme.setName(name);
        meme.setImageUrl(imageUrl);
        modelMap.put("meme", meme);
        return "result.html";

    }
}
