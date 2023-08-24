package com.jayabreezefsm.features.location.shopRevisitStatus

import com.jayabreezefsm.base.BaseResponse
import com.jayabreezefsm.features.location.model.ShopDurationRequest
import com.jayabreezefsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}