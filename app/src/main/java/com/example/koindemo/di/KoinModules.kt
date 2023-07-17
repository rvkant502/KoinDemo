package com.example.koindemo.di

import com.example.koindemo.KoinViewModel
import com.example.koindemo.data.db.KoinLocalDAO
import com.example.koindemo.data.local.KoinLocalDataSource
import com.example.koindemo.data.remote.KoinRemoteDataSource
import com.example.koindemo.data.repo.KoinRepo
import com.example.koindemo.data.retrofit.KoinRetrofit
import com.example.koindemo.domain.KoinUseCase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModelModule: Module = module {
    viewModel { KoinViewModel(koinUseCase = get()) }
}

val useCaseModule: Module = module {
    factory { KoinUseCase(koinRepo = get()) }
}

val repoModule: Module = module {
    single { KoinRepo(koinLocalDataSource = get(), koinRemoteDataSource = get()) }
}

val dataSourceModule: Module = module {
    single { KoinLocalDataSource(koinLocalDAO = get()) }
    single { KoinRemoteDataSource(koinRetrofit = get()) }
}

val networkModule: Module = module {
    single { KoinRetrofit() }
}

val localDBModule: Module = module {
    single { KoinLocalDAO() }
}