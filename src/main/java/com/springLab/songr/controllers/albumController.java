package com.springLab.songr.controllers;

import com.springLab.songr.models.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class albumController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/albums")
    public String albumPage(Model m) {
        Album frankSinatra = new Album("Come Fly With Me", "Frank Sinatra", 12, 2327, "/images/frankAlbumCover.jpg");
        Album nerd = new Album("In Search Of...", "N.E.R.D", 12, 3237, "/images/nerdAlbumCover.jpg");
        Album hamilton = new Album("Hamilton (Original Broadway Cast Recording)", "Lin-Manuel Miranda", 46, 8520, "/images/hamiltonAlbumCover.jpg");
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(frankSinatra);
        albums.add(nerd);
        albums.add(hamilton);
        m.addAttribute("albums", albums);
        return "album";
    }
}
