package com.slaweklida.songLibrary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {

    @GetMapping("/test")
    public int test(){
        return 1;
    }

}