name := "symbol-idea-plugin"
version := "1.6.0"
scalaVersion := "3.0.0"
scalacOptions := Seq("-new-syntax", "-indent", "-explain")
resolvers += Resolver.url("jetbrains-sbt", url(s"https://dl.bintray.com/jetbrains/sbt-plugins"))(Resolver.ivyStylePatterns)
idePackagePrefix := Some("com.github.teinnsei.plugin.symbol")
intellijPluginName := "Spec &amp; Math symbols"
intellijBuild := "221.5080.210"
intellijPlatform := IntelliJPlatform.IdeaCommunity
libraryDependencies ++= Seq(
  "com.github.javafaker" % "javafaker"     % "1.0.2",
  "org.scala-lang"       % "scala-library" % "2.13.6"
)

patchPluginXml := pluginXmlOptions { xml =>
  xml.version = version.value
  xml.sinceBuild = "221"
  xml.untilBuild = "221.*"
  xml.pluginDescription = IO.read(baseDirectory.value / "notes" / "pluginDescription.html")
  xml.changeNotes = IO.read(baseDirectory.value / "notes" / "pluginChanges.html")
}
enablePlugins(SbtIdeaPlugin)
