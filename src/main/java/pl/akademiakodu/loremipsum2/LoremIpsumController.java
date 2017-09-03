package pl.akademiakodu.loremipsum2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoremIpsumController {
    @GetMapping("/")
    public String home(ModelMap modelMap){
        modelMap.addAttribute("text","LoremLoremLoremLoremLorem" +
                "LoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLorem" +
                "LoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLorem" +
                "LoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLorem" +
                "LoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLorem" +
                "LoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLorem" +
                "LoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLorem" +
                "LoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLorem" +
                "LoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLoremLorem " );
        return "home";

    }

    @PostMapping("/generate")
    public String generate(@ModelAttribute Form form, ModelMap modelMap ){
        modelMap.addAttribute("text", "dupa");
        return "home";
    }
    //@PostMapping()
}
