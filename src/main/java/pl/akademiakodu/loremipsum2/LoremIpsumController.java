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
        modelMap.addAttribute("text","Starania o zrównoważony rozwój można sprowadzić do" +
                " postulatu sprawiedliwości międzypokoleniowej. Skoro my możemy korzystać z przyrody taką, jaka" +
                " jest dziś, to samo prawo powinno przysługiwać naszym dzieciom, wnukom, wnuczkom, ich dzieciom " +
                "i tak dalej. Ergo nasz rozwój nie może odbywać się kosztem przyrody. Termin ‘zrównoważony’ trudno" +
                " uznać w tej sytuacji za intuicyjnie zrozumiały, ale ktoś tak wymyślił kilkanaście lat temu" +
                " i teraz trzeba się go trzymać nie chcąc popaść w lingwistyczno-definicyjne dywagacje." +
                " Które oczywiście świetnie nadają się na kolejny tekst. Ale ten jest o czymś innym.\n" +
                "\n" + "Do ludzi powoli dociera fakt, że żyjemy w kryzysie ekologicznym. Może akurat nie " +
                "do przedstawicieli polskiej polityki, którzy z dziwną satysfakcją psują atmosferę " +
                "kolejnych negocjacji klimatycznych. Lecz dobre wyniki partii zielonych w Niemczech," +
                " czy powszechność zielonych postulatów w brytyjskiej debacie publicznej są faktem." +
                " Jak zwykle, nieco gorzej wygląda przejście od gadania do działania… ale, o dziwo," +
                " to nie o tym ma być ten tekst." );
        return "home";

    }

    @PostMapping("/generate")
    public String generate(@ModelAttribute Form form, ModelMap modelMap ){
        modelMap.addAttribute("text", "dupa");
        return "home";
    }
}
