package com.example.demo.controllers;


import com.example.demo.dto.GenreDto;
import com.example.demo.service.MastersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("insertGenre")
    public int insertGenre(@RequestBody GenreDto genreDto){
        return mastersService.insertNewGenre(genreDto);
    }


}
