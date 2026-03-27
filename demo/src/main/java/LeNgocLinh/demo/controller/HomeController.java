package LeNgocLinh.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Lê Ngọc Linh");
        model.addAttribute("studentId", "2280601717");
        return "index";
    }
}
