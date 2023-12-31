package com.slaweklida.songLibrary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song {
    private int id;
    private String title;
    private String artist;

}
