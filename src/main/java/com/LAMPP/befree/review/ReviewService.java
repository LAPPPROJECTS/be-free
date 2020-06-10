package com.LAMPP.befree.review;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Service
public class ReviewService {
    private ReviewRepository reviewRepository;
    private ReviewToDTOMapper reviewToDTOMapper;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository, ReviewToDTOMapper reviewToDTOMapper) {
        this.reviewRepository = reviewRepository;
        this.reviewToDTOMapper = reviewToDTOMapper;
    }

    public List<ReviewDTO> getAllReview() {
        List<Review> allReview = (List<Review>) reviewRepository.findAll();
        return allReview.stream().map(review -> reviewToDTOMapper.reviewDTO(review)).collect(Collectors.toList());
    }

    public void sendReview(ReviewDTO ReviewDTO){

        Review review = new Review(ReviewDTO.content, ReviewDTO.rating, ReviewDTO.localDateTime);
        reviewRepository.save(review);

    }
}
