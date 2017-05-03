package com.cgwx.yyfwptz.lixiang.testtodo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by yyfwptz on 2017/5/2.
 */

public class TaskFragment extends Fragment implements TaskContract.View {
    private TaskContract.Presenter presenter;
    TextView textView;

    public void setPresenter(TaskContract.Presenter presenter) {
        this.presenter = presenter;
    }

    public static TaskFragment newInstance() {
        return new TaskFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        Button button = (Button) view.findViewById(R.id.button);
        textView = (TextView) view.findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.start();
            }
        });
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void setText(String string) {
        textView.setText(string);
    }
}
