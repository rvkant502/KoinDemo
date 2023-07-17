package com.example.koindemo

import androidx.lifecycle.ViewModel
import com.example.koindemo.domain.KoinUseCase

class KoinViewModel(private val koinUseCase: KoinUseCase): ViewModel() {
}