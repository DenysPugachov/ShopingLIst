package com.den_21.shopinglist.domain

interface ShopListRepository {

    fun addListItem(listItem: ShopItem)

    fun editListItem(listItem: ShopItem)

    fun deleteListItem(listItem: ShopItem)

    fun getListItem(): List<ShopItem>

    fun getListItemById(id: Int): ShopItem

}

//TODO: connect this interface with UseCaseClasses