package com.kichikuchi.kotlinsample.dagger

/**
 * Created by KazunoriKikuchi on 2018/01/08.
 */

import dagger.Component
import com.kichikuchi.kotlinsample.MainActivity
import javax.inject.Singleton

@Component(modules = arrayOf(ClientModule::class))
@Singleton
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}