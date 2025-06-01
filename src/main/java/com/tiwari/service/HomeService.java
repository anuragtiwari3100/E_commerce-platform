package com.tiwari.service;

import com.tiwari.model.Home;
import com.tiwari.model.HomeCategory;

import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
