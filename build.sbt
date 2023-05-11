name         := "error-handling-streams"
organization := "com.niki"
version      := "0.0.1-SNAPSHOT"
scalaVersion := "2.13.10"
val AkkaVersion = "2.8.2"

Test / compile / scalacOptions -= "-Xfatal-warnings" // A bit too harsh for TDD

// Convenience for sbt console
// ...but leave consoleQuick as escape hatch if the build is broken!
console / initialCommands := "import com.niki.errorhandlingstreams._"
consoleQuick / initialCommands := ""

libraryDependencies ++= Seq(
  Dependencies.scalaTest % Test,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion
)
