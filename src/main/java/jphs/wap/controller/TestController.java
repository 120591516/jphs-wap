package jphs.wap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
    @ResponseBody
    @RequestMapping("/testC")
    public String testC() {
        return "Yes";
    }
}
