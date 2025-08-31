# mi-primera-pagina
Ejercicio del taller

                                          1. ¿Qué es HTML y cuál es su función en la web
   
HTML, que significa HyperText Markup Language, es un lenguaje de marcado esencial para la creación de páginas web. Su función principal es estructurar el contenido de una página web, como los títulos, párrafos, listas, e imágenes.

Función en la web
La función de HTML en la web se puede resumir en los siguientes puntos:
Creación de la estructura: Define la estructura fundamental de la página, organizando el contenido de manera lógica y jerárquica.

Contenido semántico: Proporciona significado a las partes de un documento, lo que ayuda a los motores de búsqueda a entender de qué trata la página.

Enlace de recursos: Permite enlazar otros archivos, como hojas de estilo CSS para el diseño y scripts de JavaScript para la interactividad.
Mientras que HTML crea la estructura, otros lenguajes como CSS (Cascading Style Sheets) se encargan del estilo y la presentación (colores, fuentes, diseño) y JavaScript añade la interactividad y el comportamiento dinámico. Juntos, forman la base de casi todas las páginas web.


                                       2. ¿Que es una etiqueta HTML y menciona las etiquetas más comunes?

<html: Etiqueta raíz que envuelve todo el contenido de una página web.
   
<head: Contiene metadatos, como el título de la página, enlaces a hojas de estilo (CSS) y scripts (JavaScript). El contenido dentro de esta etiqueta no es visible para el usuario en la ventana del navegador.
   
<title: Define el título de la página que aparece en la pestaña del navegador.
   
<body: Contiene todo el contenido visible de la página, como texto, imágenes, enlaces y tablas.

<h1, <h2, <h3, <h4, <h5, <h6: Definen encabezados (títulos) con diferentes niveles de importancia, siendo <h1 el más importante.

<p: Representa un párrafo de texto.

<a: Crea un hipervínculo (enlace) que permite navegar a otra página o a un recurso externo.

<img: Inserta una imagen en la página.

ul y ol: Crean listas -- > ul es para listas no ordenadas (con viñetas) y ol es para listas ordenadas (numeradas).
	
<div: Es un contenedor genérico que se utiliza para agrupar contenido y aplicar estilos con CSS. Es una de las etiquetas más flexibles y comunes.

<strong: Indica que un texto es importante y, por lo general, lo muestra en negrita.

<em: Enfatiza un texto, generalmente mostrándolo en cursiva.
   
                              3. ¿Que es un atributo de una etiqueta HTML y menciona los más comunes?
atributo: Es el nombre del atributo (por ejemplo, href, src, alt, etc.).

valor: Es el valor que se asigna al atributo (por ejemplo, una URL, un texto, una clase CSS, etc.).

Atributos HTML más comunes:
id: El atributo id asigna un identificador único a un elemento. Es útil para hacer referencia a un elemento en JavaScript o para aplicar estilos CSS.

class: El atributo class asigna una o más clases a un elemento. Es útil para aplicar estilos CSS y para seleccionar elementos en JavaScript.

href: El atributo href especifica la URL de destino de un enlace <a> (hipervínculo).

src: El atributo src especifica la URL de una imagen, video o archivo multimedia en etiquetas como <img>, <video>, etc.

alt: El atributo alt proporciona un texto alternativo para una imagen en caso de que no se pueda mostrar.

style: El atributo style se utiliza para aplicar estilos CSS en línea directamente en un elemento.

target: El atributo target se usa con enlaces <a> para especificar dónde se debe abrir el enlace (por ejemplo, en la misma ventana o en una nueva).

name: El atributo name se utiliza para identificar el nombre de un elemento en formularios, como campos de texto, botones, etc.

type: El atributo type se utiliza para definir el tipo de un elemento <input>. Por ejemplo, puede ser un campo de texto, un botón, un correo electrónico, etc.

value: El atributo value se utiliza en formularios para especificar el valor predeterminado de un campo de entrada o el valor enviado cuando se envía el formulario.

                                             4. ¿Qué es CSS y cómo se utiliza para el diseño web?
   
CSS, que significa Hojas de Estilo en Cascada (Cascading Style Sheets), es un lenguaje de programación que se utiliza para definir el estilo y la presentación visual de una página web. Piénsalo como la "ropa" o la "decoración" de una página web, mientras que el HTML es el esqueleto o la estructura.CSS se puede aplicar de varias maneras a una página web, y se utiliza para diseñar el layout (diseño) y mejorar la experiencia visual del usuario. Se puede incluir directamente en el archivo HTML o en archivos separados.

                                         5. ¿Que es una propiedad en CSS y menciona las propiedades más comunes?
En CSS, una propiedad es un atributo que se utiliza para definir los estilos que deben aplicarse a un elemento HTML. Cada propiedad tiene un valor que especifica el comportamiento o estilo que se debe aplicar al elemento.

Selector: Especifica el elemento HTML al que se aplicarán los estilos.

Propiedad: Es el atributo de estilo que deseas aplicar (por ejemplo, color, font-size, margin).

*Propiedades CSS más comunes:
color: Define el color del texto.

background-color: Establece el color de fondo de un elemento.

font-family: Especifica la familia de la fuente que se va a usar, como Arial, Times New Roman, etc.

font-size: Controla el tamaño de la fuente.

text-align: Alinea el texto horizontalmente dentro de un elemento, pudiendo ser left, right, center o justify.

margin: Define el espacio exterior alrededor de un elemento. Puedes controlar los márgenes en los cuatro lados (margin-top, margin-bottom, margin-left, margin-right).

padding: Establece el espacio interior entre el contenido y el borde de un elemento. . Al igual que con el margen, puedes especificar cada lado por separado (padding-top, padding-bottom, etc.).
width y height: Definen el ancho y la altura de un elemento.

display: Controla cómo se muestra un elemento. Los valores más comunes son block (ocupa todo el ancho disponible), inline (ocupa solo el espacio que necesita) y flex (se usa para diseños flexibles con la propiedad Flexbox).

border: Permite definir el borde de un elemento, incluyendo su grosor, estilo y color.

                                              6. ¿Que es un selector en CSS y cuales tipos existen?
Un selector en CSS es un patrón que se utiliza para seleccionar y apuntar a los elementos HTML a los que deseas aplicar estilos. Es la parte más importante de una regla CSS, ya que sin él, el navegador no sabría qué elementos deben ser afectados por el código de estilo.

Una regla CSS completa consta de un selector y un bloque de declaración. El selector apunta al elemento, y el bloque de declaración contiene las propiedades y valores de estilo. Por ejemplo, en el código p { color: blue; }, p es el selector que apunta a todos los párrafos, y { color: blue; } es la declaración que les da un color azul.

Tipos de Selectores CSS
Selectores Básicos
Selector de Tipo (o de Elemento): Selecciona todos los elementos HTML de un tipo específico. Por ejemplo, h1 seleccionaría todos los encabezados de tipo <h1.

Selector de ID: Selecciona un único elemento basado en su atributo id. Se indica con el símbolo de almohadilla (#). Por ejemplo, #logo seleccionaría el elemento con id="logo".

Selector de Clase: Selecciona todos los elementos que tienen un atributo class específico. Se indica con un punto (.). Por ejemplo, .menu-item seleccionaría todos los elementos con la clase menu-item.

Selector Universal: Selecciona todos los elementos en la página. Se representa con un asterisco (*). Por ejemplo, * { margin: 0; } eliminaría el margen de todos los elementos.

Selectores Combinadores
Estos selectores combinan otros selectores para definir relaciones entre los elementos.

Selector Descendiente: Selecciona un elemento que es descendiente de otro (un hijo, un nieto, etc.). Se usa un espacio. Por ejemplo, ul li seleccionaría todos los <li que están dentro de un <ul.

Selector de Hijo Directo: Selecciona un elemento que es el hijo inmediato de otro. Se usa el símbolo de mayor que (>). Por ejemplo, div > p seleccionaría los párrafos que son hijos directos de un <div, pero no los párrafos que están anidados más profundamente.

Selector de Hermano Adyacente: Selecciona un elemento que es hermano de otro y que lo sigue inmediatamente. Se usa el signo más (+). Por ejemplo, h2 + p seleccionaría el primer párrafo que sigue inmediatamente a un encabezado <h2.

Selectores de Atributo
Estos selectores apuntan a elementos que tienen un atributo específico o un valor de atributo en particular. Se usan corchetes []. Por ejemplo, [href] seleccionaría todos los elementos que tienen el atributo href.

Pseudo-clases y Pseudo-elementos
Pseudo-clases: Seleccionan elementos basándose en un estado específico. Se indican con dos puntos (:). Por ejemplo, :hover selecciona un elemento cuando el usuario pasa el cursor sobre él. Otros ejemplos comunes son :active, :focus y :first-child.

Pseudo-elementos: Seleccionan y dan estilo a una parte específica de un elemento. Se indican con dos puntos dobles (::). Por ejemplo, ::first-line selecciona la primera línea de texto de un elemento, y ::before crea un "pseudo-elemento" antes del contenido de un elemento.


                                         7. ¿Qué es JavaScript y cómo añade la interactividad a las páginas web?
JavaScript es un lenguaje de programación que permite crear contenido dinámico, controlar la multimedia, animar imágenes y, en general, añadir interactividad a las páginas web. Mientras HTML y CSS se encargan de la estructura y el estilo de una página, JavaScript es el motor que le da vida y la hace responder a las acciones del usuario.

¿Cómo añade la interactividad?
JavaScript interactúa con el Modelo de Objeto de Documento (DOM), que es la representación de la estructura de una página web en un formato de árbol. Cuando el navegador carga una página, crea este modelo, y JavaScript puede acceder a él para modificar los elementos, sus atributos, y sus estilos. Esto es lo que permite que una página web haga lo siguiente:

Responder a eventos: JavaScript puede detectar acciones del usuario, como clics en botones, el movimiento del cursor, o el envío de formularios. Por ejemplo, al hacer clic en un botón, JavaScript puede ejecutar una función que cambie el texto de un párrafo, muestre una ventana emergente o cargue nuevos datos sin recargar la página completa. .

Validar formularios: Antes de que un formulario sea enviado, JavaScript puede verificar si los datos ingresados son válidos, como confirmar que un campo de correo electrónico tenga un formato correcto.

Crear efectos visuales y animaciones: Permite animar elementos, como hacer que un menú se deslice, o crear galerías de imágenes interactivas que cambian al hacer clic.

Manejar datos: JavaScript puede comunicarse con servidores para enviar y recibir información, lo que es fundamental para aplicaciones web modernas, como cargar publicaciones nuevas en redes sociales o mostrar resultados de búsqueda en tiempo real.

Manipular contenido dinámico: Puede crear nuevos elementos HTML, eliminar otros, o cambiar su contenido y estilos en cualquier momento, lo que permite que una página web se adapte dinámicamente según la interacción del usuario o la información que recibe.



                                           8. ¿Cuáles son los tipos de datos primitivos en Javascript?
Los tipos de datos primitivos son los que no son objetos y no tienen métodos. Son inmutables, lo que significa que una vez que se asigna un valor a una variable de tipo primitivo, ese valor no puede ser alterado directamente.

Tipos de Datos Primitivos
JavaScript tiene siete tipos de datos primitivos. A continuación, se describen con una breve explicación y ejemplos.

string: Representa datos de texto. Los strings se escriben entre comillas simples (' '), dobles (" ") o acentos graves (`). Por ejemplo, 'Hola mundo' o "JavaScript".

number: Representa tanto números enteros como de punto flotante. Los números en JavaScript no distinguen entre enteros y decimales. Por ejemplo, 10, 3.14 y -50.

boolean: Representa un valor lógico que puede ser true o false. Es fundamental para las estructuras de control de flujo como los condicionales (if). Por ejemplo, let esMayorDeEdad = true;.

undefined: Representa una variable que ha sido declarada pero a la que aún no se le ha asignado un valor. Es el valor por defecto de las variables que no se inicializan. Por ejemplo, let nombre; resulta en nombre siendo undefined.

null: Representa la ausencia intencional de cualquier valor de objeto o de un valor. Es un valor que se asigna explícitamente para indicar que una variable "no tiene valor". Por ejemplo, let objeto = null;.

symbol: Fue introducido en ECMAScript 2015 (ES6) y representa un valor único e inmutable. A menudo se usa para crear propiedades únicas en objetos que no colisionen con otras propiedades. Por ejemplo, const id = Symbol('id');.

bigint: También introducido en ES2020, se usa para representar números enteros que son demasiado grandes para ser manejados por el tipo number. Los valores bigint se crean añadiendo n al final de un número entero. Por ejemplo, 9007199254740991n.

                      9. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Javascript?
Las estructuras de control de flujo son herramientas en JavaScript que te permiten controlar la forma en que se ejecutan las sentencias de tu código, determinando si ciertas partes se ejecutan, se repiten o se omiten.

if: Es la estructura más básica. Evalúa una condición y, si es true, ejecuta el código dentro de las llaves {}.

else: Se utiliza junto a un if para definir un bloque de código que se ejecuta si la condición del if es false.

switch: Es una alternativa al if/else if cuando tienes múltiples condiciones que dependen del valor de una sola variable. Compara un valor de expresión con diferentes casos (case).

Los bucles ejecutan un bloque de código de forma repetitiva mientras se cumpla una condición.

for: Es ideal cuando sabes cuántas veces quieres que se ejecute el bucle. Tiene tres partes: la inicialización (ej. let i = 0), la condición de continuación (ej. i < 5), y la expresión de incremento (ej. i++).

while: Ejecuta un bloque de código mientras una condición sea true. La condición se evalúa antes de cada iteración.

do...while: Similar a while, pero garantiza que el bloque de código se ejecute al menos una vez, ya que la condición se evalúa al final de la iteración.

for...of: Se usa para iterar sobre los elementos de objetos iterables como arrays, strings o Mapas.


                              10. ¿Por qué es importante usar nombres significativos para variables y métodos?
Es crucial usar nombres significativos para variables y métodos en la programación porque hace que el código sea más legible, comprensible y fácil de mantener. Un código claro es más fácil de depurar, modificar y colaborar.

Beneficios Clave
Mejora la Legibilidad: Nombres como precioTotal o calcularPromedio son más claros que pt o calc_p. Un desarrollador que lea tu código no tendrá que adivinar su propósito.

Facilita el Mantenimiento: Si tienes que volver a un código que escribiste hace meses o si otro desarrollador tiene que modificarlo, los nombres descriptivos reducen drásticamente el tiempo necesario para entender la lógica y aplicar cambios.

Reduce los Errores: Cuando el propósito de una variable o función es obvio, es menos probable que se use de forma incorrecta. Esto previene bugs y fallos de lógica.

Mejora la Colaboración: En equipos de desarrollo, el código es un lenguaje compartido. Usar una convención de nombres clara asegura que todos los miembros del equipo entiendan el código y puedan trabajar juntos de manera eficiente.

Piénsalo como una historia. Si los personajes se llaman "C", "D" y "E", la trama será confusa. Pero si se llaman "Cliente", "Descuento" y "Empleado", la historia se entiende fácilmente. Lo mismo sucede con el código. Usar nombres que describan la función, el propósito y el valor de lo que representan es una de las mejores prácticas en el desarrollo de software.


                   11. ¿Qué es una variable de entorno y por qué son importantes para Javascript o la programación en general?
Una variable de entorno es un valor con nombre que existe fuera de un programa y que puede ser accedido por él. Piénsalas como configuraciones globales que el sistema operativo o el entorno de ejecución (como Node.js) pone a disposición de las aplicaciones.

Importancia en la Programación
Las variables de entorno son cruciales porque permiten a los programas configurarse dinámicamente sin necesidad de modificar su código fuente. Esto es especialmente importante para:

Seguridad: Puedes almacenar información sensible, como claves de API, contraseñas de bases de datos o tokens, en variables de entorno. Así, estos datos no quedan expuestos en el código que se sube a repositorios públicos como GitHub.

Configuración Específica del Entorno: Permiten que el mismo código funcione en diferentes entornos (desarrollo, prueba y producción) sin cambios. Por ejemplo, una variable de entorno puede indicar la URL de la base de datos de producción o la de desarrollo, y el programa usará la correcta en cada caso.

Flexibilidad y Portabilidad: Facilitan la portabilidad de las aplicaciones. Una vez que el código está escrito, puedes desplegarlo en cualquier servidor o contenedor, y solo necesitas configurar las variables de entorno adecuadas para que funcione correctamente.

En el desarrollo de JavaScript, especialmente en el backend con Node.js, se utilizan a menudo paquetes como dotenv para cargar variables de entorno desde un archivo .env en el entorno de ejecución, manteniendo así la información de configuración separada del código.


                                   12. ¿Qué son las herramientas de desarrollo de Chrome y cómo se accede a ellas?
Las herramientas de desarrollo de Chrome (Chrome DevTools) son un conjunto de herramientas de depuración y desarrollo de software que vienen integradas en el navegador Google Chrome. Permiten a los desarrolladores inspeccionar y manipular páginas web en tiempo real, lo que facilita la depuración, el análisis y la optimización del rendimiento.

¿Cómo se accede a ellas?
Hay varias formas de abrir las DevTools:

Usando el teclado:

Presiona F12 en Windows y Linux.

Presiona Cmd + Opt + I en Mac.

También puedes usar Ctrl + Shift + I en Windows/Linux o Cmd + Opt + J en Mac para abrir directamente la pestaña Consola.

A través del menú de Chrome:

Haz clic en los tres puntos verticales en la esquina superior derecha del navegador.

Selecciona Más herramientas y luego Herramientas para desarrolladores.

Con el clic derecho del mouse:

Haz clic derecho en cualquier parte de una página web y selecciona Inspeccionar. Esta opción abre las DevTools directamente en la pestaña Elementos, enfocándose en el elemento que inspeccionaste.

Las DevTools se abrirán como un panel adjunto a la ventana del navegador. Puedes acoplarlo en la parte inferior, a la derecha o en una ventana separada.


                             13. ¿Qué se puede hacer en el panel "Elements" de las herramientas de desarrollo?
El panel "Elements" (Elementos) de las herramientas de desarrollo de Chrome te permite inspeccionar y manipular la estructura HTML y los estilos CSS de una página web en tiempo real.

Funciones Principales
Inspeccionar el HTML y el CSS: Puedes ver el código HTML de la página como un árbol de nodos y, al mismo tiempo, ver los estilos CSS que se aplican a cada elemento. Al seleccionar un elemento en el árbol, puedes ver y editar sus propiedades CSS en el panel "Styles" (Estilos) a la derecha.

Editar el código en tiempo real: Puedes modificar el HTML o los valores de las propiedades CSS directamente en el panel. Por ejemplo, puedes cambiar el texto de un encabezado o el color de un botón y ver los cambios reflejados instantáneamente en la página. Sin embargo, estas modificaciones son solo temporales; se pierden al recargar la página.

Depurar el diseño: Permite identificar y corregir problemas de diseño. Puedes ver el modelo de caja de cada elemento (margen, borde, relleno y contenido) para entender por qué los elementos no se alinean como esperas.

Interactuar con el DOM: Puedes arrastrar y soltar nodos en el árbol HTML para reorganizar los elementos, o incluso eliminarlos para ver cómo afecta al diseño.

Ver los eventos asociados: La pestaña "Event Listeners" (Escuchadores de eventos) muestra los eventos de JavaScript (como clics o envíos de formulario) que están asociados con un elemento, lo cual es muy útil para la depuración de la interactividad.

Visualizar el diseño de cuadrículas y flexbox: Si la página utiliza CSS Grid o Flexbox, el panel "Elements" ofrece superposiciones visuales que muestran las líneas de la cuadrícula o la estructura del contenedor flexible, facilitando la comprensión de diseños complejos.


                           14. ¿Cómo se utiliza el panel "Console" de las herramientas de desarrollo y para qué es útil?
El panel "Console" (Consola) de las herramientas de desarrollo de Chrome es un entorno de JavaScript que permite a los desarrolladores ejecutar código, registrar información y depurar errores en una página web. Es una de las herramientas más esenciales para el desarrollo y la depuración.

Usos principales
Depurar errores: La consola muestra los errores y advertencias que ocurren en el código JavaScript de la página. Te indica el tipo de error (por ejemplo, TypeError, ReferenceError), la línea y el archivo donde ocurrió, lo que facilita enormemente la corrección de problemas.

Ejecutar código en tiempo real: Puedes escribir y ejecutar código JavaScript directamente en la consola. Esto es muy útil para probar pequeñas piezas de código, probar la funcionalidad de una función, o interactuar con variables y objetos de la página. Por ejemplo, puedes escribir document.body.style.backgroundColor = 'lightblue'; para cambiar el color de fondo de la página al instante.

Registrar información: Los desarrolladores usan métodos como console.log(), console.warn(), y console.error() en su código para imprimir mensajes en la consola. Esto ayuda a rastrear el flujo de ejecución de un programa y verificar el valor de las variables en diferentes puntos. .

Inspeccionar valores: Puedes inspeccionar el valor de cualquier variable o de un objeto complejo escribiendo su nombre en la consola. La consola te mostrará una vista detallada que puedes expandir para ver todas sus propiedades.

Depuración avanzada: Junto con el panel "Sources", la consola permite configurar puntos de interrupción (breakpoints) para detener la ejecución del código en una línea específica y examinar el estado de las variables en ese momento, lo que ofrece un control granular sobre el proceso de depuración.
   
                           15. ¿Qué información se puede obtener del panel "Network" y por qué es importante?
El panel "Network" (Red) de las herramientas de desarrollo de Chrome te permite monitorear y analizar todas las solicitudes y respuestas de red que tu navegador realiza al cargar una página web. Es una herramienta indispensable para entender el rendimiento de una página y depurar problemas relacionados con la carga de recursos.

Información que se puede obtener
El panel de red muestra una lista detallada de cada recurso que se carga, como archivos HTML, CSS, JavaScript, imágenes, fuentes, y solicitudes a APIs. Por cada recurso, puedes ver la siguiente información:

Estado (Status): El código de respuesta HTTP. Por ejemplo, 200 OK (éxito), 404 Not Found (recurso no encontrado) o 500 Internal Server Error (error en el servidor).

Tipo (Type): El tipo de recurso, como script para JavaScript, css para hojas de estilo o img para imágenes.

Método (Method): El método HTTP usado para la solicitud, como GET, POST, PUT o DELETE.

Tiempo (Time): El tiempo que tardó la solicitud en completarse, lo que te ayuda a identificar los recursos que más tiempo tardan en cargarse.

Tamaño (Size): El tamaño del recurso, tanto el tamaño total descargado como el tamaño comprimido.

Timeline: Un gráfico de cascada que visualiza el tiempo de cada fase de la solicitud (DNS, conexión, envío, espera y recepción), lo que es crucial para optimizar el rendimiento.

Importancia
El panel "Network" es crucial por varias razones:

Optimización del Rendimiento: Al ver qué recursos tardan más en cargarse o cuáles son los más pesados, puedes tomar decisiones para optimizar la velocidad de la página. Por ejemplo, puedes identificar imágenes que necesiten ser comprimidas o archivos JavaScript que puedan ser cargados de forma asíncrona.

Depuración de Errores: Te ayuda a diagnosticar problemas de carga. Si un recurso no se carga, el panel mostrará el código de error correspondiente, permitiéndote saber si el problema es que el archivo no existe, que la URL es incorrecta o que hay un problema en el servidor.

Monitoreo de APIs: Si tu página interactúa con APIs, este panel te permite ver el tráfico de la red, inspeccionar las peticiones y las respuestas de las APIs para asegurarte de que están funcionando como se espera.

Seguridad: Puedes identificar solicitudes a sitios web externos sospechosos que no deberían estar ahí, lo que te ayuda a detectar posibles vulnerabilidades.


