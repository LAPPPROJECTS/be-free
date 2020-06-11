package com.LAMPP.befree.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewRepository {

    private LocalDateTime localDateTime;
    private ReviewService reviewService;
    private List<Review> reviews = new ArrayList<> ();


    @Autowired
    public ReviewRepository(ReviewService reviewService) {
        this.reviewService = reviewService;
        reviews.add (new Review ("AAA", Rating.IS_VERY_BAD, localDateTime));
        reviews.add (new Review ("BBB", Rating.IS_EXCELLENT, localDateTime));
    }

    public List<Review> getAll() {
        return reviews;
    }

    public boolean addReview(@RequestBody Review review) {
        return reviews.add (review);
    }

    public void deleteReview(@RequestParam int index) {
        reviews.remove (index);
    }
}
