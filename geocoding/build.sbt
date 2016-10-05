lazy val root = (project in file(".")).
  settings(
    organization := "com.graphhopper",
    name := "directions-api-java-client-geocoding",
    version := "0.8-SNAPSHOT",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.0",
      "com.squareup.okhttp" % "okhttp" % "2.4.0",
      "com.google.code.gson" % "gson" % "2.3.1",
      "com.brsanthu" % "migbase64" % "2.2",
      "junit" % "junit" % "4.8.1" % "test"
    )
  )
