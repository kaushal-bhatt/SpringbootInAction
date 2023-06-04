package com.kareem.kaushal.serviceImpl;


import com.kareem.kaushal.model.AroojRequest;
import com.kareem.kaushal.model.Book;
import com.kareem.kaushal.model.PaytmModelResponse;
import com.kareem.kaushal.repo.ReadingListRepository;
import com.kareem.kaushal.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class PaymentImpl implements MainService {

    @Autowired
    ReadingListRepository readingListRepository;

    @Override
    public PaytmModelResponse response(AroojRequest kaushal){
    PaytmModelResponse a = new PaytmModelResponse(1234124);
        a.setCustomerName(kaushal.getName());
        a.setAmount(1000.00);
        a.setSuccess(kaushal.getSuccess());
        System.out.println(a.getSuccess());
        if(a.getSuccess().equals("OK")){
        a.setSuccess("Apki payment agyi he");}else{
        a.setSuccess("Apki payment nhi ayi he");
    }
            return a;
    }

    @Override
    public String readers(String reader,Model model) {
        List<Book> readingList =
                readingListRepository.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }
}
