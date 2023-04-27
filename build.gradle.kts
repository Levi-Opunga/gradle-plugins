plugins {
    id("application")
    id("my-plugin")
}
buildscript {
dependencies{

}
}

var fromethere = "hello creap"



versions{
    compose_version.set(fromethere)
}

group = "org.example"
version = "1.0-SNAPSHOT"
application.mainClass.set("org.example.AppKt")

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.example.AppKt"
    }
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE

    from({
        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
    })
}

tasks.named<TaskReportTask>("tasks") {
    group = "Application"
    // displayGroup = "Application"
}

tasks.register<Zip>("zipApp") {
    group = "Packaging"
    archiveFileName.set("myApplication.zip")
    destinationDirectory.set(layout.buildDirectory.dir("dist"))

    from(layout.projectDirectory.file("run.sh") )
    from(tasks.jar) {
        into("libs" )
        println("hello java developers")
    }



}

//gradle.taskGraph.whenReady {
//    val task = this.allTasks.find { it.name.endsWith(".main()") } as? JavaExec // or whatever other method your Main class runs
//    task?.let {
//        it.setExecutable(it.javaLauncher.get().executablePath.asFile.absolutePath)
//    }
//}