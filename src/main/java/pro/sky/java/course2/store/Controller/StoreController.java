package pro.sky.java.course2.store.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.store.Service.StoreService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public List <Integer> addItems (@RequestParam List <Integer> ids) {
        return storeService.addItems(ids);
    }

    @GetMapping("/get")
    public List <Integer> getItems () {
        return storeService.getItems();
    }
}
