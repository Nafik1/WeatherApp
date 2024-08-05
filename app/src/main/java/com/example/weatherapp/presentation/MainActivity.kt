package com.example.weatherapp.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.weatherapp.data.network.api.ApiFactory
import com.example.weatherapp.presentation.ui.theme.WeatherAppTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Dispatcher

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val api = ApiFactory.apiservice

        CoroutineScope(Dispatchers.Main).launch {
            val currentWeather = api.loadCurrentWeather("London")
            val forecast = api.loadForecast("London")
            val cities = api.searchCity("London")
            Log.d("mainAjasdjas",currentWeather.toString())
            Log.d("mainAjasdjas",forecast.toString())
            Log.d("mainAjasdjas",cities.toString())
        }

        setContent {
            WeatherAppTheme {

            }
        }
    }
}
