package com.LAMPP.befree.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

    private ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public ResponseEntity<List<ReviewDTO>> getAllMessages(){
        return new ResponseEntity<>(reviewService.getAllReview(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity sendMessage(@RequestBody ReviewDTO reviewDto){

        reviewService.sendReview(reviewDto);
        return new ResponseEntity(HttpStatus.OK);

    }
}
