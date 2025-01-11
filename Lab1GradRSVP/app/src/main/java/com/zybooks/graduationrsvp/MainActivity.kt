package com.zybooks.graduationrsvp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zybooks.graduationrsvp.ui.theme.GraduationRSVPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GraduationRSVPTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GradScreen()
                }
            }
        }
    }
}

@Composable
fun GradScreen(modifier: Modifier = Modifier) {
    val padding = 50.dp
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.size(padding))
        Text(
            text = stringResource(R.string.graduation_announcement),
            fontSize = 50.sp,
            modifier = modifier,
            lineHeight = 50.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red,
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.size(padding))
        Image(
            painter = painterResource(R.drawable.grad_cap),
            contentDescription = stringResource(R.string.graduation_cap),
            alpha = 0.7f
        )
        Spacer(Modifier.size(padding))
        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Icon(Icons.Filled.Info, contentDescription = "Alert Symbol")
            Text(
                text = "May 14 - Ganus Hall - 2:00 pm"
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun GradPreview() {
    GraduationRSVPTheme {
        GradScreen()
    }
}