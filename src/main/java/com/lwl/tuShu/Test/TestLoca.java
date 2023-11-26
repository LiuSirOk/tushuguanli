package com.lwl.tuShu.Test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestLoca {

    @RequestMapping("/mapTest")
    public String MapTest1() {
        return "index.html";
    }

}
