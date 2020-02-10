package com.phellipesilva.daggerworkshop.dagger

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [Module::class, MainActivityModule::class])
interface Component {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun addContext(context: Context): Builder

        fun build(): com.phellipesilva.daggerworkshop.dagger.Component
    }

    fun getMainActivityComponentFactory(): MainActivityComponent.Factory

//    fun startInjection(mainActivity: MainActivity)
//    fun plusMainActivityModule(mainActivityModule: MainActivityModule): MainActivityComponent
}