/*
 * Copyright (c) 2020 Contributors as noted in the AUTHORS.md file
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package com.shapestone.catalog

import com.typesafe.config.ConfigFactory

object Main extends App {
  val cfg = ConfigFactory.load(getClass.getClassLoader)
  val ip = cfg.getString("service.ip")
  println(ip)
}
