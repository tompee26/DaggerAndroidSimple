package com.example.tompee.daggerandroidsample.feature.fragment

import android.content.Context
import android.support.v4.app.Fragment
import android.util.Log
import com.example.tompee.daggerandroidsample.model.Hero
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class MainFragment : Fragment() {

    @Inject
    lateinit var hero : Hero

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
        Log.d("InjectionTest", hero.name)
    }
}