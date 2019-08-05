package com.capgemini.movieratingservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.movieratingservice.model.Rating;
import com.capgemini.movieratingservice.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class MovieRatingController {
	
	@GetMapping("/{userId}")
	public UserRating getMovieRating(@PathVariable String userId)
	{
		if(userId.equals("Pallavi")) {
		List<Rating> ratings= Arrays.asList(new Rating(101,4),new Rating(102,5));
		UserRating userRating= new UserRating("Pallavi", ratings);
		return userRating;
		}
		return null;
	}
	
}
