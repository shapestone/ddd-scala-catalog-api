/*
 * Copyright (c) 2021 Contributors as noted in the AUTHORS.md file
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package com.shapestone.catalog.config

import eu.timepit.refined.auto._
import com.typesafe.config.ConfigFactory
import munit._
import pureconfig._

class DatabaseConfigTest extends FunSuite {

  test("DatabaseConfig must load the default application.conf correctly") {
    val cfg = ConfigFactory.load(getClass().getClassLoader())
    ConfigSource.fromConfig(cfg).at(DatabaseConfig.CONFIG_KEY).load[DatabaseConfig] match {
      case Left(e)  => fail(e.toList.mkString(", "))
      case Right(_) => assert(true)
    }
  }

}
