scalaVersion := "2.11.0"

name := "TypeScript importer for Scala.js"

version := "0.1-SNAPSHOT"

mainClass := Some("org.scalajs.tools.tsimporter.Main")

libraryDependencies +=
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.1"

organization := "org.scalajs.tools"

scalacOptions ++= Seq(
    "-deprecation",
    "-unchecked",
    "-feature",
    "-encoding", "utf8"
)
