package com.grohvlad.video_classes;

import com.grohvlad.video_converter_classes.Codec;

/**
 * Кодек для стиснення відео формату MPEG4
 */
public class MPEG4CompressionCodec implements Codec {

    @Override
    public String type() {
        return "mp4";
    }
}
