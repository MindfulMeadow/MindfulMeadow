package com.group49.mindfulmeadow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mindfulmeadow.R
import com.group49.mindfulmeadow.ui.theme.MindfulMeadowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MindfulMeadowTheme {
                Column {
                   // BottomBar()
                }
            }
        }
    }
}

@Composable
private fun BottomBar(selected: Int) {
    Row {
        TabItem(if (selected == 0) R.drawable.baseline_grass_24_green else R.drawable.baseline_grass_24_white, "Home", Modifier.weight(1f))
        TabItem(if (selected == 1) R.drawable.baseline_history_24_green else R.drawable.baseline_history_24_white, "History", Modifier.weight(1f))
        TabItem(if (selected == 2) R.drawable.baseline_calendar_month_24_green else R.drawable.baseline_calendar_month_24_white, "Graph", Modifier.weight(1f))
        TabItem(if (selected == 3) R.drawable.baseline_analytics_24_green else R.drawable.baseline_analytics_24_white, "Analysis", Modifier.weight(1f))
    }
}

@Composable
private fun TabItem(@DrawableRes iconId: Int, title : String, modifier: Modifier = Modifier) {
    Column(
        modifier.padding(vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(painterResource(iconId),
            contentDescription = title)
        Text(text = title,
            fontSize = 11.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    BottomBar(selected = 1)
}

@Preview(showBackground = true)
@Composable
fun TabItemPreview() {
    TabItem(iconId = R.drawable.baseline_grass_24_white, title = "Home")
}