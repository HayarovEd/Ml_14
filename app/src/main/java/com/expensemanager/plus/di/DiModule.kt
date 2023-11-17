package com.expensemanager.plus.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.expensemanager.plus.data.RepositoryAnalyticImpl
import com.expensemanager.plus.data.RepositoryServerImpl
import com.expensemanager.plus.data.ServiceImpl
import com.expensemanager.plus.data.SharedKeeperImpl
import com.expensemanager.plus.domain.RepositoryAnalytic
import com.expensemanager.plus.domain.RepositoryServer
import com.expensemanager.plus.domain.Service
import com.expensemanager.plus.domain.SharedKeeper
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class DiModule {

    @Binds
    @Singleton
    abstract fun bindService(service: ServiceImpl): Service

    @Binds
    @Singleton
    abstract fun bindKeeper(sharedKeeper: SharedKeeperImpl): SharedKeeper

    @Binds
    @Singleton
    abstract fun bindRepositoryAnalytic(repository: RepositoryAnalyticImpl): RepositoryAnalytic

    @Binds
    @Singleton
    abstract fun bindRepositoryServer(repository: RepositoryServerImpl): RepositoryServer

}