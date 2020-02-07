package com.phellipesilva.daggerworkshop.navigation

import android.content.Context
import android.content.Intent
import com.phellipesilva.daggerworkshop.database.User
import com.phellipesilva.featuretwo.view.FeatureTwoActivity
import javax.inject.Inject

class Navigator @Inject constructor(private val context: Context) {

    fun navigateToFeatureTwo(id: Int, navigationId: Int) {
        val intent = Intent(context, FeatureTwoActivity::class.java)
        intent.putExtra("id", id)
        intent.putExtra("navigationId", navigationId)
        context.startActivity(intent)
    }
}