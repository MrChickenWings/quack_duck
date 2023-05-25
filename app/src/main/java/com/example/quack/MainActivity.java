package com.example.quack;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button  btnPigg;
    private Button btnCoww;
    private Button btnSheep;
    private Button btnChicken;
    private Button btnHorse;
    private Button btnDuck;
    private Button btnTurkey;
    private Button btnFish;
    private Button btnDog;
    private Button btnGoose;
    private Button btnRooster;
    private Button btnGoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPigg = findViewById(R.id.btn_pigg);
        btnCoww = findViewById(R.id.btn_coww);
        btnSheep = findViewById(R.id.btn_sheep);
        btnChicken = findViewById(R.id.btn_chicken);
        btnHorse = findViewById(R.id.btn_horse);
        btnDuck = findViewById(R.id.btn_duck);
        btnTurkey = findViewById(R.id.btn_turkey);
        btnFish = findViewById(R.id.btn_fish);
        btnDog = findViewById(R.id.btn_dog);
        btnGoose = findViewById(R.id.btn_goose);
        btnRooster = findViewById(R.id.btn_rooster);
        btnGoat = findViewById(R.id.btn_goat);

        btnPigg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v){
              playPigg();
            }
        });

        btnCoww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v){
                playCoww();
            }
        });

        btnSheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v){
                playSheep();
            }
        });

        btnChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v){
                playChicken();
            }
        });

        btnHorse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v){
                playHorse();
            }
        });
        btnDuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v){
                playDuck();
            }
        });

        btnTurkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v){
                playTurkey();
            }
        });

        btnFish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v){
                playFishNuke();
            }
        });

        btnDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v){
                playDog();
            }
        });

        btnGoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v){
                playGoose();
            }
        });

        btnRooster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v){
                playRooster();
            }
        });

        btnGoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v){
                playGoat();
            }
        });

    }


    private void playPigg() {
        MediaPlayer mp = MediaPlayer.create(context: this, R.raw.sound_pigaaa);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });

    }

    private void playCoww() {
        MediaPlayer mp = MediaPlayer.create(context: this, R.raw.sound_cow);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });


    }



    private void playSheep() {
        MediaPlayer mp = MediaPlayer.create(context:this, R.raw.sound_sheep);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }


    private void playChicken() {
        MediaPlayer mp = MediaPlayer.create(context:this, R.raw.sound_chicken);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playHorse() {
        MediaPlayer mp = MediaPlayer.create(context:this, R.raw.sound_horse);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playSheep() {
        MediaPlayer mp = MediaPlayer.create(context:this, R.raw.sound_sheep);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playDuck() {
        MediaPlayer mp = MediaPlayer.create(context:this, R.raw.sound_duck);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playTurkey() {
        MediaPlayer mp = MediaPlayer.create(context:this, R.raw.sound_turkey);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playFishNuke() {
        MediaPlayer mp = MediaPlayer.create(context:this, R.raw.sound_fishnuke);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playDog() {
        MediaPlayer mp = MediaPlayer.create(context:this, R.raw.sound_dog);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playGoose() {
        MediaPlayer mp = MediaPlayer.create(context:this, R.raw.sound_goouse);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }
    private void playRooster() {
        MediaPlayer mp = MediaPlayer.create(context:this, R.raw.sound_rooster);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }
    private void playGoat() {
        MediaPlayer mp = MediaPlayer.create(context:this, R.raw.sound_goat);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }