package com.LAMPP.befree.review;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("ReviewRepository")
public interface ReviewRepository extends CrudRepository<Review, Integer> {
}
