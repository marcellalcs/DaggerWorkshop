package com.phellipesilva.daggerworkshop.configs

import android.app.Activity
import android.app.Application
import com.phellipesilva.daggerworkshop.dagger.Component
import com.phellipesilva.daggerworkshop.dagger.DaggerComponent
import com.phellipesilva.daggerworkshop.dagger.Module

class AppApplication: Application() {

    val component: Component get() = DaggerComponent.builder()
        .module(Module(this))
        .build()
}

val Activity.injector get() =  (applicationContext as AppApplication).component