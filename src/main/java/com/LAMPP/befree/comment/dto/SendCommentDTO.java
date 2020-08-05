package com.LAMPP.befree.comment.dto;

import com.LAMPP.befree.comment.commentModel.Rating;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

public class SendCommentDTO {

   // @NotNull(message = "Please provide a receiver")
    public UUID toProfile;

   // @NotNull(message = "Could not send a message, please try again")
    public UUID fromProfile;

    //@NotBlank(message = "Don't forget to write your message")
   // @Size(max = 2000, message = "Message too long. Try to be brief!")
    public String body;

    //@NotBlank(message = "Don't forget to choice your raiting")
    public Rating rating;
}
