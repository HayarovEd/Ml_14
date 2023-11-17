package com.expensemanager.plus.domain

import com.expensemanager.plus.data.Resource
import com.expensemanager.plus.domain.model.basedto.BaseDto

interface RepositoryServer {
    suspend fun getDataDb() : Resource<BaseDto>
}