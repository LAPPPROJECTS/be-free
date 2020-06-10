package com.LAMPP.befree.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

    private LocalDateTime localDateTime;
    private ReviewService reviewService;
    private List<Review> reviews;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
        reviews.add (new Review ("AAA", 2, localDateTime));
        reviews.add (new Review ("BBB", 3, localDateTime));
    }

    @GetMapping
    public List<Review> getReview() {
        return reviews;
    }

    @PostMapping
    public boolean addReview(@RequestBody Review review) {
        return reviews.add (review);
    }

    @DeleteMapping
    public void deleteReview(@RequestParam int index) {
        reviews.remove (index);
    }
}
