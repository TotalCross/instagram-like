package com.totalcross.sample.iglike.dao;

import java.util.ArrayList;
import java.util.List;

import com.totalcross.sample.iglike.model.Post;
import com.totalcross.sample.iglike.util.Images;

/**
 * This class is to simulate database access.
 * 
 * @author brunoamuniz
 *
 */
public class PostDAO {

	/**
	 * Method to retrieve the list of posts to show at the Feed
	 * 
	 * @return list of posts
	 */
	public List<Post> getPosts() {

		/**
		 * TODO you can replace this with database access or a REST call to an web
		 * service
		 */
		List<Post> posts = new ArrayList<Post>();

		Post post = new Post();
		posts.add(post);
		post.setLikes(15);
		post.setLocation("Fortaleza, Ce");
		post.setPhoto(Images.feedImage2);
		post.setProfilePic(Images.myProfile);
		post.setText("Love my City");
		post.setProfileName("Wanderlust");
		post.setMinutesAgo("15");

		post = new Post();
		posts.add(post);
		post.setLikes(55);
		post.setLocation("Paris, France");
		post.setPhoto(Images.feedImage3);
		post.setProfilePic(Images.profile);
		post.setText("Colors of the night");
		post.setProfileName("TotalCross");

		post.setMinutesAgo("23");

		post = new Post();
		posts.add(post);
		post.setLikes(45);
		post.setLocation("Fortaleza, Ce");
		post.setPhoto(Images.feedImage4);
		post.setProfilePic(Images.myProfile);
		post.setText("Nice day to swin");
		post.setProfileName("Wanderlust");

		post.setMinutesAgo("38");

		post = new Post();
		posts.add(post);
		post.setLikes(15);
		post.setLocation("Copanhagen, Denmark");
		post.setPhoto(Images.feedImage1);
		post.setProfilePic(Images.profile);
		post.setText("Live to explore");
		post.setProfileName("TotalCross");
		post.setMinutesAgo("45");

		return posts;
	}

}
