package com.example.shoppingmarket.repository

import androidx.lifecycle.LiveData
import com.example.shoppingmarket.data.local.ShoppingItem
import com.example.shoppingmarket.data.remote.responses.ImageResponse
import com.example.shoppingmarket.utils.Resource


interface ShoppingRepository {

    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>

}