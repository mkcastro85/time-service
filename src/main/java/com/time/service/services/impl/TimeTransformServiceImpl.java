/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time.service.services.impl;

import com.time.service.dto.Response;
import com.time.service.dto.TimeRequestDto;
import com.time.service.dto.TimeResponseDto;
import com.time.service.services.TimeTransformService;
import org.springframework.stereotype.Service;

@Service
public class TimeTransformServiceImpl implements TimeTransformService {

    @Override
    public TimeResponseDto calculate(TimeRequestDto timeRequest) {
        TimeResponseDto timeResponse = new TimeResponseDto();
        Response response = new Response();
        response.setTime(timeRequest.getTime().plusMinutes(timeRequest.getTimezone()));
        response.setTimezone("UTC");
        timeResponse.setResponse(response);
        return timeResponse;
        
    }

}
