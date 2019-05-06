package com.totalcross.sample.iglike.ui;

import com.totalcross.sample.iglike.util.Colors;
import com.totalcross.sample.iglike.util.Images;
import com.totalcross.sample.iglike.util.MaterialConstants;

import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.Ruler;

public class Header extends Container {

	@Override
	public void initUI() {
		super.initUI();

		setBackColor(Colors.BACK);

		ImageControl logo = new ImageControl(Images.logo);
		logo.scaleToFit = true;
		logo.centerImage = true;

		add(logo, CENTER, CENTER, PREFERRED, MaterialConstants.PROFILE_SIZE);

		ImageControl camera = new ImageControl(Images.camera);
		camera.scaleToFit = true;
		camera.centerImage = true;
		add(camera, LEFT + MaterialConstants.BORDER_SPACING, CENTER_OF, MaterialConstants.ICONS_SIZE,
				MaterialConstants.ICONS_SIZE);

		ImageControl foward = new ImageControl(Images.foward);
		foward.scaleToFit = true;
		foward.centerImage = true;
		add(foward, RIGHT - MaterialConstants.BORDER_SPACING, CENTER_OF, MaterialConstants.ICONS_SIZE,
				MaterialConstants.ICONS_SIZE, logo);

		ImageControl igtv = new ImageControl(Images.igtv);
		igtv.scaleToFit = true;
		igtv.centerImage = true;
		add(igtv, BEFORE - MaterialConstants.BORDER_SPACING, CENTER_OF, MaterialConstants.ICONS_SIZE,
				MaterialConstants.ICONS_SIZE);

		Ruler ruler = new Ruler(Ruler.HORIZONTAL, false);
		ruler.setForeColor(Colors.GRAY);

		add(ruler, LEFT, BOTTOM, FILL, PREFERRED);

	}
}
