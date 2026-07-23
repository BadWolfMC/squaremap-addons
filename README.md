# BadWolfMC squaremap addons

This fork builds the two squaremap addons used by BadWolfMC against Paper 26.2 and Java 25.

## Built addons

- `squaremap-banners` — shows banner markers on squaremap in a similar way to vanilla maps.
- `squaremap-vanish` — hides vanished players from squaremap, with direct support for SuperVanish and PremiumVanish and a metadata-based compatibility fallback.

The upstream source directories for other addons remain in the repository for reference, but they are intentionally excluded from the Gradle project and are not built or maintained by this fork.

## Building from source

```bash
./gradlew clean build
```

Built plugin artifacts are written to `build/libs/`.

## Attribution

This repository is forked from [jpenilla/squaremap-addons](https://github.com/jpenilla/squaremap-addons).
The banners addon contains code derived from [Pl3xMap-Banners](https://github.com/granny/Pl3xMap-Banners).
