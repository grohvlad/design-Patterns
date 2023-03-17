package com.grohvlad.video_classes;

import com.grohvlad.video_converter_classes.*;

public class VideoConverter {
    public static VideoFile convert(VideoFile videoFile, String format){
        System.out.println("\n======= VideoConversionFacade: conversion started. =======");
        Codec sourceCodec = CodecFactory.extract(videoFile);

        Codec destinationCodec = new MPEG4CompressionCodec();
        Buffer buffer = BitrateReader.read(videoFile, sourceCodec);
        VideoFile videoFileConverted = BitrateReader.convert(buffer, videoFile.getName(), destinationCodec);
        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(videoFileConverted, videoFile.getAudioBuffer());

        System.out.println("====== VideoConversionFacade: conversion completed =======\n");

        return videoFileConverted;
    }
}
