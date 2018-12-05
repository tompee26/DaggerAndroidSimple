package com.example.tompee.daggerandroidsample.feature

import android.support.v4.app.FragmentManager
import com.example.tompee.daggerandroidsample.di.scopes.MainActivityScope
import com.example.tompee.daggerandroidsample.feature.fragment.MainFragment
import com.example.tompee.daggerandroidsample.feature.fragment.MainFragmentModule
import com.example.tompee.daggerandroidsample.model.Warrior
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module(includes = [MainActivityModule.FragmentBindings::class])
class MainActivityModule {
    @Module
    interface FragmentBindings {
        @ContributesAndroidInjector(modules = [MainFragmentModule::class])
        fun bindMainFragment(): MainFragment
    }

    @Provides
    @MainActivityScope
    fun provideWarrior(): Warrior = Warrior("Hercules", "Sword")

    @Provides
    @MainActivityScope
    fun provideActivity(mainActivity: MainActivity): MainActivity = mainActivity

    @Provides
    @MainActivityScope
    fun provideFragmentManager(mainActivity: MainActivity): FragmentManager = mainActivity.supportFragmentManager
}

