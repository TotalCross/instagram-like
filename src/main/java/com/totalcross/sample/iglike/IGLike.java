package com.totalcross.sample.iglike;

import com.totalcross.sample.iglike.ui.FeedCard;
import com.totalcross.sample.iglike.ui.Footer;
import com.totalcross.sample.iglike.ui.Header;
import com.totalcross.sample.iglike.util.Images;
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

	@Override
	public void initUI() {
		try {

			ScrollContainer sc = new ScrollContainer(false, true);
			Header header = new Header();
			Footer footer = new Footer();
			add(header, LEFT, TOP, FILL, MaterialConstants.EDIT_HEIGHT);
			add(footer, LEFT, BOTTOM, FILL, MaterialConstants.EDIT_HEIGHT);

			add(sc, LEFT, AFTER, FILL, FIT, header);

			FeedCard feedCard = new FeedCard(Images.feedImage2);
			sc.add(feedCard, LEFT, TOP + MaterialConstants.BORDER_SPACING, SCREENSIZE, feedCard.getFeedCardHeight());
			feedCard = new FeedCard(Images.feedImage3);
			sc.add(feedCard, LEFT, AFTER + MaterialConstants.BORDER_SPACING, SCREENSIZE, feedCard.getFeedCardHeight());
			feedCard = new FeedCard(Images.feedImage4);
			sc.add(feedCard, LEFT, AFTER + MaterialConstants.BORDER_SPACING, SCREENSIZE, feedCard.getFeedCardHeight());
			feedCard = new FeedCard(Images.feedImage1);
			sc.add(feedCard, LEFT, AFTER + MaterialConstants.BORDER_SPACING, SCREENSIZE, feedCard.getFeedCardHeight());

		} catch (Exception e) {
			MessageBox.showException(e, true);
			exit(0);
		}
	}
}
