package com.jayabreezefsm.features.nearbyuserlist.api

import com.jayabreezefsm.app.Pref
import com.jayabreezefsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.jayabreezefsm.features.newcollection.model.NewCollectionListResponseModel
import com.jayabreezefsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}