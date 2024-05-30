package com.group49.mindfulmeadow.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
//import androidx.compose.material.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.group49.mindfulmeadow.R

@Composable
// fun HomePage(navController: NavHostController) {
fun HomePage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "MindfulMeadow",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = "Welcome, Steven!",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 32.dp)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            // Image
            Image(
                painter = painterResource(id = R.drawable.meadow),
                contentDescription = null, // Provide content description if necessary
                modifier = Modifier.fillMaxWidth(fraction = 0.5f) // Image takes half the width of the page
                    .aspectRatio(1f) // Maintain aspect ratio
            )

            // Column
            Column(
                modifier = Modifier
                    .padding(start = 16.dp) // Add padding to separate from the image
                    .weight(1f) // Occupy remaining space in the row
            ) {
                // Text
                Text(
                    text = "Your meadow is flourishing!",
                    modifier = Modifier.padding(bottom = 8.dp) // Add padding to bottom
                )

                // Button
                Button(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth() // Button takes full width of the column
                ) {
                    Text(text = "What is this?")
                }
            }
        }


        Button(
            onClick = { /* Implement navigation to logging page */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Start a log")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomePagePreview() {
    val navController = rememberNavController()
    HomePage()
//    HomePage(navController)
}