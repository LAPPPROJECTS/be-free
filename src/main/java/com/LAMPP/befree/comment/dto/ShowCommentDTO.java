package com.LAMPP.befree.comment.dto;

import com.LAMPP.befree.comment.commentModel.Rating;

import java.util.UUID;

public class ShowCommentDTO {

    public UUID idComment;

    public UUID toProfile;
    public UUID fromProfile;
    public String commentBody;
    public Rating rating;

}
