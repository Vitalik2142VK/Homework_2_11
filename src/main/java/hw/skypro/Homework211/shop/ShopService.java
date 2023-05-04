package hw.skypro.Homework211.shop;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;

@Service
public class ShopService {

    private final Cart cart;

    public ShopService(Cart cart) {
        this.cart = cart;
    }

    public void add(Collection<Integer> values) {
        cart.add(values);
    }

    public Set<Integer> get() {
        return cart.get();
    }

    public String welcome() {
        return "Welcome";
    }
}
