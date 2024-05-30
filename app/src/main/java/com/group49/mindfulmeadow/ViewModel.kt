package com.group49.mindfulmeadow

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {
    var selectedTab by mutableIntStateOf(0) // selected
}