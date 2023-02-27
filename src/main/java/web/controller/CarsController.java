package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarServise;

@Controller
public class CarsController {

    private CarServise carServise;

    public CarsController(CarServise carServise) {
        this.carServise = carServise;
    }

    @GetMapping(value = "/cars")
    public String index(@RequestParam(value = "count", defaultValue="5") int count, Model model) {
        model.addAttribute("cars", carServise.index(count));
        return "cars";
    }
}
