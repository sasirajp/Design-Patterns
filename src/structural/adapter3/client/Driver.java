package structural.adapter3.client;

import structural.adapter3.Adaptee.MkvVideoPlayer;
import structural.adapter3.Adapter.MkvAdapter;

public class Driver {
    public static void main(String[] args) {

        MkvVideoPlayer mkvVideoPlayer = new MkvVideoPlayer();

        MkvAdapter mkvAdapter = new MkvAdapter(mkvVideoPlayer);
        mkvAdapter.playMp4("Hello");
    }
}
