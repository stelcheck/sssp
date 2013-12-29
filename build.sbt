name := "sssp"

scalaVersion := "2.10.3"

version := "0.0-SNAPSHOT"

resolvers ++= Seq(
  "mesosphere"  at "http://downloads.mesosphere.io/maven",
  "jets3t"      at "http://www.jets3t.org/maven2"
)

libraryDependencies ++= Seq(
  "org.joda"            % "joda-convert"  % "1.5",
  "com.amazonaws"       % "aws-java-sdk"  % "1.6.2",
  "net.java.dev.jets3t" % "jets3t"        % "0.9.0",
  "org.apache.mesos"    % "mesos"         % "0.14.2",
  "mesosphere"          % "mesos-utils"   % "0.0.6"
)

unmanagedSourceDirectories in Compile +=
  (baseDirectory.value / "src/main/scala")

unmanagedSourceDirectories in Test +=
  (baseDirectory.value / "src/main/scala")

play.Project.playScalaSettings
