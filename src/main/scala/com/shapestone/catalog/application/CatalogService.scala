package com.shapestone.catalog.application

import com.shapestone.catalog.domain.model.{Catalog, CatalogItem}

object CatalogService {

  def createCatalog(catalog: Catalog): Unit = ???

  def getCatalog: Catalog = ???

  def updateCatalog(catalog: Catalog): Unit = ???

  def removeCatalog(catalogId: String): Unit = ???

  def addCatalogItem(catalogId: String, item: CatalogItem): Unit = ???

  def getCatalogItem(catalogId: String, item: CatalogItem): CatalogItem = ???

  def updateCatalogItem(catalogId: String, itemId: String): Unit = ???

  def removeCatalogItem(catalogId: String, itemId: String): Unit = ???
}
