package com.moka.mvpsample._framework.widget.toolbar;


import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;


public class ToolbarLayout extends FrameLayout {

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

	}

}
