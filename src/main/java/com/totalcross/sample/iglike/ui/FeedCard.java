package com.totalcross.sample.iglike.ui;

import com.totalcross.sample.iglike.util.Colors;
import com.totalcross.sample.iglike.util.Fonts;
import com.totalcross.sample.iglike.util.Images;
import com.totalcross.sample.iglike.util.MaterialConstants;
import com.totalcross.sample.iglike.xui.XToast;

import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.MainWindow;
import totalcross.ui.event.Event;
import totalcross.ui.event.PenEvent;
import totalcross.ui.image.Image;
import totalcross.util.UnitsConverter;

public class FeedCard extends Container {

	private ImageControl heart;
	private ImageControl redheart;
	private ImageControl feedImage;

	private boolean liked = false;

	private int feedCardHeight;
	private int imageHeight;

	public FeedCard(Image image) {

		feedImage = new ImageControl(Images.getScaledDimension(image, MainWindow.getMainWindow().getWidth(),
				MainWindow.getMainWindow().getHeight()));
		feedImage.scaleToFit = true;
		feedImage.centerImage = true;

		imageHeight = feedImage.getImage().getHeight();
		feedCardHeight = imageHeight + UnitsConverter.toPixels((170) + DP);

	}

	public int getFeedCardHeight() {
		return feedCardHeight;
	}

	@Override
	public void initUI() {

		ImageControl profile = new ImageControl(Images.profile);
		profile.scaleToFit = true;
		profile.centerImage = true;
		add(profile, LEFT + MaterialConstants.BORDER_SPACING, TOP, MaterialConstants.PROFILE_SIZE,
				MaterialConstants.PROFILE_SIZE);

		Container info = new Container();

		add(info, AFTER + MaterialConstants.EIGHT_DP_SPACING, CENTER_OF, FILL, MaterialConstants.PROFILE_SIZE);

		Label profileName = new Label("Wanderlust");
		profileName.setFont(Fonts.latoLightasBold);

		info.add(profileName, LEFT, TOP);

		Label location = new Label("São Paulo, Brazil");
		location.setFont(Fonts.latoLightMinus2);

		info.add(location, LEFT, AFTER + MaterialConstants.TWO_DP_SPACING);

		add(feedImage, LEFT, AFTER + MaterialConstants.EIGHT_DP_SPACING, SCREENSIZE, imageHeight);

		redheart = new ImageControl(Images.redHeart);
		redheart.scaleToFit = true;
		redheart.centerImage = true;
		add(redheart, LEFT + MaterialConstants.BORDER_SPACING, AFTER + MaterialConstants.BORDER_SPACING,
				MaterialConstants.ICONS_SIZE, MaterialConstants.ICONS_SIZE);

		redheart.setVisible(false);

		heart = new ImageControl(Images.heart);
		heart.scaleToFit = true;
		heart.centerImage = true;
		add(heart, SAME, SAME, MaterialConstants.ICONS_SIZE, MaterialConstants.ICONS_SIZE);

		ImageControl comment = new ImageControl(Images.comment);
		comment.scaleToFit = true;
		comment.centerImage = true;
		add(comment, AFTER + MaterialConstants.BORDER_SPACING, CENTER_OF, MaterialConstants.ICONS_SIZE,
				MaterialConstants.ICONS_SIZE);

		ImageControl foward = new ImageControl(Images.foward);
		foward.scaleToFit = true;
		foward.centerImage = true;
		add(foward, AFTER + MaterialConstants.BORDER_SPACING, CENTER_OF, MaterialConstants.ICONS_SIZE,
				MaterialConstants.ICONS_SIZE);

		ImageControl save = new ImageControl(Images.save);
		save.scaleToFit = true;
		save.centerImage = true;
		add(save, RIGHT - MaterialConstants.BORDER_SPACING, CENTER_OF, MaterialConstants.ICONS_SIZE,
				MaterialConstants.ICONS_SIZE);

		Label curtidas = new Label("13 likes");
		curtidas.setFont(Fonts.latoLightasBold);

		add(curtidas, LEFT + MaterialConstants.BORDER_SPACING, AFTER + MaterialConstants.EIGHT_DP_SPACING);

		profileName = new Label("Wanderlust");
		profileName.setFont(Fonts.latoLightasBold);

		add(profileName, LEFT + MaterialConstants.BORDER_SPACING, AFTER + MaterialConstants.EIGHT_DP_SPACING);

		Label text = new Label("Such a nice day to create an app with #TotalCross");
		text.setFont(Fonts.latoLightDefaultSize);

		add(text, AFTER + MaterialConstants.FOUR_DP_SPACING, SAME);

		Label posted = new Label("Posted 30 minutes ago");
		posted.setFont(Fonts.latoLightMinus2);
		posted.setForeColor(Colors.DARK_GRAY);

		add(posted, LEFT + MaterialConstants.BORDER_SPACING, AFTER + MaterialConstants.FOUR_DP_SPACING);

	}

	// created to control the drag event....
	private boolean dragStarted = false;

	@Override
	public void onEvent(Event event) {
		super.onEvent(event);

		switch (event.type) {
		case PenEvent.PEN_DRAG_START:
			dragStarted = true;
			break;
		case PenEvent.PEN_UP:
			if (event.target == feedImage) {
				if (!dragStarted) {

					liked = !liked;
					heart.setVisible(!liked);
					redheart.setVisible(liked);

					XToast.showToast("You Liked the Pic =)");
				} else {
					dragStarted = false;
				}
			}
			break;
		}
	}
}
