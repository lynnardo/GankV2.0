package com.var.gankv.base;

/**
 * 作者: 李景龙
 * 日期: 2017/3/18
 */
public interface BasePresenter<T extends BaseView> {
    void attachView(T View);

    void detachView();
}
