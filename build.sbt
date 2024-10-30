ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "CryptoTaxCalculator",
    libraryDependencies ++= Seq(
        "com.github.tototoshi" %% "scala-csv" % "1.3.10",
        "com.fasterxml.jackson.core" % "jackson-databind" % "2.8.2",
        "com.fasterxml.jackson.dataformat" % "jackson-dataformat-csv" % "2.8.2",
        "com.typesafe.play" %% "play-json" % "2.8.2",
        "org.json4s" %% "json4s-native" % "4.0.7",
        "org.json4s" %% "json4s-jackson" % "4.0.7",
    )


)
