package com.tiwari.service;

import com.tiwari.model.Order;
import com.tiwari.model.Seller;
import com.tiwari.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}
