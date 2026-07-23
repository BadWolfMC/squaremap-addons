plugins {
    id("net.kyori.indra")
}

indra {
    javaVersions {
        minimumToolchain(25)
        target(25)
    }
}

tasks {
    jar {
        manifest {
            attributes(
                "paperweight-mappings-namespace" to "mojang"
            )
        }
    }
}
