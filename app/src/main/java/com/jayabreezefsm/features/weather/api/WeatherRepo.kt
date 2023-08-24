package com.jayabreezefsm.features.weather.api

import com.jayabreezefsm.base.BaseResponse
import com.jayabreezefsm.features.task.api.TaskApi
import com.jayabreezefsm.features.task.model.AddTaskInputModel
import com.jayabreezefsm.features.weather.model.ForeCastAPIResponse
import com.jayabreezefsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}