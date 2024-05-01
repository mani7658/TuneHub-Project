package com.tunehub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tunehub.entity.Playlist;

@Service
public interface PlaylistService {

	void addPlaylist(Playlist playlist);

	boolean getPlayListName(Playlist plist);
	List<Playlist> fetchAllSongs();

	

}

