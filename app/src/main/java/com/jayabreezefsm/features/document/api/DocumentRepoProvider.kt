package com.jayabreezefsm.features.document.api

import com.jayabreezefsm.features.dymanicSection.api.DynamicApi
import com.jayabreezefsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}