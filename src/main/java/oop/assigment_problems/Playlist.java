package oop.assigment_problems;

import java.util.Arrays;
import java.util.Scanner;

class MusicPlaylist {
    private final String[] songs;
    private int songCount;

    public MusicPlaylist(int maxSize) {
        songs = new String[maxSize];
        songCount = 0;
    }

    public void addSong(String song) {
        if (songCount < songs.length) {
            songs[songCount] = song;
            songCount++;
        }
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount);
    }

    public int getSongCount() {
        return songCount;
    }
}

public class Playlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum playlist size: ");
        int maxSize = sc.nextInt();
        sc.nextLine();

        MusicPlaylist playlist = new MusicPlaylist(maxSize);

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter song title: ");
            String song = sc.nextLine();
            playlist.addSong(song);
        }

        String[] copy = playlist.getSongs();

        System.out.println("Songs: " + Arrays.toString(copy));
        System.out.println("Song Count: " + playlist.getSongCount());

        if (copy.length > 0) {
            copy[0] = "Hacked";
        }

        System.out.println("Original Playlist: " + Arrays.toString(playlist.getSongs()));

        sc.close();
    }
}