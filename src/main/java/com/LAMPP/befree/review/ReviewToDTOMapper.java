package com.LAMPP.befree.review;

import org.springframework.stereotype.Service;

@Service
public class ReviewToDTOMapper {

    public ReviewDTO reviewDTO(Review review) {
        if (review == null) {
            return null;
        } else {
            ReviewDTO ReviewDTO = new ReviewDTO ();
            ReviewDTO.content = review.getContent ();
            ReviewDTO.rating = review.getRating ();
            ReviewDTO.localDateTime = review.getLocalDateTime ();
            return ReviewDTO;
        }
    }

}
