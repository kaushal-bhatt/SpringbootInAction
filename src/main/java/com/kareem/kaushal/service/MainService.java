package com.kareem.kaushal.service;

import com.kareem.kaushal.model.AroojRequest;
import com.kareem.kaushal.model.PaytmModelResponse;
import org.springframework.ui.Model;


public interface MainService {

    PaytmModelResponse response(AroojRequest kaushal);

    String readers(String reader, Model model);
}
