package com.jayabreezefsm.features.login.model.productlistmodel

import com.jayabreezefsm.app.domain.ModelEntity
import com.jayabreezefsm.app.domain.ProductListEntity
import com.jayabreezefsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}