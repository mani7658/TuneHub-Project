package com.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tunehub.entity.Playlist;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {

	Playlist findByName(String string);

}
