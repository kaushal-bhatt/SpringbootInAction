package com.kareem.kaushal.controller;

import com.kareem.kaushal.model.AroojRequest;
import com.kareem.kaushal.model.Book;
import com.kareem.kaushal.model.PaytmModelResponse;

import com.kareem.kaushal.repo.ReadingListRepository;
import com.kareem.kaushal.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {


    @Autowired
    public ReadingListRepository readingListRepository;

//    @Autowired(required = false)
//    ReadingListController readingListController;
    //example for conditional bean and requried false property

    @Autowired
    MainService mainService;

    @GetMapping("/arooj/{kaushal}")
    public String testMethod(@PathVariable String kaushal){

        return "My name is "+ kaushal;
    }

    @PostMapping("/save")
    public String saveIntoBook(@RequestBody Book book){
        readingListRepository.save(book);
        return "your book is saved in db!!";
    }
    @GetMapping("/fetch/{id}")
    public Book fetchBookObjectFromDb(@PathVariable Long id) {
        Optional<Book> fetchedDataFromDb = null;
        Book dbObject =null;
        try {
            fetchedDataFromDb = readingListRepository.findById(id);
            dbObject = fetchedDataFromDb.get();
        } catch (Exception e) {
            System.out.println("exception is " + e.getMessage());
        }
        return dbObject;
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
