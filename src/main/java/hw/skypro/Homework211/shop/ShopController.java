package hw.skypro.Homework211.shop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/add")
    public void get(@RequestParam List<Integer> id) {
        shopService.add(id);
    }

    @GetMapping("/get")
    public Set<Integer> get() {
        return shopService.get();
    }

    @GetMapping
    public String welcome() {
        return shopService.welcome();
    }
}
