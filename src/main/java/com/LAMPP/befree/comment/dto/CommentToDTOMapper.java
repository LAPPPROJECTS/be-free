package com.LAMPP.befree.comment.dto;

import com.LAMPP.befree.comment.commentModel.Comment;
import org.springframework.stereotype.Service;

@Service

public class CommentToDTOMapper {

    public ShowCommentDTO showCommentDTO(Comment comment) {
        if (comment == null) {
            return null;
        } else {
            ShowCommentDTO showCommentDTO = new ShowCommentDTO();

            showCommentDTO.idComment = comment.getIdComment();
            showCommentDTO.toProfile = comment.getToProfile();
            showCommentDTO.fromProfile = comment.getFromProfile();
            showCommentDTO.commentBody = comment.getCommentBody();
            showCommentDTO.rating = comment.getRating();
            return showCommentDTO;
        }
    }
}
