package com.LAMPP.befree.comment.commentRepository;

import com.LAMPP.befree.comment.commentModel.Comment;
import com.LAMPP.befree.messaging.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository

public interface InterfaceCommentRepository extends JpaRepository<Comment, UUID> {
}
