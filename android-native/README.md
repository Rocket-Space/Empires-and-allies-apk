# Empires & Allies - Native Android (base inicial)

Este módulo crea una **base nativa Android** (Kotlin + Jetpack Compose) para comenzar la reimplementación del juego sin Termux ni navegador externo.

## Estado actual

- App Android nativa con pantalla de inicio.
- Carga de `initial-island.json` desde `assets`.
- Parseo de objetos del mapa (`id`, `itemName`, `position`).
- Renderizado en lista para validar que los datos históricos se pueden consumir desde Android.

## Qué sigue para acercarlo al original

1. Motor isométrico (tile map + z-order + colisiones).
2. Sistema de entidades (edificios, decoraciones, unidades, proyectiles).
3. Sincronización con backend compatible con `empires-server.py`.
4. UI equivalente al cliente original (misiones, inventario, tienda, combate).
5. Carga de assets (sprites/sheets) con pipeline propio para Android.

## Ejecución

```bash
cd android-native
./gradlew assembleDebug
```

> Si no existe `gradlew` en tu entorno, genera wrapper con Gradle local o importa la carpeta en Android Studio.
