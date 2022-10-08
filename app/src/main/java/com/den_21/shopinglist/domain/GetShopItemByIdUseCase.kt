package com.den_21.shopinglist.domain

class GetShopItemByIdUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItemById(id: Int) {
        shopListRepository.getShopItemById(id)
    }
}