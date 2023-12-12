name := "symbol-idea-plugin"
version := "1.12.0"
scalaVersion := "3.1.3"
scalacOptions := Seq("-new-syntax")
idePackagePrefix := Some("com.github.teinnsei.plugin.symbol")
intellijPluginName := "Spec &amp; Math symbols"
intellijBuild := "233.11799.241"
intellijPlatform := IntelliJPlatform.IdeaCommunity
libraryDependencies += "com.github.javafaker" % "javafaker" % "1.0.2"
libraryDependencies += "org.scala-lang" % "scala-library" % "2.13.10"
patchPluginXml := pluginXmlOptions { xml =>
  xml.version = version.value
  xml.sinceBuild = "233"
  xml.untilBuild = "233.*"
  xml.pluginDescription = IO.read(baseDirectory.value / "notes" / "pluginDescription.html")
  xml.changeNotes = IO.read(baseDirectory.value / "notes" / "pluginChanges.html")
}
enablePlugins(SbtIdeaPlugin)
