package com.tunehub.entity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Song {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
 private int id;
 private  String name;
 private  String Artist;
 private  String Genre;
 private  String Link;
 @ManyToMany
 private  List < Playlist >PlayLists ;
public Song() {
	super();
	// TODO Auto-generated constructor stub
}
public Song(int id, String name, String artist, String genre, String link, List<Playlist> playLists) {
	super();
	this.id = id;
	this.name = name;
	Artist = artist;
	Genre = genre;
	Link = link;
	PlayLists = playLists;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getArtist() {
	return Artist;
}
public void setArtist(String artist) {
	Artist = artist;
}
public String getGenre() {
	return Genre;
}
public void setGenre(String genre) {
	Genre = genre;
}
public String getLink() {
	return Link;
}
public void setLink(String link) {
	Link = link;
}
public List<Playlist> getPlayLists() {
	return PlayLists;
}
public void setPlayLists(List<Playlist> playLists) {
	PlayLists = playLists;
}
@Override
public String toString() {
	return "Song [id=" + id + ", name=" + name + ", Artist=" + Artist + ", Genre=" + Genre + ", Link=" + Link
			+ ", PlayLists=" + PlayLists + "]";
}

 
	}


