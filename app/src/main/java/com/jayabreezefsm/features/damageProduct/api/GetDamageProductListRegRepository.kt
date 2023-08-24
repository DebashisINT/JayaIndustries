package com.jayabreezefsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.jayabreezefsm.app.FileUtils
import com.jayabreezefsm.base.BaseResponse
import com.jayabreezefsm.features.NewQuotation.model.*
import com.jayabreezefsm.features.addshop.model.AddShopRequestData
import com.jayabreezefsm.features.addshop.model.AddShopResponse
import com.jayabreezefsm.features.damageProduct.model.DamageProductResponseModel
import com.jayabreezefsm.features.damageProduct.model.delBreakageReq
import com.jayabreezefsm.features.damageProduct.model.viewAllBreakageReq
import com.jayabreezefsm.features.login.model.userconfig.UserConfigResponseModel
import com.jayabreezefsm.features.myjobs.model.WIPImageSubmit
import com.jayabreezefsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}