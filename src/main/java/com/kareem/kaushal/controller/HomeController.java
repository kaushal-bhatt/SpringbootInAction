package com.kareem.kaushal.controller;

import com.kareem.kaushal.model.AroojRequest;
import com.kareem.kaushal.model.PaytmModelResponse;

import com.kareem.kaushal.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

//    @Autowired(required = false)
//    ReadingListController readingListController;
    //example for conditional bean and requried false property

    @Autowired
    MainService mainService;

    @GetMapping("/arooj/{kaushal}")
    public String testMethod(@PathVariable String kaushal){

        return "My name is "+ kaushal;
    }
    @GetMapping("/arooj")
    public String testMethod(){
        AroojRequest a = new AroojRequest();
        a.setName("kaushal");
        a.setPlace("Rishikesh");
        return a.toString();
    }

    @PostMapping("/arooj/kaushal")
    public PaytmModelResponse testMethod(@RequestBody AroojRequest kaushal){
      return  mainService.response(kaushal);
    }

    @PostMapping("/paytm")
    public String testMethods(@RequestBody PaytmModelResponse kaushal){
        return "Okay payment is success!!";
    }
//    public void methodEnvi(){
//        String reader="kaushal";
//        Model model= null;
//        readingListController.readersBooks(reader, model);
//    }
}
