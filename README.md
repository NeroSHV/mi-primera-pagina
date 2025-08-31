# mi-primera-pagina
Ejercicio del taller

1. ¿Qué es HTML y cuál es su función en la web?
   
HTML, que significa HyperText Markup Language, es un lenguaje de marcado esencial para la creación de páginas web. Su función principal es estructurar el contenido de una página web, como los títulos, párrafos, listas, e imágenes.

Función en la web
La función de HTML en la web se puede resumir en los siguientes puntos:
Creación de la estructura: Define la estructura fundamental de la página, organizando el contenido de manera lógica y jerárquica.
Contenido semántico: Proporciona significado a las partes de un documento, lo que ayuda a los motores de búsqueda a entender de qué trata la página.
Enlace de recursos: Permite enlazar otros archivos, como hojas de estilo CSS para el diseño y scripts de JavaScript para la interactividad.
Mientras que HTML crea la estructura, otros lenguajes como CSS (Cascading Style Sheets) se encargan del estilo y la presentación (colores, fuentes, diseño) y JavaScript añade la interactividad y el comportamiento dinámico. Juntos, forman la base de casi todas las páginas web.


2. ¿Que es una etiqueta HTML y menciona las etiquetas más comunes?

<html>: Etiqueta raíz que envuelve todo el contenido de una página web.
<head>: Contiene metadatos, como el título de la página, enlaces a hojas de estilo (CSS) y scripts (JavaScript). El contenido dentro de esta etiqueta no es visible para el usuario en la ventana del navegador.
<title>: Define el título de la página que aparece en la pestaña del navegador.
<body>: Contiene todo el contenido visible de la página, como texto, imágenes, enlaces y tablas.
<h1>, <h2>, <h3>, <h4>, <h5>, <h6>: Definen encabezados (títulos) con diferentes niveles de importancia, siendo <h1> el más importante.
<p>: Representa un párrafo de texto.
<a>: Crea un hipervínculo (enlace) que permite navegar a otra página o a un recurso externo.
<img>: Inserta una imagen en la página.
<ul> y <ol>: Crean listas. <ul> es para listas no ordenadas (con viñetas) y <ol> es para listas ordenadas (numeradas).
<div>: Es un contenedor genérico que se utiliza para agrupar contenido y aplicar estilos con CSS. Es una de las etiquetas más flexibles y comunes.
<strong>: Indica que un texto es importante y, por lo general, lo muestra en negrita.
<em>: Enfatiza un texto, generalmente mostrándolo en cursiva.
   
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

10. ¿Que es un selector en CSS y cuales tipos existen?
Un selector en CSS es un patrón que se utiliza para seleccionar y apuntar a los elementos HTML a los que deseas aplicar estilos. Es la parte más importante de una regla CSS, ya que sin él, el navegador no sabría qué elementos deben ser afectados por el código de estilo.

Una regla CSS completa consta de un selector y un bloque de declaración. El selector apunta al elemento, y el bloque de declaración contiene las propiedades y valores de estilo. Por ejemplo, en el código p { color: blue; }, p es el selector que apunta a todos los párrafos, y { color: blue; } es la declaración que les da un color azul.

Tipos de Selectores CSS
Selectores Básicos
Selector de Tipo (o de Elemento): Selecciona todos los elementos HTML de un tipo específico. Por ejemplo, h1 seleccionaría todos los encabezados de tipo <h1>.

Selector de ID: Selecciona un único elemento basado en su atributo id. Se indica con el símbolo de almohadilla (#). Por ejemplo, #logo seleccionaría el elemento con id="logo".

Selector de Clase: Selecciona todos los elementos que tienen un atributo class específico. Se indica con un punto (.). Por ejemplo, .menu-item seleccionaría todos los elementos con la clase menu-item.

Selector Universal: Selecciona todos los elementos en la página. Se representa con un asterisco (*). Por ejemplo, * { margin: 0; } eliminaría el margen de todos los elementos.

Selectores Combinadores
Estos selectores combinan otros selectores para definir relaciones entre los elementos.

Selector Descendiente: Selecciona un elemento que es descendiente de otro (un hijo, un nieto, etc.). Se usa un espacio. Por ejemplo, ul li seleccionaría todos los <li> que están dentro de un <ul>.

Selector de Hijo Directo: Selecciona un elemento que es el hijo inmediato de otro. Se usa el símbolo de mayor que (>). Por ejemplo, div > p seleccionaría los párrafos que son hijos directos de un <div>, pero no los párrafos que están anidados más profundamente.

Selector de Hermano Adyacente: Selecciona un elemento que es hermano de otro y que lo sigue inmediatamente. Se usa el signo más (+). Por ejemplo, h2 + p seleccionaría el primer párrafo que sigue inmediatamente a un encabezado <h2>.

Selectores de Atributo
Estos selectores apuntan a elementos que tienen un atributo específico o un valor de atributo en particular. Se usan corchetes []. Por ejemplo, [href] seleccionaría todos los elementos que tienen el atributo href.

Pseudo-clases y Pseudo-elementos
Pseudo-clases: Seleccionan elementos basándose en un estado específico. Se indican con dos puntos (:). Por ejemplo, :hover selecciona un elemento cuando el usuario pasa el cursor sobre él. Otros ejemplos comunes son :active, :focus y :first-child.

Pseudo-elementos: Seleccionan y dan estilo a una parte específica de un elemento. Se indican con dos puntos dobles (::). Por ejemplo, ::first-line selecciona la primera línea de texto de un elemento, y ::before crea un "pseudo-elemento" antes del contenido de un elemento.


11. ¿Qué es JavaScript y cómo añade la interactividad a las páginas web?




12. ¿Cuáles son los tipos de datos primitivos en Javascript?





13. ¿Cómo funcionan las estructuras de control de fl ujo como if, else, switch y bucles en
Javascript?




14. ¿Por qué es importante usar nombres significativos para variables y métodos?



15. ¿Qué es una variable de entorno y por qué son importantes para Javascript o la
programación en general?




17. ¿Qué son las herramientas de desarrollo de Chrome y cómo se accede a ellas?



18. ¿Qué se puede hacer en el panel "Elements" de las herramientas de desarrollo?



19. ¿Cómo se utiliza el panel "Console" de las herramientas de desarrollo y para qué es
útil?
20. ¿Qué información se puede obtener del panel "Network" y por qué es importante?

