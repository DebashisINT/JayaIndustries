package com.jayabreezefsm.features.weather.api

import com.jayabreezefsm.features.task.api.TaskApi
import com.jayabreezefsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}