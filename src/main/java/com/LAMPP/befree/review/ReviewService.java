package com.LAMPP.befree.review;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Service
public class ReviewService {
    ReviewRepository reviewRepository;
    ReviewToDTOMapper reviewToDTOMapper;


    @Autowired
    public ReviewService(ReviewToDTOMapper reviewToDTOMapper, ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
        this.reviewToDTOMapper = reviewToDTOMapper;
    }

    public List<ReviewDTO> getAllReview() {
        List<Review> ReviewList = reviewRepository.getAll ();
        return ReviewList.stream ().map (review -> reviewToDTOMapper.reviewDTO (review)).collect(Collectors.toList());
    }

    public void addReviewToRepository(ReviewDTO reviewDTO) {
        Review review = new Review (reviewDTO.content, reviewDTO.rating, reviewDTO.localDateTime);
        reviewRepository.addReview (review);
    }

    public void remove(ReviewDTO reviewDTO) {
        Review review = new Review (reviewDTO.content, reviewDTO.rating, reviewDTO.localDateTime);
        reviewRepository.deleteReview (review);
    }
}
