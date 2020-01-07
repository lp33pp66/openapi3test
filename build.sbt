val circeVersion = "0.12.1"
lazy val root = (project in file("."))
  .settings(
    name := "openapi3test",
    version := "0.1",
    scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http" % "10.1.8",
      "com.typesafe.akka" %% "akka-stream" % "2.5.23",
      "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.9",
      // JSON serialization library
      "io.circe" %% "circe-core" % circeVersion,
      "io.circe" %% "circe-generic" % circeVersion,
      "io.circe" %% "circe-parser" % circeVersion,

      "com.typesafe.slick" %% "slick" % "3.3.2",
      "org.slf4j" % "slf4j-nop" % "1.7.26",
      "com.typesafe.slick" %% "slick-hikaricp" % "3.3.2",
      "com.h2database" % "h2" % "1.4.199",
      "de.heikoseeberger" %% "akka-http-circe" % "1.29.1",
      "com.pauldijou" %% "jwt-core" % "4.1.0",

      "org.scalatest" %% "scalatest" % "3.0.8" % "test",
      "org.mockito" %% "mockito-scala-scalatest" % "1.7.0" % "test",
      "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.25",
      "com.typesafe.akka" %% "akka-http-testkit" % "10.1.10",
      "org.typelevel" %% "cats-core" % "2.0.0",
      "org.openapi4j" % "openapi-parser" % "0.5",
      "org.openapi4j" % "openapi-schema-validator" % "0.5",
      "org.openapi4j" % "openapi-operation-validator" % "0.5",
      "org.apache.logging.log4j" % "log4j-api" % "2.13.0",
      "org.apache.logging.log4j" % "log4j-core" % "2.13.0",
      "ch.qos.logback" % "logback-classic" % "1.1.0",
    )
  )
