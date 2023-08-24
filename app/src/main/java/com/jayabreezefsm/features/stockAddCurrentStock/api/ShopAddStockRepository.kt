package com.jayabreezefsm.features.stockAddCurrentStock.api

import com.jayabreezefsm.base.BaseResponse
import com.jayabreezefsm.features.location.model.ShopRevisitStatusRequest
import com.jayabreezefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.jayabreezefsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.jayabreezefsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.jayabreezefsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}