package gwAws.gwAwsProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    /**
     * 웹훅 테스트
     * @return
     */
    @RequestMapping("/home")
    public String home() {
        return "home";
    }
}
