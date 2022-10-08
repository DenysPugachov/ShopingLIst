package com.den_21.shopinglist.domain

interface ShopListRepository {

    fun addShopItem(listItem: ShopItem)

    fun editShopItem(listItem: ShopItem)

    fun deleteShopItem(listItem: ShopItem)

    fun getShopItemById(id: Int): ShopItem

    fun getShopList():List<ShopItem>

}