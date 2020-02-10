package com.phellipesilva.daggerworkshop.dagger

import com.phellipesilva.daggerworkshop.view.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent
interface MainActivityComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance activity: MainActivity): MainActivityComponent
    }

    fun startInjection(mainActivity: MainActivity)
}