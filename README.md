Autor: Carlos Andres Garcia Grisales
Email: c.andres1349@gmail.com

Reto automatizaciones POM y Maven

- DESCRIPCION PROCESO
Este proyecto fue creado para realizar pruebas automatizadas con maven, POM, serenity. el proyecto cuenta con dos feautures así:
1. Agregar productos al carrito de compras: Se realizó el proceso enunciado abriendo la página web, luego seleccionado la categoría y un producto de dicha categoría estando en la page del producto se anexan los datos del despacho y se agrega el producto al carrito de compras y se valida que se muestre el mensaje de que se ha agregado exitosamente.

2. Servicios rest: Se inicia la página web y se procede a selecciona el tipo de servicio para este caso fue el POST, se diligencian las credenciales requeridas para generar el servicio y se envía la petición. Se compara que si el resultado fue 200 es decir exitoso el servicio los datos se enviaron correctamente.

- HERRAMIENTAS
El proyecto se construyó con Maven, Page Object Model, serenity.

- PROCESO
Se crearon los features utilizando el lenguaje Gherkin, se crearon los runners para generar los métodos que van en cada uno de los step, se creó un modelo de datos, se crearon las page donde mapeamos los xpath.

- REPORTE
Se generó el reporte con serenity corriendo los dos runners y por consola escribiendo "mvn verify"
