package com.casino.uri.firebaseusers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by 48089748z on 10/02/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Note
{
    //@JsonIgnoreProperties(ignoreUnknown = true)
    private List<Note> notesList;
    private String title;
    private String description;
    private String latitude;
    private String longitude;
    private String codedImage;
    private String imagePath;
    private String videoPath;
    private String audioPath;
    public Note() {
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getCodedImage() {
        return codedImage;
    }

    public void setCodedImage(String codedImage) {
        this.codedImage = codedImage;
    }

    public List<Note> getNotesList() {
        return notesList;
    }

    public void setNotesList(List<Note> notesList) {
        this.notesList = notesList;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public String getAudioPath() {
        return audioPath;
    }

    public void setAudioPath(String audioPath) {
        this.audioPath = audioPath;
    }
}
