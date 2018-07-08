name := """webservices"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  cache,
  ws,
  filters
)

routesGenerator := InjectedRoutesGenerator

/* Production Configs  */
javaOptions in Universal ++= Seq(
  // JVM memory tuning
  "-J-Xmx1024m",
  "-J-Xms512m",

  // Since play uses separate pidfile we have to provide it with a proper path
  // name of the pid file must be play.pid
  //s"-Dpidfile.path=${packageName.value}/play.pid",

  // alternative, you can remove the PID file
  // s"-Dpidfile.path=/dev/null",

  // Use separate configuration file for production environment
  //s"-Dconfig.file=conf/amazon.conf",

  // Use separate logger configuration file for production environment
  //s"-Dlogger.file=conf/prod-logback.xml",

  // You may also want to include this setting if you use play evolutions
  //"-DapplyEvolutions.default=true"

  //s"-Dhttp.port=9009",
  s"-Dplay.crypto.secret=`GW=Ymqm_JZcSV2o8l;[hFl]5ZIqm7O/AwAVl0eN3idJ>^YvRfJ`?Ux0w55oNsZa"
)

// Não gerar documentação
sources in (Compile, doc) := Seq.empty
publishArtifact in (Compile, packageDoc) := false
