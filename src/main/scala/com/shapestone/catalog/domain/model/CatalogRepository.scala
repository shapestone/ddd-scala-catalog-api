package com.shapestone.catalog.domain.model

trait CatalogRepository {

  def createCatalog(catalog: Catalog): Unit

  def getCatalog: Catalog

  def updateCatalog(catalog: Catalog): Unit

  def removeCatalog(catalogId: String): Unit

  def nextCatalogId: String;
}
