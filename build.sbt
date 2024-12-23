name := "symbol-idea-plugin"
version := "1.15.0"
scalaVersion := "3.6.2"
scalacOptions := Seq("-new-syntax")
idePackagePrefix := Some("com.github.teinnsei.plugin.symbol")
intellijPluginName := "Spec &amp; Math symbols"
intellijBuild := "243.22562.218"
intellijPlatform := IntelliJPlatform.IdeaCommunity
libraryDependencies += "com.github.javafaker" % "javafaker" % "1.0.2"
libraryDependencies += "org.scala-lang" % "scala-library" % "2.13.15"
patchPluginXml := pluginXmlOptions { xml =>
  xml.version = version.value
  xml.sinceBuild = "243"
  xml.untilBuild = "243.*"
  xml.pluginDescription = IO.read(baseDirectory.value / "notes" / "pluginDescription.html")
  xml.changeNotes = IO.read(baseDirectory.value / "notes" / "pluginChanges.html")
}

enablePlugins(SbtIdeaPlugin)