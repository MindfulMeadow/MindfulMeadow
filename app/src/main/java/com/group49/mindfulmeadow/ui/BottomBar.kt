package com.group49.mindfulmeadow.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.group49.mindfulmeadow.R

@Composable
fun BottomBar(selected: Int, onSelectedChanged: (Int) -> Unit) {
    Row {
        TabItem(
            if (selected == 0) R.drawable.baseline_grass_24_green else R.drawable.baseline_grass_24_white,
            "Home",
            if (selected == 0) Color.Green else Color.Black,
            Modifier
                .weight(1f)
                .clickable {
                    onSelectedChanged(0)
                })
        TabItem(
            if (selected == 1) R.drawable.baseline_history_24_green else R.drawable.baseline_history_24_white,
            "History",
            if (selected == 1) Color.Green else Color.Black,
            Modifier
                .weight(1f)
                .clickable {
                    onSelectedChanged(1)
                })
        TabItem(
            if (selected == 2) R.drawable.baseline_calendar_month_24_green else R.drawable.baseline_calendar_month_24_white,
            "Graph",
            if (selected == 2) Color.Green else Color.Black,
            Modifier
                .weight(1f)
                .clickable {
                    onSelectedChanged(2)
                })
        TabItem(
            if (selected == 3) R.drawable.baseline_analytics_24_green else R.drawable.baseline_analytics_24_white,
            "Analysis",
            if (selected == 3) Color.Green else Color.Black,
            Modifier
                .weight(1f)
                .clickable {
                    onSelectedChanged(3)
                })
    }
}

@Composable
fun TabItem(@DrawableRes iconId: Int, title : String, tint: Color, modifier: Modifier = Modifier) {
    Column(
        modifier.padding(vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            painterResource(iconId),
            contentDescription = title,
            tint = tint)
        Text(text = title,
            fontSize = 11.sp,
            color = tint)
    }
}

@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    var selectedTab by remember { mutableIntStateOf(0) }
    BottomBar(selectedTab) {selectedTab = it}
}

@Preview(showBackground = true)
@Composable
fun TabItemPreview() {
    TabItem(iconId = R.drawable.baseline_grass_24_white ,title = "Home", Color.Green)
}