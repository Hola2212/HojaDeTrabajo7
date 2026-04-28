# Traductor Inglés → Español con Árbol Binario

Este proyecto implementa un traductor básico de inglés a español utilizando un **árbol binario de búsqueda (BST)** como estructura principal para almacenar el diccionario.

---

## Descripción del proyecto

El programa realiza los siguientes pasos:

1. 📖 Lee un archivo de diccionario (`diccionario.txt`)
2. 🌳 Inserta las palabras en un árbol binario (`Arbol`)
3. 📄 Lee un archivo de texto en inglés (`texto.txt`)
4. 🔄 Traduce palabra por palabra usando el árbol
5. 💾 Escribe el resultado en `resultado.txt`

---

## 🧠 Estructura del proyecto

* `Arbol.java` → Implementación del árbol binario de búsqueda
* `Node.java` → Nodo del árbol
* `Association.java` → Relación inglés-español
* `Translator.java` → Lógica de traducción
* `FileReaderUtil.java` → Lectura de archivos
* `FileWritter.java` → Escritura de archivos
* `Main.java` → Ejecución principal del programa

---

## 🧪 Tests

Se implementaron pruebas unitarias utilizando **JUnit 5** para validar:

* Inserción y búsqueda en el árbol
* Comparación de asociaciones
* Traducción de texto
* Lectura y escritura de archivos

---

## ⚠️ Consideraciones importantes

### 📂 Rutas de archivos (posibles fallos)

El proyecto utiliza rutas **fijas** para acceder a los archivos:

```
src/diccionario.txt
src/texto.txt
src/resultado.txt
```

Esto puede causar errores si:

* Se ejecuta el programa desde otra ubicación
* La estructura del proyecto cambia
* Se exporta el proyecto a otro entorno

**Nota:** El direccionamiento de los archivos `.txt` se realizó de forma fija y no dinámica, por lo que puede fallar dependiendo del entorno de ejecución.

**Recomendación:**
Implementar rutas dinámicas o usar recursos del proyecto (`resources`) para evitar estos problemas.

---

## Posibles mejoras

* Manejo más robusto de errores
* Soporte para rutas dinámicas de archivos
* Interfaz de usuario (CLI o GUI)

---

## ▶️ Cómo ejecutar

1. Asegúrate de tener los archivos:

   * `diccionario.txt`
   * `texto.txt`

2. Ejecuta la clase `Main`

3. El resultado se generará en:

```
src/resultado.txt
```

---

## Autor

**Juan Pablo Flores**\
Carnet: 25454\
Universidad del Valle de Guatemala (UVG)\
