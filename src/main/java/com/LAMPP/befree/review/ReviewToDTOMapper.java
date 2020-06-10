package com.LAMPP.befree.review;


import org.springframework.stereotype.Service;

import java.sql.Time;
import java.time.LocalDateTime;

@Service
public class ReviewToDTOMapper {

    public ReviewDTO reviewDTO(Review review) {
        if (review == null) {
            return null;
        } else {
            ReviewDTO ReviewDTO = new ReviewDTO();
            ReviewDTO.content = review.getContent();
            ReviewDTO.rating = review.getRating ();
            ReviewDTO.localDateTime = review.getTime();
            return ReviewDTO;
        }
    }

}
