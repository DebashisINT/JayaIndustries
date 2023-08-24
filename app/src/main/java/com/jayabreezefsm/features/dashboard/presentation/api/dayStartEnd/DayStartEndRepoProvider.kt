package com.jayabreezefsm.features.dashboard.presentation.api.dayStartEnd

import com.jayabreezefsm.features.stockCompetetorStock.api.AddCompStockApi
import com.jayabreezefsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}