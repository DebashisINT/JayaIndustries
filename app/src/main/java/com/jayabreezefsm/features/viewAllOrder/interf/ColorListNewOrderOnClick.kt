package com.jayabreezefsm.features.viewAllOrder.interf

import com.jayabreezefsm.app.domain.NewOrderColorEntity
import com.jayabreezefsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}