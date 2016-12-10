package com.moka.mvpsample._framework.widget.toolbar;


import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.moka.mvpsample.R;


public class ToolbarLayout extends FrameLayout implements View.OnClickListener {

	ImageView imageView_home;
	ImageView imageView_menu;

	HomeListener homeListener;
	MenuListener menuListener;

	public ToolbarLayout(@NonNull Context context) {
		super(context);
		initView();
	}

	public ToolbarLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
		initView();
	}

	public ToolbarLayout(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		initView();
	}

	private void initView() {
		View rootView = LayoutInflater.from(getContext()).inflate(R.layout.toolbar_moka, null);
		super.addView(rootView);

		imageView_home = (ImageView) rootView.findViewById(R.id.imageView_home);
		imageView_menu = (ImageView) rootView.findViewById(R.id.imageView_menu);

		imageView_home.setOnClickListener(this);
		imageView_menu.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch ( view.getId() ) {
			case R.id.imageView_home:
				if ( null != homeListener )
					homeListener.onClickHome();
				break;

			case R.id.imageView_menu:
				if ( null != menuListener )
					menuListener.onClickMenu();
				break;
		}
	}

	/**
	 */

	public void setOnClickHome(HomeListener homeListener) {
		this.homeListener = homeListener;
	}

	public void setOnClickMenu(MenuListener menuListener) {
		this.menuListener = menuListener;
	}

	public void visibleHome(boolean isVisible) {
		if ( isVisible )
			imageView_home.setVisibility(View.VISIBLE);
		else
			imageView_home.setVisibility(View.GONE);
	}

	public void visibleMenu(boolean isVisible) {
		if ( isVisible )
			imageView_menu.setVisibility(View.VISIBLE);
		else
			imageView_menu.setVisibility(View.GONE);
	}

	public void setHomeImageRes(int imageResId) {
		imageView_home.setImageResource(imageResId);
	}

	public void setMenuImageRes(int imageResId) {
		imageView_menu.setImageResource(imageResId);
	}

	/**
	 */

	public interface HomeListener {

		void onClickHome();
	}

	public interface MenuListener {

		void onClickMenu();
	}

}
