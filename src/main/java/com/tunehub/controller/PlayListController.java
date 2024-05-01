package com.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tunehub.entity.Playlist;
import com.tunehub.entity.Song;
import com.tunehub.service.PlaylistService;
import com.tunehub.service.SongService;

@Controller
public class PlayListController {

	@Autowired
	PlaylistService playlistService;


	@Autowired
	SongService songService;

	@GetMapping("/createplaylists")
	public String createPlaylist(Model model) {
		List<Song> songList = songService.fetchAllSongs();
		model.addAttribute("songs", songList);
		return "createplaylist";
	}

	@PostMapping("/addplaylist")
	public String addplaylist(@ModelAttribute Playlist playlist) {
	    boolean plName = playlistService.getPlayListName(playlist);
	    if (plName) {
	        playlistService.addPlaylist(playlist);
	        System.out.println("Playlist added successfully");

	        // Ensure that the songs list is initialized before accessing it
	        if (playlist.getSongs() != null) {
	            List<Song> songs = playlist.getSongs();
	            for (Song song : songs) {
	                song.getPlayLists().add(playlist);
	                songService.updateSong(song);
	            }
	        } else {
	            // Handle the case where the songs list in the playlist is null
	            System.out.println("Songs list in the playlist is null");
	        }
	    } else {
	        // Handle the case where the playlist name already exists
	        System.out.println("Duplicate Records");
	    }
	    return "AdminHome";
	}


@GetMapping("/viewplaylist")
public String viewsongs(Model model ) {

	List<Playlist> playlist= playlistService.fetchAllSongs();

	model.addAttribute("playlists", playlist);

	System.out.println(playlist);

	return "ViewPlaylist";


}

}





















