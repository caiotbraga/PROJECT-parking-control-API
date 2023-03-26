package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.dtos.ParkingSpotDto;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.services.ParkingSpotService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSpotController {

    final ParkingSpotService parkingSpotService;

    public ParkingSpotController(ParkingSpotService parkingSpotService) {
        this.parkingSpotService = parkingSpotService;
    }

    @PostMapping //método post http
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDto parkingSpotDto){ //@RequestBody faz a requisição e o @Valid verifica se através do DTO está tudo de acordo
        var parkingSpotModel = new ParkingSpotModel(); //não precisa declarar o tipo da váriavel (identifica sozinho o tipo)
        BeanUtils.copyProperties(parkingSpotDto, parkingSpotModel); //converter o DTO em model
        parkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC"))); //seta a data
        return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.save(parkingSpotModel));
    }
}
