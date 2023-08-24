package com.jayabreezefsm.features.viewAllOrder.interf

import com.jayabreezefsm.app.domain.NewOrderGenderEntity
import com.jayabreezefsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}