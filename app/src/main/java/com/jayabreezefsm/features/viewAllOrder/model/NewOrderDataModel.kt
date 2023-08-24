package com.jayabreezefsm.features.viewAllOrder.model

import com.jayabreezefsm.app.domain.NewOrderColorEntity
import com.jayabreezefsm.app.domain.NewOrderGenderEntity
import com.jayabreezefsm.app.domain.NewOrderProductEntity
import com.jayabreezefsm.app.domain.NewOrderSizeEntity
import com.jayabreezefsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

