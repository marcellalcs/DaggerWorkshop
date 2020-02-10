package com.phellipesilva.daggerworkshop.dagger

import android.content.Context
import androidx.core.content.pm.PermissionInfoCompat
import androidx.room.Room
import androidx.room.RoomDatabase
import com.phellipesilva.daggerworkshop.database.UserDAO
import com.phellipesilva.daggerworkshop.database.UserDatabase
import com.phellipesilva.daggerworkshop.service.MainService
import com.phellipesilva.daggerworkshop.view.MainActivity
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import javax.inject.Singleton

@Module
class Module {

    @Provides
    fun providesExecutor(): Executor = Executors.newSingleThreadExecutor()

    @Singleton
    @Provides
    fun providesRoomDataBase(context: Context): UserDatabase =
        Room.databaseBuilder(context, UserDatabase::class.java, "UserDatabase").build()

    @Provides
    fun providesUserDao(userDatabase: UserDatabase): UserDAO = userDatabase.getUserDAO()

    @Provides
    fun providesMainService(): MainService = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(MainService::class.java)
}