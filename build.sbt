ThisBuild / scalaVersion := "2.13.6"
ThisBuild / organization := "com.shapestone"

lazy val catalog = (project in file("."))

ThisBuild / version      := "0.1.0"
ThisBuild / organization := "com.shapestone"
ThisBuild / description := "DDD Scala Template Project"

lazy val root = (project in file("."))
  .settings(
    name := "Server",
    libraryDependencies += "com.typesafe" % "config" % "1.4.1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % Test,
  )
