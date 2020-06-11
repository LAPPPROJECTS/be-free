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
    public List<ReviewDTO> getReview() {
        return reviewService.getAllReview ();
    }

    @PostMapping
    public void addReviewToRepository(@RequestBody ReviewDTO reviewDTO) {
        reviewService.addReviewToRepository (reviewDTO);
    }

    @DeleteMapping
    public void remove(@RequestParam ReviewDTO reviewDTO) {
        reviewService.remove (reviewDTO);
    }

}
