package Principles.InterfaceSegregation;


/**
 * Here the MediaPlayer implements both audio and video related functionalities.
 * But if we have to create a audio player functionality that implements this MediaPlayer interface,
 * The AudioPlayer is forced to implement the functionalities related to Video player as well
 * which is not correct. This clearly violates the Interface Segregation principle.
 */
interface IncorrectMediaPlayerInterface {
    void playAudio();
    void playVideo();
}

class IncorrectVideoPlayer implements IncorrectMediaPlayerInterface {
    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video...");
    }
}

class IncorrectAudioPlayer implements IncorrectMediaPlayerInterface {
    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }

    @Override
    public void playVideo() {
        throw new UnsupportedOperationException("Video playback not supported.");
    }
}

public class IncorrectMediaPlayer {
}
