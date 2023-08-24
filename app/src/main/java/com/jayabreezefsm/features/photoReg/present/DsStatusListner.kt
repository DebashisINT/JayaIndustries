package com.jayabreezefsm.features.photoReg.present

import com.jayabreezefsm.app.domain.ProspectEntity
import com.jayabreezefsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}