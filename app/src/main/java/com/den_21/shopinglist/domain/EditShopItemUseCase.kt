package com.den_21.shopinglist.domain

class EditShopItemUseCase(private val shopListRepository:ShopListRepository) {

    fun editListItem(shopItem: ShopItem){
        shopListRepository.editShopItem(shopItem)
    }
}