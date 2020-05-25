package com.solid.liskov_s_substitution_principle;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {
    public static void main(String[] args) {

        List<MediaPlayer> mediaPlayerList = new ArrayList<>();

        mediaPlayerList.add(new TorMediaPlayer());
        mediaPlayerList.add(new VlcMediaPlayer());
        mediaPlayerList.add(new WinampMediaPlayer());

        playAudioInAllMediaplayers(mediaPlayerList);

        playVideoInAllMediaplayers(mediaPlayerList);
    }

    public static void playAudioInAllMediaplayers(List<MediaPlayer> mediaPlayers) {
        for (MediaPlayer mediaPlayer : mediaPlayers) {
            mediaPlayer.playAudio();
        }
    }

    public static void playVideoInAllMediaplayers(List<MediaPlayer> mediaPlayers) {
        for (MediaPlayer mediaPlayer : mediaPlayers) {
            if (mediaPlayer instanceof VideoMediaPlayer) ((VideoMediaPlayer) mediaPlayer).playVideo();
        }
    }
}
