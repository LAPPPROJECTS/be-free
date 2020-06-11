package com.LAMPP.befree.review;

import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;

public class ReviewDTO  {
    public int idFrom;
    public int idFor;
    public String content;
    public Enum rating;
    public LocalDateTime localDateTime;
}
