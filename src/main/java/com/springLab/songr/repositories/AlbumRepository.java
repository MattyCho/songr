package com.springLab.songr.repositories;

import com.springLab.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    public Album findByTitle(String title);
}
