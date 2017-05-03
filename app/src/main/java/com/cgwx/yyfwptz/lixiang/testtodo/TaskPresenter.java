package com.cgwx.yyfwptz.lixiang.testtodo;

import android.support.annotation.NonNull;
import android.util.Log;

import com.cgwx.yyfwptz.lixiang.testtodo.data.TaskDataSource;

/**
 * Created by yyfwptz on 2017/5/2.
 */

public class TaskPresenter implements TaskContract.Presenter {
    private TaskRepository taskRepository;
    private TaskContract.View mainView;

    public TaskPresenter(@NonNull TaskRepository taskRepository, @NonNull TaskContract.View mainView) {

        this.mainView = mainView;
        this.taskRepository = taskRepository;
        mainView.setPresenter(this);
    }

    @Override
    public void start() {
        loadData();
    }


//    public String showData() {
//        Log.e("sd", "ss");
//        String id = "1";
//        taskRepository.getData(id, new TaskDataSource.GetDataCallBack() {
//            @Override
//            public void success(String string) {
//
//            }
//
//            @Override
//            public void fail() {
//
//            }
//        });
//        return null;
//    }

    @Override
    public String showData() {
        return null;
    }

    @Override
    public void loadData() {
        taskRepository.getData(new TaskDataSource.GetDataCallBack() {
            @Override
            public void success(String string) {
                Log.e("STRR", string);
                mainView.setText(string);
            }

            @Override
            public void fail() {

            }
        });
    }
}
