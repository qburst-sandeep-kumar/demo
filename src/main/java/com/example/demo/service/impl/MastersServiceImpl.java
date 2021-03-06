package com.example.demo.service.impl;


import com.example.demo.dto.GenreDto;
import com.example.demo.repositories.MastersRepository;
import com.example.demo.service.MastersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MastersServiceImpl implements MastersService {

    @Autowired
    private MastersRepository mastersRepository;

    /**
     * Get genre masters.
     * @return
     */
    @Override
    public List<GenreDto> getGenreMasters() {
        return mastersRepository.getGenreMasters();
    }
    public int insertNewGenre(GenreDto genreDto){
        if (mastersRepository.insertGenre(genreDto)==1)
            return genreDto.getGenreId();
        else
            return genreDto.getGenreId();
    }


}
