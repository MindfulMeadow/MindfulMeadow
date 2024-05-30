package com.group49.mindfulmeadow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.group49.mindfulmeadow.ui.AIAnalysis
import com.group49.mindfulmeadow.ui.BottomBar
import com.group49.mindfulmeadow.ui.HomePage
import com.group49.mindfulmeadow.ui.LogGraph
import com.group49.mindfulmeadow.ui.LogHistory
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
                    HorizontalPager(count = 4, Modifier.weight(1f)) { page ->
                        when (page) {
                            0 -> HomePage()
                            1 -> LogHistory()
                            2 -> LogGraph()
                            3 -> AIAnalysis()
                        }

                    }

                    BottomBar(viewModel.selectedTab) {
                        viewModel.selectedTab = it
                    }
                }
            }
        }
    }
}