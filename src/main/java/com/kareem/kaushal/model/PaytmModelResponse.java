package com.kareem.kaushal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaytmModelResponse {
    String customerName;
    Double amount;
    Integer upi;
    String success;

    public PaytmModelResponse(Integer upi){
        this.upi=upi;

    }
}
