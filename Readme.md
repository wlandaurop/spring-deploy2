
## Despliege de apps Spring Boot en Heroku

Crear archivo `system.properties` en el proyecto con el contenido:

```
java.runtime.version=19
```


1. Crear cuenta en heroku.com y github.com
2. Tener configurado en git en el ordenador (ejecutar unicamente la primera vez que se instala Gib):
   1. `git config --global user.name "Wilfredo Landauro`
   2. `git config --global user.email wlandaurop@gmail.com`
3. Subir el proyecto a GitHub desde Intelligij IDEA desde la opción : VCS > Share project on GitHub
4. Desde Heroku, crear app y elegir método GitHub y  buscar el repositorio subido
5. Habilitar deploy automatico y ejecutar el Deploy

## Ejercicio 1
* Probar a empaquetar la aplicación con maven package desde Intelligij IDEA

* Desde terminal en Intelligij IDEA verificar que se ejecuta correctamente con el comando:

```
java -jar target/spring-deploy-1.0.jar
```

* Crear un perfil para dev y otro test con una propiedad nueva que carguemos en el controlador.

## Ejercicio 2

Desplegar el API REST de laptops en Heroku y verificar funcionamiento desde POSTMAN.

## Proveedores cloud

* Heroku -- Java, Spring, PostgreSQL
* Netlify -- Fronted (React, Angular...)
* Vercel -- Fronted (React, Angular...)