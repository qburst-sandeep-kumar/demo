package com.example.demo.service;



import com.example.demo.dto.GenreDto;

import java.util.List;

public interface MastersService {

    /**
     * Get genre masters.
     * @return
     */
    public List<GenreDto> getGenreMasters();
    /**
     * Insert new values.
     * @return
     */
    int insertNewGenre(GenreDto genreDto);

}
