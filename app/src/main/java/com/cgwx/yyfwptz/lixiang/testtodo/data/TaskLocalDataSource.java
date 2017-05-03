/*
 * Copyright 2016, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cgwx.yyfwptz.lixiang.testtodo.data;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * Main entry point for accessing tasks data.
 * <p>
 * For simplicity, only getTasks() and getTask() have callbacks. Consider adding callbacks to other
 * methods to inform the user of network/database errors or successful operations.
 * For example, when a new task is created, it's synchronously stored in cache but usually every
 * operation on database or network should be executed in a different thread.
 */
public class TaskLocalDataSource implements TaskDataSource{
    private static TaskLocalDataSource taskLocalDataSource;
//    @Override
//    public void getData(@NonNull String id, @NonNull TaskDataSource.GetDataCallBack callBack) {
//        String string = "finally done";
//        if (string != null){
//            callBack.success(string);
//        }
//    }

    public static TaskLocalDataSource getInstance(@NonNull Context context){
        if (taskLocalDataSource == null)
            taskLocalDataSource = new TaskLocalDataSource();
        return taskLocalDataSource;
    }

    @Override
    public void getData(@NonNull GetDataCallBack callBack) {
        String string = "fill";
        callBack.success(string);
    }
}
