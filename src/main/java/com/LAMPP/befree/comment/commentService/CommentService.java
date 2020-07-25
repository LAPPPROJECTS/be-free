package com.LAMPP.befree.comment.commentService;

import com.LAMPP.befree.comment.commentModel.Comment;
import com.LAMPP.befree.comment.commentRepository.InterfaceCommentRepository;
import com.LAMPP.befree.comment.dto.CommentToDTOMapper;
import com.LAMPP.befree.comment.dto.SendCommentDTO;
import com.LAMPP.befree.comment.dto.ShowCommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class CommentService {

    private InterfaceCommentRepository commentRepository;
    private CommentToDTOMapper commentToDTOMapper;

    @Autowired
public CommentService ( InterfaceCommentRepository commentRepository, CommentToDTOMapper commentToDTOMapper) {
        this.commentRepository = commentRepository;
        this.commentToDTOMapper = commentToDTOMapper;
    }

    public List<ShowCommentDTO> getAllComment() {
        List<Comment> allComment = commentRepository.findAll();
        return allComment.stream().map(comment -> commentToDTOMapper.showCommentDTO(comment)).collect(Collectors.toList());
    }

    public  Comment sendComment ( SendCommentDTO sendCommentDTO ){

        Comment comment = new Comment(sendCommentDTO.toUser, sendCommentDTO.fromUser, sendCommentDTO.body, sendCommentDTO.rating);
        commentRepository.save(comment);
        return comment;
    }
}
