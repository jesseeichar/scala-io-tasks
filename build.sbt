scalaVersion := "2.10.0-RC1"

resolvers += "staging" at "https://oss.sonatype.org/content/repositories/comgithubscala-incubator-162/"

libraryDependencies ++= Seq("com.github.scala-incubator.io" % "scala-io-file_2.10.0-RC1" % "0.4.1" )