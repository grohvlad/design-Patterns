package com.grohvlad.video_classes;

import com.grohvlad.video_converter_classes.Codec;

/**
 * Кодек для стиснення відео формату Ogg
 */
public class OggCompressionCodec implements Codec {

    @Override
    public String type() {
        return "ogg";
    }
}
