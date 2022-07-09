package com.metehanbolat.safelycollectflowscompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.metehanbolat.safelycollectflowscompose.ui.theme.SafelyCollectFlowsComposeTheme

@ExperimentalLifecycleComposeApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SafelyCollectFlowsComposeTheme {
                MyScreen()
            }
        }
    }
}

@ExperimentalLifecycleComposeApi
@Composable
fun MyScreen(myViewModel: MyViewModel = viewModel()) {

    val lifeValue by myViewModel.myStateFlow.collectAsStateWithLifecycle()
    val value by myViewModel.myStateFlow.collectAsState()

    LaunchedEffect(key1 = value) {
        Log.d("MyScreen", "$value")
    }
}
