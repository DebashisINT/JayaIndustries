package com.jayabreezefsm.features.location.api

import com.jayabreezefsm.features.location.shopdurationapi.ShopDurationApi
import com.jayabreezefsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}