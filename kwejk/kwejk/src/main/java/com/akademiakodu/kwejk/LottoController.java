package com.akademiakodu.kwejk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LottoController {

 @GetMapping("/lotto")
    public String losuj(ModelMap modelMap){
     Lotto lotto = new Lotto();
     modelMap.put("lotto", lotto.generateLotto());
     return "lotto.html";




 }

}
