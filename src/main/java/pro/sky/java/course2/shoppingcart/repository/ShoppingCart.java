package pro.sky.java.course2.shoppingcart.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Repository
@SessionScope
public class ShoppingCart {

    Map<Integer, Integer> shoppingCart = new HashMap<>();

    public void addItems(int[] newId) {
        for (Integer id : newId) {
            if (shoppingCart.containsKey(id)) {
                shoppingCart.put(id, shoppingCart.get(id) + 1);
            } else {
                shoppingCart.put(id, 1);
            }
        }
    }

    public Map<Integer, Integer> getItems() {
        return Collections.unmodifiableMap(shoppingCart);
    }
}
