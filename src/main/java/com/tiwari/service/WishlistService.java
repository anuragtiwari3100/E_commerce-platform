package com.tiwari.service;


import com.tiwari.exception.WishlistNotFoundException;
import com.tiwari.model.Product;
import com.tiwari.model.User;
import com.tiwari.model.Wishlist;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

