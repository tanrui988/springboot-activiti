package com.bpm.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TickOrderService {

    public void order(){
        System.out.println("订购机票成功!");
    }

    public void cancel(){
        System.out.println("取消机票成功!");
    }
}
