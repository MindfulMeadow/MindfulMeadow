package com.group49.mindfulmeadow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import com.group49.mindfulmeadow.ui.BottomBar
import com.group49.mindfulmeadow.ui.theme.MindfulMeadowTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MindfulMeadowTheme {
                Column {
                    val viewModel: ViewModel  = viewModel()
//                    HorizontalPager(count = 4) { page ->
//                        when (page) {
//                            0 -> Box(Modifier.fillMaxSize())
//                            1 -> Box(Modifier.fillMaxSize())
//                            2 -> Box(Modifier.fillMaxSize())
//                            3 -> Box(Modifier.fillMaxSize())
//                        }
//
//                    }

                    BottomBar(viewModel.selectedTab) {
                        viewModel.selectedTab = it
                    }
                }
            }
        }
    }
}