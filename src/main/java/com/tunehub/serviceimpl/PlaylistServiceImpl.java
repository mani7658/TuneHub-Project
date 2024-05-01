package com.tunehub.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.entity.Playlist;
import com.tunehub.repository.PlaylistRepository;
import com.tunehub.service.PlaylistService;


@Service
public class PlaylistServiceImpl implements PlaylistService {
	
		@Autowired
		PlaylistRepository playlistRepository;
		
		
		@Override
		public void addPlaylist(Playlist playlist) {
//			Playlist existingPlaylist= playlistRepository.findByName(playlist.getName());
//			if(existingPlaylist==null) {
//				playlistRepository.save(playlist);
//
//			}
//			else {
//				System.out.println("Playlist Already Existed");
//			}		
			
			playlistRepository.save(playlist);

		}
		
		
		@Override
		public List<Playlist> fetchAllSongs() {

			List<Playlist> songs = playlistRepository.findAll();

			return songs;
		}


		@Override
		public boolean getPlayListName(Playlist plist) {
			// TODO Auto-generated method stub
			Playlist plName = playlistRepository.findByName(plist.getName());
			if(plName==null) {
				return true;
			}
			return false;
			
		}


		
	}

