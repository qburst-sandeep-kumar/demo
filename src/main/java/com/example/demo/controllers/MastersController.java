package com.example.demo.controllers;


import com.example.demo.dto.GenreDto;
import com.example.demo.service.MastersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("masters")
public class MastersController {

    @Autowired
    private MastersService mastersService;

    @GetMapping("get-genre")
    public List<GenreDto> getGenre() {
        return mastersService.getGenreMasters();
    }


}
