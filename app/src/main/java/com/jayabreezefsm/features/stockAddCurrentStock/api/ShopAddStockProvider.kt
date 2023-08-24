package com.jayabreezefsm.features.stockAddCurrentStock.api

import com.jayabreezefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.jayabreezefsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}