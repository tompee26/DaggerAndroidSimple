package com.example.tompee.daggerandroidsample.feature.fragment

import com.example.tompee.daggerandroidsample.model.Hero
import dagger.Module
import dagger.Provides

@Module
class MainFragmentModule {
    @Provides
    fun provideHero(): Hero = Hero("Spiderman")
}