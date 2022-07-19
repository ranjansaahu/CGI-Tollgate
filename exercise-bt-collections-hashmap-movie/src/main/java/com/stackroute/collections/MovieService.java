package com.stackroute.collections;

import java.time.LocalDate;
import java.util.*;

/*
This class contains a property called movieMap of type Map
This class contains methods for adding key-value pairs of Movie and its rating to HashMap and
various methods for accessing the keys and values based on some conditions
 */
public class MovieService {

    /**
     * Constructor to create movieMap as an empty  LinkedHashMap object
     */
	private Map<Movie, Integer> movieMap;
	
    public MovieService() {
    	this.movieMap = new LinkedHashMap<Movie, Integer>();
    }

    /*
    Returns the movieMap object
     */
    public Map<Movie, Integer> getMovieMap() {
        return movieMap;
    }

    /*
    Add key-value pairs of Movie-Integer type and returns Set of Map.Entry
     */
    public Set<Map.Entry<Movie, Integer>> addKeyValuePairsToMap(Movie movie, Integer rating) {
    	this.movieMap.put(movie, rating);
        return movieMap.entrySet();
    }

    /*
    Return Set of movie names having rating greater than or equal to given rating
     */
    public List<String> getHigherRatedMovieNames(int rating) {
    	Set<Movie> keys = movieMap.keySet();
    	List<String> movieNames = new ArrayList<String>(); 
    	for(Movie key : keys) {
    		if(movieMap.get(key) >= rating) {
    			movieNames.add(key.getMovieName());
    		}
    	}
        return movieNames;
    }

    /*
    Return Set of movie names belonging to specific genre
     */
    public List<String> getMovieNamesOfSpecificGenre(String genre) {
    	Set<Movie> keys = movieMap.keySet();
    	List<String> movieNames = new ArrayList<String>(); 
    	for(Movie key : keys) {
    		if(key.getGenre().equals(genre)) {
    			movieNames.add(key.getMovieName());
    		}
    	}
        return movieNames;
    }

   /*
   Return Set of movie names which are released after Specific releaseDate and having rating less than or equal to 3
    */

    public List<String> getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(LocalDate releaseDate) {
    	Set<Movie> keys = movieMap.keySet();
    	Set<String> movieNames = new LinkedHashSet<String>(); 
    	for(Movie key : keys) {
    		if(key.getReleaseDate().compareTo(releaseDate) > 0 && movieMap.get(key) < 3) {
    			movieNames.add(key.getMovieName());
    		}
    	}
        return new ArrayList<String>(movieNames);
    }

    /*
    Return set of movies sorted by release dates in ascending order.
    Hint: Use TreeMap
     */
    public List<Movie> getSortedMovieListByReleaseDate() {
    	Set<Movie> keys = movieMap.keySet();
    	Set<Movie> movies = new TreeSet<Movie>(keys);
        return new ArrayList<Movie>(movies);
    }

    /*
   Return set of movies sorted by rating.
   Hint: Use Comparator and LinkedHashMap
    */
    public Map<Movie, Integer> getSortedMovieListByRating() {
        List<Map.Entry<Movie, Integer>> entry = new LinkedList<Map.Entry<Movie, Integer>>(movieMap.entrySet());
        Collections.sort(entry, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));
        Map<Movie, Integer> sortedMap = new LinkedHashMap<Movie, Integer>();
        for(Map.Entry<Movie, Integer> pair : entry) {
        	sortedMap.put(pair.getKey(), pair.getValue());
        }
        return sortedMap;
    }
}
