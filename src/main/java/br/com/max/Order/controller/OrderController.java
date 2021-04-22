package br.com.max.Order.controller;

import br.com.max.Order.entity.Order;
import br.com.max.Order.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/orders")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class OrderController {

    private OrderService orderService;

    @GetMapping
    public List<Order> findAll() {
       return orderService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        return orderService.findById(id);
    }
}
