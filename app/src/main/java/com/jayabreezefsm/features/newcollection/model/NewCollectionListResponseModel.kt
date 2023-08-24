package com.jayabreezefsm.features.newcollection.model

import com.jayabreezefsm.app.domain.CollectionDetailsEntity
import com.jayabreezefsm.base.BaseResponse
import com.jayabreezefsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}