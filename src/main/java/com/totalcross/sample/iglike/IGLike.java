package com.totalcross.sample.iglike;

import java.util.List;

import com.totalcross.sample.iglike.dao.PostDAO;
import com.totalcross.sample.iglike.model.Post;
import com.totalcross.sample.iglike.ui.FeedCard;
import com.totalcross.sample.iglike.ui.Footer;
import com.totalcross.sample.iglike.ui.Header;
import com.totalcross.sample.iglike.util.MaterialConstants;

import totalcross.sys.Settings;
import totalcross.ui.MainWindow;
import totalcross.ui.ScrollContainer;
import totalcross.ui.dialog.MessageBox;

/**
 * Simple example to help you create your own app with TotalCross.
 * 
 * If you need more help, reach us at www.totalcross.com
 * 
 * You can find the full explanation of this sample at
 * http://www.totalcross.com/documentation/getting_started.html
 */
public class IGLike extends MainWindow {

	public IGLike() {
		super("Instagram Like", NO_BORDER);
		setUIStyle(Settings.MATERIAL_UI);
	}

	static {
		Settings.applicationId = "TCIG";
		Settings.appVersion = "1.0.1";
		Settings.iosCFBundleIdentifier = "br.com.softsite.instagram";
	}

	@Override
	public void initUI() {
		try {

			PostDAO dao = new PostDAO();

			ScrollContainer sc = new ScrollContainer(false, true);

			// Header and Footer control to provide similar look adn feel...
			Header header = new Header();
			Footer footer = new Footer();
			add(header, LEFT, TOP, FILL, MaterialConstants.EDIT_HEIGHT);
			add(footer, LEFT, BOTTOM, FILL, MaterialConstants.EDIT_HEIGHT);

			add(sc, LEFT, AFTER, FILL, FIT, header);

			// retrieving all the posts from database
			List<Post> posts = dao.getPosts();

			// lets publish each post returned
			for (Post post : posts) {
				/**
				 * TODO Better strategy here is to have a lazy loading of the posts, specially
				 * because the memory of each picture
				 */
				FeedCard feedCard = new FeedCard(post);
				sc.add(feedCard, LEFT, AFTER + MaterialConstants.BORDER_SPACING, SCREENSIZE,
						feedCard.getFeedCardHeight());
			}

		} catch (Exception e) {
			MessageBox.showException(e, true);
			exit(0);
		}
	}
}
