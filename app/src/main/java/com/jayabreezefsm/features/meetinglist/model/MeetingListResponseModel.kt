package com.jayabreezefsm.features.meetinglist.model

import com.jayabreezefsm.base.BaseResponse
import com.jayabreezefsm.features.location.model.MeetingDurationDataModel
import java.io.Serializable

/**
 * Created by Saikat on 21-01-2020.
 */
class MeetingListResponseModel : BaseResponse(), Serializable {
    var meeting_list: ArrayList<MeetingDurationDataModel>? = null
}