package com.jayabreezefsm.features.viewAllOrder.interf

import com.jayabreezefsm.app.domain.NewOrderGenderEntity
import com.jayabreezefsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}