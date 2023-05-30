package com.kareem.kaushal.controller;

import com.kareem.kaushal.model.AroojRequest;
import com.kareem.kaushal.model.PaytmModelResponse;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

//    @Autowired(required = false)
//    ReadingListController readingListController;
    //example for conditional bean and requried false property


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
