package hw.skypro.Homework211.shop;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Repository
@SessionScope
public class Cart {

    private Set<Integer> products = new HashSet<>();

    public void add(Collection<Integer> values) {
        products.addAll(values);
    }

    public Set<Integer> get() {
        return products;
    }
}
