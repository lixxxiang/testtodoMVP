package com.cgwx.yyfwptz.lixiang.testtodo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TaskActivity extends AppCompatActivity {

    private TaskPresenter taskPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TaskFragment taskFragment = (TaskFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (taskFragment == null) {
            taskFragment = TaskFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), taskFragment, R.id.contentFrame);
        }

        taskPresenter = new TaskPresenter(Injection.provideTasksRepository(getApplicationContext()), taskFragment);

    }
}
