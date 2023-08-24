package com.jayabreezefsm.features.viewAllOrder.orderOptimized

import com.jayabreezefsm.app.domain.ProductOnlineRateTempEntity
import com.jayabreezefsm.base.BaseResponse
import com.jayabreezefsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}