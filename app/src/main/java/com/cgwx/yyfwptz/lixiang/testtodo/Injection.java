/*
 * Copyright (C) 2015 The Android Open Source Project
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

package com.cgwx.yyfwptz.lixiang.testtodo;

import android.content.Context;
import android.support.annotation.NonNull;

import com.cgwx.yyfwptz.lixiang.testtodo.data.TaskDataSource;
import com.cgwx.yyfwptz.lixiang.testtodo.data.TaskLocalDataSource;
import static com.cgwx.yyfwptz.lixiang.testtodo.ActivityUtils.checkNotNull;

/**
 * Enables injection of mock implementations for
 * {@link TaskDataSource} at compile time. This is useful for testing, since it allows us to use
 * a fake instance of the class to isolate the dependencies and run a test hermetically.
 */
public class Injection {

    public static TaskRepository provideTasksRepository(@NonNull Context context) {
        checkNotNull(context);
        return TaskRepository.getInstance(TaskLocalDataSource.getInstance(context));
    }
}