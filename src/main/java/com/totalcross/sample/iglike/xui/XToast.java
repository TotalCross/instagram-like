package com.totalcross.sample.iglike.xui;

import totalcross.ui.Control;
import totalcross.ui.Toast;
import totalcross.util.UnitsConverter;

public class XToast {

	public static void showToast(String message) {
		// fmh is the font size. Let's set the toast size to 3 times font size
		Toast.height = UnitsConverter.toPixels(40 + Control.DP);
		// You can control position of toast too
		Toast.posY = (int) (Control.BOTTOM - UnitsConverter.toPixels(16 + Control.DP));

		Toast.show(message, 2000);
	}

}
