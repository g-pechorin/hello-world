name := "hello-world"
organization := "com.peterlavalle"
version := "1.0.0"

scalaVersion := "2.10.6"

publishTo := Some(
  Resolver.file(
    "file",
    new File(
      Path.userHome.absolutePath + "/Dropbox/Public/posted"
    )
  )
)
