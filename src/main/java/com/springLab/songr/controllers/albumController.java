package com.springLab.songr.controllers;

import com.springLab.songr.models.Album;
import com.springLab.songr.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class albumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/albums")
    public String albumPage(Model m) {
//        Album frankSinatra = new Album("Come Fly With Me", "Frank Sinatra", 12, 2327, "/images/frankAlbumCover.jpg");
//        Album nerd = new Album("In Search Of...", "N.E.R.D", 12, 3237, "/images/nerdAlbumCover.jpg");
//        Album hamilton = new Album("Hamilton (Original Broadway Cast Recording)", "Lin-Manuel Miranda", 46, 8520, "/images/hamiltonAlbumCover.jpg");

        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "album";
    }

    @GetMapping("/frank")
    public String frankPage(Model m) {
        Album frankAlbum = albumRepository.findByTitle("Come Fly With Me");
        m.addAttribute("frankAlbum", frankAlbum);
        return "singleAlbum";
    }

    @PostMapping("/albums")
    public RedirectView addNewAlbum(String title, String artist, int songCount, int length, String imageUrl) {
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("albums");
    }
}
