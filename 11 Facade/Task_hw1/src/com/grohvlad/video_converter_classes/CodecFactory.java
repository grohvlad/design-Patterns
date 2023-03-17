package com.grohvlad.video_converter_classes;

import com.grohvlad.video_classes.MPEG4CompressionCodec;
import com.grohvlad.video_classes.OggCompressionCodec;
import com.grohvlad.video_classes.VideoFile;

/**
 * Фабрика для створення відеокодека, яким стиснуто відеофайл
 */
public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            return new MPEG4CompressionCodec();
        } else {
            return new OggCompressionCodec();
        }
    }
}