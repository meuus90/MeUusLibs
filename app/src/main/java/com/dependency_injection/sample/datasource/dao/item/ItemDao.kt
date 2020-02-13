/*
 * Copyright (C)  2020 Blue-Ocean
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dependency_injection.sample.datasource.dao.item

import androidx.room.Dao
import androidx.room.Query
import com.dependency_injection.sample.datasource.dao.BaseDao
import com.dependency_injection.sample.datasource.model.item.Item

@Dao
interface ItemDao : BaseDao<Item> {
    @Query("SELECT * FROM Items")
    fun getAssets(): List<Item>

    @Query("DELETE FROM Items")
    suspend fun clear()
}