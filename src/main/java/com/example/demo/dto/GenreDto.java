package com.example.demo.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class GenreDto {

    /**
     * Genre ID.
     */
    int genreId;

    /**
     * Genre type.
     */
    String genreType;

    /**
     * Updated date time.
     */
    Timestamp updatedDateTime;

    /**
     * Available flag.
     */
    Boolean availableFlag;

}
