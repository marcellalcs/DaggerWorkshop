package com.phellipesilva.daggerworkshop.dagger

import com.phellipesilva.daggerworkshop.view.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [Module::class])
interface Component {

    fun startInjection(mainActivity: MainActivity)
}