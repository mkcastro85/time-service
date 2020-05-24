/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time.service.controllers;

import com.time.service.dto.TimeRequestDto;
import com.time.service.dto.TimeResponseDto;
import com.time.service.services.TimeTransformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author meyling
 */
@RestController
public class TimeTransformController {

    @Autowired
    private TimeTransformService timeTransformService;

    @PostMapping("/calculate")
    public TimeResponseDto calculate(@RequestBody TimeRequestDto request) {
        return timeTransformService.calculate(request);
    }
}
