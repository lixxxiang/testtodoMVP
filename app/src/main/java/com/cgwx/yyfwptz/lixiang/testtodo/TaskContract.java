package com.cgwx.yyfwptz.lixiang.testtodo;

/**
 * Created by yyfwptz on 2017/5/2.
 */

public interface TaskContract {
    interface View extends BaseView<Presenter>{
        void setText(String string);
    }


    interface Presenter extends BasePresenter{
        String showData();
        void loadData();
    }
}
