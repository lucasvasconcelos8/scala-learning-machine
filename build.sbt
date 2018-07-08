lazy val root = (project in file(".")).
  settings(
    inThisBuild(Common.settings),
    name := "scala-learning-machine",
    version := "1.0-SNAPSHOT"
  )
  .aggregate(commons, daos, services, webservices)

resolvers += Resolver.sonatypeRepo("snapshots")

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.11.12", "2.12.6")

libraryDependencies += guice


lazy val commons = (project in file("commons"))
  .settings(Common.settings)

lazy val daos = (project in file("daos"))
  .enablePlugins(PlayScala)
  .settings(Common.settings)
  .dependsOn(commons)

lazy val services = (project in file("services"))
  .settings(Common.settings)
  .enablePlugins(PlayScala)
  .dependsOn(daos, commons)

lazy val webservices = (project in file("webservices"))
  .enablePlugins(PlayScala)
  .settings(Common.settings)
  .dependsOn(commons, daos, services)