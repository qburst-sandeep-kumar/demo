package com.example.demo.dto;

import lombok.Data;

@Data
public class GenreDto {

    /**
     * Genre ID.
     */
    String genreId;

    /**
     * Genre type.
     */
    String genreType;

    /**
     * Updated date time.
     */
    String updatedDateTime;

    Boolean availableFlag;

}
