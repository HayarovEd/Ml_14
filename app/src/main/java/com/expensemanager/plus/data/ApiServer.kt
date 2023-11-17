package com.expensemanager.plus.data

import com.expensemanager.plus.domain.model.basedto.BaseDto
import retrofit2.http.GET

interface ApiServer {
    @GET ("530/db.json")
    suspend fun getDataDb () : BaseDto
}