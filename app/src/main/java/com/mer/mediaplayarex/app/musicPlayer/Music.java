package com.mer.mediaplayarex.app.musicPlayer;

import java.io.Serializable;

public class Music implements Serializable {
    public String _id;
    public String _data;
    public String _display_name;
    public String _size;
    public String mime_type;
    public String date_added;
    public String is_drm;
    public String date_modified;
    public String title;
    public String title_key;
    public String duration;
    public String artist_id;
    public String composer;
    public String album_id;
    public String track;
    public String year;
    public String is_ringtone;
    public String is_music;
    public String is_alarm;
    public String is_notification;
    public String is_podcast;
    public String bookmark;
    public String album_artist;
    public String artist_key;
    public String artist;
    public String album_key;
    public String album;

    public String getString() {
        return "_id : " + _id
                + ", _data : " + _data
                + ", _display_name : " + _display_name
                + ", _size : " + _size
                + ", mime_type : " + mime_type
                + ", date_added : " + date_added
                + ", is_drm : " + is_drm
                + ", date_modified : " + date_modified
                + ", title : " + title
                + ", title_key : " + title_key
                + ", duration : " + duration
                + ", artist_id : " + artist_id
                + ", composer : " + composer
                + ", album_id : " + album_id
                + ", track : " + track
                + ", year : " + year
                + ", is_ringtone : " + is_ringtone
                + ", is_music : " + is_music
                + ", is_alarm : " + is_alarm
                + ", is_notification : " + is_notification
                + ", is_podcast : " + is_podcast
                + ", bookmark : " + bookmark
                + ", album_artist : " + album_artist
                + ", artist_id:1 : " + artist_id
                + ", artist_key : " + artist_key
                + ", artist : " + artist
                + ", album_id:1 : " + album_id
                + ", album_key : " + album_key
                + ", album : " + album;
    }
}
