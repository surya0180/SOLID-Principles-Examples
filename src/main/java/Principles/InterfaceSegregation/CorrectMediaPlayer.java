package Principles.InterfaceSegregation;

/**
 * We basically divided the Incorrect Media Player interface into 2 separate interfaces
 * each having their own set of methods. In this way we can make sure that the classes implement
 * only the methods that they require. This follows the principle of Interface Segregation
 */

interface CorrectAudioPlayerInterface {
    void playAudio();
}

// Interface for video functionality
interface CorrectVideoPlayerInterface {
    void playVideo();
}

class CorrectVideoPlayer implements CorrectVideoPlayerInterface {
    @Override
    public void playVideo() {
        System.out.println("Playing video...");
    }
}

class CorrectMultimediaPlayer implements CorrectAudioPlayerInterface, CorrectVideoPlayerInterface {
    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video...");
    }
}

class CorrectAudioPlayer implements CorrectAudioPlayerInterface {
    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }
}

public class CorrectMediaPlayer {
}
