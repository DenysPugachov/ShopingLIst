package com.den_21.shopinglist.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addListItem(shopItem: ShopItem){
        shopListRepository.addShopItem(shopItem)
    }
}