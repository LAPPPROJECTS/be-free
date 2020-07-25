package com.LAMPP.befree.comment.commentModel;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.util.UUID;

@JsonAutoDetect
@Getter
@Entity

public class Comment {
    @javax.persistence.Id
    @Id
    private UUID idComment;

    private UUID toProfile;
    private UUID fromProfile;
    private String commentBody;
    private Rating rating;

    public Comment(UUID toProfile, UUID fromProfile, String commentBody, Rating rating) {

        this.idComment = UUID.randomUUID();
        this.toProfile = toProfile;
        this.toProfile = fromProfile;
        this.commentBody = commentBody;
        this.rating = rating;

    }

    public Comment(){

    }

}
