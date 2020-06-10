package com.LAMPP.befree.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

    private final Object LocalDateTime;
    private ReviewService reviewService;
    private List<Review> reviews;

    @Autowired
    public ReviewController(@Qualifier("entityManagerFactory") Object localDateTime, ReviewService reviewService) {
        LocalDateTime = localDateTime;
        this.reviewService = reviewService;
        this.reviews = new ArrayList<>();
        reviews.add(new Review("AAA", 2, LocalDateTime));
        reviews.add(new Review("BBB", 3, LocalDateTime));
    }

    @GetMapping("/review")
    public List<Review> getReview() {
        return reviews;
    }

    @PostMapping("/review")
    public boolean addReview(@RequestBody Review review) {
        return reviews.add(review);
    }

    @DeleteMapping("/review")
    public void deleteReview(@RequestParam int index) {
        reviews.remove(index);
    }
}
