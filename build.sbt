ThisBuild / scalaVersion := "2.13.6"
ThisBuild / organization := "com.shapestone"

ThisBuild / version      := "0.1.0"
ThisBuild / organization := "com.shapestone"
ThisBuild / description := "DDD Scala Template Project"

val TypeSafeVersion = "1.4.1"
val ScalaTestVersion = "3.2.9"

lazy val root = (project in file("."))
  .settings(
    name := "Main",
    libraryDependencies += "com.typesafe"  % "config"     % TypeSafeVersion,
    libraryDependencies += "org.scalatest" %% "scalatest" % ScalaTestVersion % Test,
  )

