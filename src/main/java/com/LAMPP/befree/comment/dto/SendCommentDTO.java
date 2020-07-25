package com.LAMPP.befree.comment.dto;

import com.LAMPP.befree.comment.commentModel.Rating;

import java.util.UUID;

public class SendCommentDTO {

    public UUID toUser;
    public UUID fromUser;
    public String body;
    public Rating rating;
}
