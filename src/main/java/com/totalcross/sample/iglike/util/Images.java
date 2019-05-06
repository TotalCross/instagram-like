package com.totalcross.sample.iglike.util;

import totalcross.io.IOException;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Images {

	public static Image feedImage1, feedImage2, feedImage3, feedImage4;
	public static Image logo;
	public static Image camera;
	public static Image igtv;
	public static Image foward;
	public static Image heart;
	public static Image save;
	public static Image profile;
	public static Image comment;
	public static Image redHeart;
	public static Image home;
	public static Image lookup;
	public static Image plus;
	public static Image myProfile;

	static {
		try {
			feedImage1 = new Image("images/ig1.png");
			feedImage2 = new Image("images/ig2.png");
			feedImage3 = new Image("images/ig3.png");
			feedImage4 = new Image("images/ig4.png");

			logo = new Image("images/instagram.png");
			camera = new Image("images/camera.png");
			igtv = new Image("images/igtv.png");
			foward = new Image("images/foward.png");
			heart = new Image("images/heart.png");
			save = new Image("images/save.png");
			profile = new Image("images/profile.png");
			comment = new Image("images/comment.png");
			redHeart = new Image("images/redheart.png");
			home = new Image("images/home.png");
			lookup = new Image("images/lookup.png");
			plus = new Image("images/plus.png");
			myProfile = new Image("images/myProfile.png");

			// logo = logo.getScaledInstance(logo.getWidth() / 4, logo.getHeight() / 4);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ImageException e) {
			e.printStackTrace();
		}
	}

	public static Image getMaterialSizeIcon(Image image) {
		try {
			return image.getSmoothScaledInstance(MaterialConstants.ICONS_SIZE, MaterialConstants.ICONS_SIZE);
		} catch (ImageException e) {
			e.printStackTrace();
		}
		return image;
	}

	public static boolean isLandscape(Image image) {
		return image.getWidth() > image.getHeight();
	}

	public static Image getScaledDimension(Image image, int screenHeight, int screenWidth) {

		try {

			double widthRatio = (double) screenHeight / image.getWidth();
			double heightRatio = (double) screenWidth / image.getHeight();
			double ratio = Math.min(widthRatio, heightRatio);

			return image.getSmoothScaledInstance((int) (image.getWidth() * ratio), (int) (image.getHeight() * ratio));
		} catch (ImageException e) {
			e.printStackTrace();
		}
		return null;

	}

}
