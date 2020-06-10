package com.LAMPP.befree.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewService {
    private ReviewRepository reviewRepository;
    private ReviewToDTOMapper reviewToDTOMapper;

    @Autowired
    public ReviewService(com.LAMPP.befree.review.ReviewRepository reviewRepository, ReviewToDTOMapper reviewToDTOMapper) {
        this.reviewRepository = reviewRepository;
        this.reviewToDTOMapper = reviewToDTOMapper;
    }

    public List<Object> getAllReview() {
        List<Review> allReview = (List<Review>) reviewRepository.findAll();
        return allReview.stream().map(review -> reviewToDTOMapper.ReviewDTO(review)).collect(Collectors.toList());
    }

    public void sendReview(ReviewDTO ReviewDTO){

        Review review = new Review(ReviewDTO.to, ReviewDTO.from, ReviewDTO.body);
        reviewRepository.save(review);

    }
}
