package com.example.demo.repositories;


import com.example.demo.dto.GenreDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MastersRepository {

    /**
     * Get genre masters.
     * @return
     */
    public List<GenreDto> getGenreMasters();




}
