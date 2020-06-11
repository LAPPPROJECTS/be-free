package com.LAMPP.befree.review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Repository
public class ReviewRepository {

    private List<Review> reviews = new ArrayList<Review>();


    @Autowired
    public ReviewRepository() {
        LocalDateTime localDateTime = LocalDateTime.now ();
        reviews.add (new Review (1,2,"AAA", Rating.IS_VERY_BAD, localDateTime));
        reviews.add (new Review (2,3,"CCC", Rating.IS_BAD, localDateTime));
        reviews.add (new Review (3,4,"DDD", Rating.IS_OK, localDateTime));
        reviews.add (new Review (4,5,"EEE", Rating.IS_GOOD, localDateTime));
        reviews.add (new Review (5,6,"BBB", Rating.IS_EXCELLENT, localDateTime));
    }

    public List<Review> getAll() {
        return reviews;
    }

    public boolean addReview(@RequestBody Review review) {
        return reviews.add (review);
    }

    public void deleteReview(@RequestParam Review review) {
        reviews.remove (review);
    }
}
