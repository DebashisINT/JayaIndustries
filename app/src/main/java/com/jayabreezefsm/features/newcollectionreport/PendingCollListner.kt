package com.jayabreezefsm.features.newcollectionreport

import com.jayabreezefsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}