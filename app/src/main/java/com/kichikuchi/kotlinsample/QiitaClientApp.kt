package com.kichikuchi.kotlinsample

/**
 * Created by KazunoriKikuchi on 2018/01/08.
 */

import android.app.Application
import com.kichikuchi.kotlinsample.dagger.AppComponent
import com.kichikuchi.kotlinsample.dagger.DaggerAppComponent

class QiitaClientApp: Application() {
    val component: AppComponent by lazy {
        DaggerAppComponent.create()
    }
}