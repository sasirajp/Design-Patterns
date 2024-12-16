package structural.adapter3.Adapter;

import structural.adapter3.Adaptee.MkvVideoPlayer;
import structural.adapter3.client.MediaPlayer;

public class MkvAdapter implements MediaPlayer {

    private final MkvVideoPlayer mkvVideoPlayer;

    public MkvAdapter(MkvVideoPlayer mkvVideoPlayer) {
        this.mkvVideoPlayer = mkvVideoPlayer;
    }

    @Override
    public void playMp4(String filename) {
        mkvVideoPlayer.playMkvVideos(filename);
    }
}
