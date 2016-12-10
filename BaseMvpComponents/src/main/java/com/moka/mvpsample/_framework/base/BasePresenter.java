package com.moka.mvpsample._framework.base;


public class BasePresenter<VIEW extends BaseView> {

	private VIEW view;

	public void attachView(VIEW view) {
		this.view = view;
	}

	public void detachView() {
		view = null;
	}

	public boolean isAttached() {
		return null != view;
	}

}
