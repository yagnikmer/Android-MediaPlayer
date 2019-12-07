package com.mer.mediaplayarex.app.musicLib;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mer.mediaplayarex.R;
import com.mer.mediaplayarex.app.musicPlayer.Music;
import com.mer.mediaplayarex.app.musicPlayer.MusicActivity;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;

public class MusicListFragment extends Fragment implements AdapterView.OnItemClickListener {

    ListView mListView;
    Context mContext;
    int mTabIndex;
    ArrayList<Music> mMusicList = new ArrayList<>();
    ArrayList<String> mSongsList = new ArrayList<>();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_music, container, false);
        mListView = root.findViewById(R.id.lvlist);
        mListView.setOnItemClickListener(this);
        mTabIndex = getArguments().getInt("index");
        mListView.setAdapter(new ArrayAdapter(mContext, android.R.layout.simple_list_item_1, getMediaInfo()));
        return root;
    }

    private ArrayList<String> getMediaInfo() {
        Uri uri;
        if (mTabIndex == 0)
            uri = MediaStore.Audio.Media.INTERNAL_CONTENT_URI;
        else
            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        Cursor cursor = mContext.getContentResolver().query(uri, null, null, null, null);
        cursor.moveToFirst();
        do {
            Music song = new Music();
            song._id = cursor.getString(0);
            song._data = cursor.getString(1);
            song._display_name = cursor.getString(2);
            song._size = cursor.getString(3);
            song.mime_type = cursor.getString(4);
            song.date_added = cursor.getString(5);
            song.is_drm = cursor.getString(6);
            song.date_modified = cursor.getString(7);
            song.title = cursor.getString(8);
            song.title_key = cursor.getString(9);
            song.duration = cursor.getString(10);
            song.album_id = cursor.getString(11);
            song.composer = cursor.getString(12);
            song.album_id = cursor.getString(13);
            song.track = cursor.getString(14);
            song.year = cursor.getString(15);
            song.is_ringtone = cursor.getString(16);
            song.is_music = cursor.getString(17);
            song.is_alarm = cursor.getString(18);
            song.is_notification = cursor.getString(19);
            song.is_podcast = cursor.getString(20);
            song.bookmark = cursor.getString(21);
            song.album_artist = cursor.getString(22);
            song.artist_id = cursor.getString(23);
            song.artist_key = cursor.getString(24);
            song.artist = cursor.getString(25);
            song.album_id = cursor.getString(26);
            song.album_key = cursor.getString(27);
            song.album = cursor.getString(28);
            mMusicList.add(song);
            mSongsList.add(song.title);
        } while (cursor.moveToNext());
        return mSongsList;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Music music =mMusicList.get(position);
        Intent intent = new Intent(mContext,MusicActivity.class);
        intent.putExtra("music", music);
        startActivity(intent);
    }
}
