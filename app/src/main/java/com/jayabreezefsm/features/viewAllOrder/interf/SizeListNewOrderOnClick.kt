package com.jayabreezefsm.features.viewAllOrder.interf

import com.jayabreezefsm.app.domain.NewOrderProductEntity
import com.jayabreezefsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}