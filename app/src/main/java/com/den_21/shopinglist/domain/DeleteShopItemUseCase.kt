package com.den_21.shopinglist.domain

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository){

    fun deleteListItem(shopItem: ShopItem){
        shopListRepository.deleteShopItem(shopItem)
    }
}