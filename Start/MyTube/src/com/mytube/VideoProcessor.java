package com.mytube;

public class VideoProcessor {
    private VideoEncoder videoEncoder;
    private VideoDatabase database;
    private EmailService emailService;

    public VideoProcessor(VideoEncoder videoEncoder,
                          VideoDatabase database,
                          EmailService emailService) {
        this.videoEncoder = videoEncoder;
        this.database = database;
        this.emailService = emailService;
    }
    public void process(Video video) {
        videoEncoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

