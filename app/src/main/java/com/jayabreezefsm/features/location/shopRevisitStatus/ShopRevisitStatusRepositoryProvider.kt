package com.jayabreezefsm.features.location.shopRevisitStatus

import com.jayabreezefsm.features.location.shopdurationapi.ShopDurationApi
import com.jayabreezefsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}