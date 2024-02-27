package com.example.demo;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Item;
import com.example.pojo.Order;
import com.example.pojo.OrderDetail;
import com.example.pojo.User;

@RestController
public class OrderController {
    @GetMapping("/order")
    public List<Order> getOrders() {
        Order order = new Order();
        order.setId("1");
        order.setUserId("1");
        order.setStatus("7");
        OrderDetail detail = new OrderDetail();
        Item item = new Item();
        item.setId("1");
        item.setName("Chocolate");
        item.setPrice(100);
        item.setTotalNum("99");
        item.setNumVer(1);
        detail.setItems(List.of(item));
        detail.setUserName("tester");
        detail.setOrderTime("2024/02/27");
        order.setDetail(detail);

        return List.of(order);
    }

    @GetMapping("/order/{id}")
    public Order getById(@PathVariable("id") String id) {
        // 取得訂單詳細資料後回傳
        Order order = new Order();
        order.setId("1");
        order.setUserId("1");
        order.setStatus("7");
        OrderDetail detail = new OrderDetail();
        Item item = new Item();
        item.setId("1");
        item.setName("Chocolate");
        item.setPrice(100);
        item.setTotalNum("98");
        item.setNumVer(2);
        detail.setItems(List.of(item));
        detail.setUserName("tester");
        detail.setOrderTime("2024/02/27");
        order.setDetail(detail);

        return order;
    }
    
    @PostMapping("/order")
    public HttpStatus add(@RequestBody Object entity) {
        // 新增訂單資料
        // 對於item寫入時使用樂觀鎖
        return HttpStatus.OK;
    }

    @GetMapping("/order/cal/{num}")
    public List<User> getPowerfulUsers(@PathVariable("num") int num) {
        // 訂單數量 > num 的會員資料
        User user = new User();
        user.setId("1");
        user.setName("Bob");
        user.setMemberCode("TEST001");
        user.setTel("0000000000");
        user.setOrderCountSum(num+99);
        return List.of(user);
    }
}
