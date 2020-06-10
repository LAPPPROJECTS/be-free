package com.LAMPP.befree.review;



public class ReviewToDTOMapper {
    public ReviewDTO reviewDTO(Review review) {
        if (review == null) {
            return null;
        } else {
            ReviewDTO ReviewDTO = new ReviewDTO();
            ReviewDTO.from = Review.getFrom();
            ReviewDTO.to = Review.getTo();
            ReviewDTO.body = Review.getBody();
            return ReviewDTO;
        }
    }
}
