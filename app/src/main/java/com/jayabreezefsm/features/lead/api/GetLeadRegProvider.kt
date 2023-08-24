package com.jayabreezefsm.features.lead.api

import com.jayabreezefsm.features.NewQuotation.api.GetQuotListRegRepository
import com.jayabreezefsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}