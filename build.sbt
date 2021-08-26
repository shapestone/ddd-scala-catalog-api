ThisBuild / scalaVersion := "2.13.6"
ThisBuild / organization := "com.shapestone"

lazy val catalog = (project in file("."))
  .settings(
    name := "Server",
    libraryDependencies += "com.typesafe" % "config" % "1.4.1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % Test,
  )




//// *****************************************************************************
//// Projects
//// *****************************************************************************
//
//lazy val catalog =
//  project
//    .in(file("."))
//    .enablePlugins(AutomateHeaderPlugin)
//    .configs(IntegrationTest)
//    .settings(
//      name := "catalog-api"
//    )
//    .settings(settings)
//    .settings(
//      Defaults.itSettings,
//      headerSettings(IntegrationTest),
//      inConfig(IntegrationTest)(scalafmtSettings),
//      IntegrationTest / console / scalacOptions --= Seq(
//        "-Xfatal-warnings",
//        "-Ywarn-unused-import",
//        "-Ywarn-unused:implicits",
//        "-Ywarn-unused:imports",
//        "-Ywarn-unused:locals",
//        "-Ywarn-unused:params",
//        "-Ywarn-unused:patvars",
//        "-Ywarn-unused:privates"
//      ),
//      IntegrationTest / parallelExecution := false
//    )
//    .settings(
//      libraryDependencies ++= Seq(
//        library.scalaCheck        % IntegrationTest,
//        library.scalaCheck        % Test
//      )
//    )
//
//// *****************************************************************************
//// Library dependencies
//// *****************************************************************************
//
//lazy val library =
//  new {
//    object Version {
//      val scalaCheck      = "1.15.4"
//    }
//    val scalaCheck        = "org.scalacheck"              %% "scalacheck"               % Version.scalaCheck
//  }
//
//// *****************************************************************************
//// Settings
//// *****************************************************************************
//
//lazy val settings =
//  commonSettings ++
//  scalafmtSettings ++
//  scoverageSettings
//
//lazy val commonSettings =
//  Seq(
//    scalaVersion := "2.13.6",
//    organization := "com.shapestone",
//    organizationName := "Contributors as noted in the AUTHORS.md file",
//    startYear := Some(2020),
//    licenses += ("MPL-2.0", url("https://www.mozilla.org/en-US/MPL/2.0/")),
//    addCompilerPlugin("com.olegpy"    %% "better-monadic-for" % "0.3.1"),
//    addCompilerPlugin("org.typelevel" %% "kind-projector"     % "0.10.3"),
//    testFrameworks += new TestFramework("munit.Framework"),
//    Test / parallelExecution := false,
//    scalacOptions ++= Seq(
//      "-deprecation",
//      "-explaintypes",
//      "-feature",
//      "-language:higherKinds",
//      "-unchecked",
//      "-Xcheckinit",
//      //"-Xfatal-warnings", // Should be enabled if feasible.
//      "-Xlint:adapted-args",
//      "-Xlint:constant",
//      "-Xlint:delayedinit-select",
//      "-Xlint:doc-detached",
//      "-Xlint:inaccessible",
//      "-Xlint:infer-any",
//      "-Xlint:missing-interpolator",
//      "-Xlint:nullary-unit",
//      "-Xlint:option-implicit",
//      "-Xlint:package-object-classes",
//      "-Xlint:poly-implicit-overload",
//      "-Xlint:private-shadow",
//      "-Xlint:stars-align",
//      "-Xlint:type-parameter-shadow",
//      "-Yrangepos", // Needed to make `clue` work correctly (munit).
//      "-Ywarn-dead-code",
//      "-Ywarn-extra-implicit",
//      "-Ywarn-numeric-widen",
//      "-Ywarn-unused:implicits",
//      "-Ywarn-unused:imports",
//      "-Ywarn-unused:locals",
//      "-Ywarn-unused:params",
//      "-Ywarn-unused:patvars",
//      "-Ywarn-unused:privates",
//      "-Ywarn-value-discard",
//      "-Ycache-plugin-class-loader:last-modified",
//      "-Ycache-macro-class-loader:last-modified",
//    ),
//    Compile / console / scalacOptions --= Seq(
//      "-Xfatal-warnings",
//      "-Ywarn-unused-import",
//      "-Ywarn-unused:implicits",
//      "-Ywarn-unused:imports",
//      "-Ywarn-unused:locals",
//      "-Ywarn-unused:params",
//      "-Ywarn-unused:patvars",
//      "-Ywarn-unused:privates"
//    ),
//    Compile / compile / wartremoverWarnings ++= Warts.unsafe.filterNot(_ == Wart.Any), // Disable the "Any" wart due to too many false positives.
//    Test / console / scalacOptions --= Seq(
//      "-Xfatal-warnings",
//      "-Ywarn-unused-import",
//      "-Ywarn-unused:implicits",
//      "-Ywarn-unused:imports",
//      "-Ywarn-unused:locals",
//      "-Ywarn-unused:params",
//      "-Ywarn-unused:patvars",
//      "-Ywarn-unused:privates"
//    )
//)
//
//lazy val scalafmtSettings =
//  Seq(
//    scalafmtOnCompile := false,
//  )
//
//lazy val scoverageSettings =
//  Seq(
//    coverageMinimum := 60,
//    coverageFailOnMinimum := false,
//    coverageHighlighting := true
//  )
