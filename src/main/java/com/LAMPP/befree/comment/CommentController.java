package com.LAMPP.befree.comment;

import com.LAMPP.befree.comment.commentService.CommentService;
import com.LAMPP.befree.comment.dto.SendCommentDTO;
import com.LAMPP.befree.comment.dto.ShowCommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/comment")
public class CommentController {

private CommentService commentService;

@Autowired
    public CommentController ( CommentService commentService){
    this.commentService = commentService;
}

@GetMapping
    public ResponseEntity <List <ShowCommentDTO>> getAllComment(){
    return new ResponseEntity<>(commentService.getAllComment(), HttpStatus.OK);
}

@PostMapping
    public ResponseEntity<SendCommentDTO> sendComment (@RequestBody SendCommentDTO commentDTO){

    commentService.sendComment(commentDTO);
    return new ResponseEntity<>(HttpStatus.CREATED);
}
}
