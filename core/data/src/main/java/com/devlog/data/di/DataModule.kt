package com.devlog.data.di

import com.devlog.data.repository.Repository
import com.devlog.data.repository.RepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract interface DataModule {

    @Binds
    abstract  fun bindsRepository(
        repository: RepositoryImpl
    ): Repository
}