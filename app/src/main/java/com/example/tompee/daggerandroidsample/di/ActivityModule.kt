package com.example.tompee.daggerandroidsample.di

import com.example.tompee.daggerandroidsample.di.scopes.MainActivityScope
import com.example.tompee.daggerandroidsample.feature.MainActivity
import com.example.tompee.daggerandroidsample.feature.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module()
abstract class ActivityModule {
    @MainActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity
}