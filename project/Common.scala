import sbt._
import Keys._

object Common {
  val settings: Seq[Setting[_]] = Seq(
    scalaVersion := "2.12.6",
    libraryDependencies ++= commonDependencies
  )
  val scalaTestPlus = "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.1"
  val scaldiPlay = "org.scaldi" %% "scaldi" % "0.5.8"

  // All projects
  val commonDependencies = Seq(scaldiPlay)
  // SBT projects only
  //val commonSbtDependencies = Seq()
  // Play projects only
  //val commonPlayDependencies = Seq()

}
