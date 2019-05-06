package com.totalcross.sample.iglike.ui;

import com.totalcross.sample.iglike.util.Colors;
import com.totalcross.sample.iglike.util.Images;

import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.Ruler;
import totalcross.ui.layout.HBox;

public class Footer extends Container {

	@Override
	public void initUI() {
		super.initUI();

		setBackColor(Colors.BACK);

		Ruler ruler = new Ruler(Ruler.HORIZONTAL, false);
		ruler.setForeColor(Colors.GRAY);

		add(ruler, LEFT, TOP, FILL, PREFERRED);

		HBox hBox = new HBox(HBox.LAYOUT_FILL, HBox.ALIGNMENT_CENTER);

		add(hBox, LEFT, AFTER, FILL, FILL);

		ImageControl home;
		home = new ImageControl(Images.getMaterialSizeIcon(Images.home));
		home.scaleToFit = true;
		home.centerImage = true;
		hBox.add(home);

		ImageControl lookup;
		lookup = new ImageControl(Images.getMaterialSizeIcon(Images.lookup));
		lookup.scaleToFit = true;
		lookup.centerImage = true;
		hBox.add(lookup);

		ImageControl plus;
		plus = new ImageControl(Images.getMaterialSizeIcon(Images.plus));
		plus.scaleToFit = true;
		plus.centerImage = true;
		hBox.add(plus);

		ImageControl heart;
		heart = new ImageControl(Images.getMaterialSizeIcon(Images.heart));
		heart.scaleToFit = true;
		heart.centerImage = true;
		hBox.add(heart);

		ImageControl myProfile;
		myProfile = new ImageControl(Images.getMaterialSizeIcon(Images.myProfile));
		myProfile.scaleToFit = true;
		myProfile.centerImage = true;
		hBox.add(myProfile);

	}
}
