package com.den_21.shopinglist.data

import com.den_21.shopinglist.domain.ShopItem
import com.den_21.shopinglist.domain.ShopItem.Companion.UNDEFINED_ID
import com.den_21.shopinglist.domain.ShopListRepository

object ShopListRepositoryImpl: ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()

    private var shopItemId = 0

    override fun addShopItem(shopItem: ShopItem) {
        if(shopItem.id == UNDEFINED_ID) {
            shopItem.id = shopItemId++
        }
        shopList.add(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldShopItem = getShopItemById(shopItem.id)
        shopList.remove(oldShopItem)
//        shopList.removeAt(shopItem.id) // why not?
        addShopItem(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun getShopItemById(id: Int): ShopItem {
        return shopList.find{ id == it.id } ?: throw RuntimeException("Item with id: $id not found in DB.")
    }

    override fun getShopList(): List<ShopItem> {
        // return non mutable copy of the list
        return shopList.toList()
    }

}