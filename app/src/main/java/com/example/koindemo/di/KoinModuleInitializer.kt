package com.example.koindemo.di

import org.koin.core.context.loadKoinModules

object KoinModuleInitializer {
    fun init() = loadKoinModules(
        listOf(
            viewModelModule,
            useCaseModule,
            repoModule,
            dataSourceModule,
            networkModule,
            localDBModule
        )
    )
}