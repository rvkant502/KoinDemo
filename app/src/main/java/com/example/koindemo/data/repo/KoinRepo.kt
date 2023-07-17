package com.example.koindemo.data.repo

import com.example.koindemo.data.local.KoinLocalDataSource
import com.example.koindemo.data.remote.KoinRemoteDataSource

class KoinRepo(
    private val koinLocalDataSource: KoinLocalDataSource,
    private val koinRemoteDataSource: KoinRemoteDataSource
) {

}