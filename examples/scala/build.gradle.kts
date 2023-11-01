@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  scala
  alias(libs.plugins.spotless)
}

java {
  sourceCompatibility = JavaVersion.VERSION_20
  targetCompatibility = JavaVersion.VERSION_20
  toolchain {
    languageVersion = JavaLanguageVersion.of(20)
  }
}

dependencies {
  implementation(projects.xefCore)
  implementation(projects.xefScala)
  implementation(projects.xefReasoning)
  implementation(projects.xefOpenai)
  implementation(libs.circe.parser)
  implementation(libs.scala.lang)
  implementation(libs.logback)
}

tasks.withType<Test>().configureEach {
  useJUnit()
}

tasks.withType<ScalaCompile> {
  scalaCompileOptions.additionalParameters = listOf("-Wunused:all", "-Wvalue-discard")
}

spotless {
  scala {
    scalafmt("3.7.3").configFile(".scalafmt.conf").scalaMajorVersion("2.13")
  }
}
