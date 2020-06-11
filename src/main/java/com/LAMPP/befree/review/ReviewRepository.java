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
        reviews.add (new Review ("AAA", Rating.IS_VERY_BAD, localDateTime));
        reviews.add (new Review ("CCC", Rating.IS_BAD, localDateTime));
        reviews.add (new Review ("DDD", Rating.IS_OK, localDateTime));
        reviews.add (new Review ("EEE", Rating.IS_GOOD, localDateTime));
        reviews.add (new Review ("BBB", Rating.IS_EXCELLENT, localDateTime));
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
