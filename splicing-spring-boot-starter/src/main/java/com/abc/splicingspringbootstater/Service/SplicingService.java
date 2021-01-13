package com.abc.splicingspringbootstater.Service;

import lombok.AllArgsConstructor;

/**
 * @author zhangfan
 */
@AllArgsConstructor
public class SplicingService {

    private  String before;

    private  String after;



    public String Splicing(String word)
    {
        return before+ word + after;
    }
}
