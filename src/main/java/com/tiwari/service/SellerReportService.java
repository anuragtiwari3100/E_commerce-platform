package com.tiwari.service;

import com.tiwari.model.Seller;
import com.tiwari.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}
