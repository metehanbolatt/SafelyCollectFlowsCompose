package com.metehanbolat.safelycollectflowscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.safelycollectflowscompose.ui.theme.SafelyCollectFlowsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SafelyCollectFlowsComposeTheme {

            }
        }
    }
}
