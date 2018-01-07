package com.kichikuchi.kotlinsample

import android.support.annotation.IdRes
import android.view.View

/**
 * Created by KazunoriKikuchi on 2018/01/07.
 */

fun <T: View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById<T>(id)
}
