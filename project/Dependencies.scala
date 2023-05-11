import sbt._

object Dependencies {
  object Versions {
    val scalaTest = "3.2.15"
  }

  lazy val scalaTest = "org.scalatest" %% "scalatest" % Versions.scalaTest
}
