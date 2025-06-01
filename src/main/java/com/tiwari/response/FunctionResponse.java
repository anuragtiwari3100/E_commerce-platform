package com.tiwari.response;

import com.tiwari.dto.OrderHistory;
import com.tiwari.model.Cart;
import com.tiwari.model.Product;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;
}
