plugins{
    id("java")
    id("org.jetbrains.kotlin.jvm")
}
var myVersions = extensions.create<My_versions_gradle.MyVersions>("versions")
myVersions.compose_version.convention("default")
tasks.register("dosome"){
    println(myVersions.compose_version.get())
}

java{
    toolchain.languageVersion.set(
        JavaLanguageVersion.of(17)
    )
}


