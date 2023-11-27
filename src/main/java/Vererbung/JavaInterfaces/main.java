package Vererbung.JavaInterfaces;



public class main {
    public static void main(String[] args) {
        MediaController start = new MediaController();

        MusicPlayer music = new MusicPlayer();

        VideoPlayer video = new VideoPlayer();

        start.playMedia(music);

        start.playMedia(video);

    }

}
