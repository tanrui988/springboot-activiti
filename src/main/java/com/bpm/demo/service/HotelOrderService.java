package com.bpm.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HotelOrderService {

    public void order(){
        System.out.println("酒店订购成功!");
    }

    public void cancel(){
        System.out.println("取消酒店订购成功!");
    }
}
