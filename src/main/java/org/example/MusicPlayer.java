package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private String volume;

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }

    private List<Music> music;

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public String playMusic() {
        Random random = new Random();

        return music.get(random.nextInt(music.size())).getSong();
    }
}

