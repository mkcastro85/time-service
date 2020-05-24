/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time.service.services;

import com.time.service.dto.TimeRequestDto;
import com.time.service.dto.TimeResponseDto;

/**
 *
 * @author meyling
 */
public interface TimeTransformService {

    /**
     * Metodo encargado de calcular el timezone de valores de entrada
     *
     * @param timeRequest
     * @return
     */
    TimeResponseDto calculate(TimeRequestDto timeRequest);
}
