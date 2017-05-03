package com.cgwx.yyfwptz.lixiang.testtodo;

import android.support.annotation.NonNull;

import com.cgwx.yyfwptz.lixiang.testtodo.data.TaskDataSource;

/**
 * Created by yyfwptz on 2017/5/2.
 */

public class TaskRepository implements TaskDataSource{

    private final TaskDataSource data;
    private static TaskRepository taskRepository = null;

    public TaskRepository(TaskDataSource data) {
        this.data = data;
    }

    public static TaskRepository getInstance(TaskDataSource taskDataSource){
        if (taskRepository == null)
            taskRepository = new TaskRepository(taskDataSource);
        return taskRepository;
    }

    @Override
    public void getData(@NonNull final GetDataCallBack callBack) {
        data.getData(new GetDataCallBack() {
            @Override
            public void success(String string) {
                callBack.success(string);
            }

            @Override
            public void fail() {
                callBack.fail();
            }
        });

    }
}
