package wizut.tpsi.springlab1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class CalculatorController {
//  @RequestMapping("/")
//    public String home(Model model){
//        //model.addAttribute("imie", "Jakub");
//        
//        return "home";
//    }
    
    
    @RequestMapping("/calculator")
    public String calculator(Model model, Integer x, Integer y){
        Integer wynik = x+y;
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        model.addAttribute("wynik", wynik);
        return "calculator";
    }
    
}
