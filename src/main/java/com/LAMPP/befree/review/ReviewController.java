package com.LAMPP.befree.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

    ReviewService reviewService;
    @Autowired
    public ReviewController(ReviewService reviewService){
        this.reviewService = reviewService;
    }

    public ReviewController() {
    }

    @GetMapping
    public List<Review> getReview() {
        return reviewService.getAllReview ();
    }

    @PostMapping
    public boolean addReview(@RequestBody Review review) {
        return reviewService.addRepository (review);
    }

    @DeleteMapping
    public void deleteReview(@RequestParam int index) {
        reviewService.remove (index);
    }

}
