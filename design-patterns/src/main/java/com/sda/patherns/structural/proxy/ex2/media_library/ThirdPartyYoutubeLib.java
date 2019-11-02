package com.sda.patherns.structural.proxy.ex2.media_library;

import java.util.Map;

public interface ThirdPartyYoutubeLib {

    Map<String, Video> popularVideos();

    Video getVideo(String videoId);
}
