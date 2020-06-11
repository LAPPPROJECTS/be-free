package com.LAMPP.befree.review;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@NoArgsConstructor
@Service
public class ReviewService {
    ReviewRepository reviewRepository;


    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> getAllReview(){
        return reviewRepository.getAll ();
    }

    public boolean addRepository(Review review) {
        reviewRepository.addReview (review);
        return false;
    }

    public void remove(int index) {
        reviewRepository.deleteReview(index);
    }
}
