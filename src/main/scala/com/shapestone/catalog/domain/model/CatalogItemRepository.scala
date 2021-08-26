package com.shapestone.catalog.domain.model

trait CatalogItemRepository {

  def addCatalogItem(catalogId: String, item: CatalogItem): Unit

  def getCatalogItem(catalogId: String, item: CatalogItem): CatalogItem

  def updateCatalogItem(catalogId: String, itemId: String): Unit

  def removeCatalogItem(catalogId: String, itemId: String): Unit

  def nextCatalogItemId: String;
}
