package pro.sky.java.course2.shoppingcart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.shoppingcart.repository.ShoppingCart;

import java.util.Map;

@RestController
public class ShoppingCartController {

    private final ShoppingCart shoppingCart;

    public ShoppingCartController(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @GetMapping("order/add")
    public void add (int[] id) {
        shoppingCart.addItems(id);
    }

    @GetMapping("order/get")
    public Map<Integer, Integer> get() {
        return shoppingCart.getItems();
    }

}
