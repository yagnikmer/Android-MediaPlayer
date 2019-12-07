package com.mer.mediaplayarex.app.musicPlayer;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.mer.mediaplayarex.R;
import androidx.appcompat.app.AppCompatActivity;

public class MusicActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
        Music music = (Music)getIntent().getSerializableExtra("music");
        Log.d("",music.getString());
    }

    public void onPrevious(View view) {
    }

    public void onBackward(View view) {
    }

    public void onPlay(View view) {
    }

    public void onForward(View view) {
    }

    public void onNext(View view) {
    }
}
