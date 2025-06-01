package com.tiwari.service;

import com.tiwari.exception.ProductException;
import com.tiwari.model.Cart;
import com.tiwari.model.CartItem;
import com.tiwari.model.Product;
import com.tiwari.model.User;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}
