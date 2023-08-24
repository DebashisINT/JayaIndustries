package com.jayabreezefsm.features.viewAllOrder.interf

import com.jayabreezefsm.app.domain.NewOrderGenderEntity
import com.jayabreezefsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}