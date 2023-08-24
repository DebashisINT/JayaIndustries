package com.jayabreezefsm.features.orderList.model

import com.jayabreezefsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}