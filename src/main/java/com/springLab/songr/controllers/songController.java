package com.springLab.songr.controllers;

import com.springLab.songr.models.Album;
import com.springLab.songr.models.Song;
import com.springLab.songr.repositories.AlbumRepository;
import com.springLab.songr.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class songController {

    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;

    @PostMapping("/addSong")
    RedirectView addSongToAlbum(String title, int length, int trackNumber, String albumTitle) {
        Album album = albumRepository.findByTitle(albumTitle);
        Song newSong = new Song(title, length, trackNumber, album);
        songRepository.save(newSong);
        return new RedirectView("/albums");
    }
}
