package pro.sky.java.course2.store.Service;


import org.springframework.stereotype.Service;
import pro.sky.java.course2.store.component.Cart;

import java.util.List;

@Service
public class StoreService {

    private final Cart cart;

    public StoreService(Cart cart) {
        this.cart = cart;
    }

    public List<Integer> addItems(List<Integer> idList) {
        return cart.addItems(idList);
    }

    public List<Integer> getItems() {
        return cart.getItems();
    }

}
