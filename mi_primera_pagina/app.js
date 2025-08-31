// Botón que escribe en la consola
document.getElementById('saludo').addEventListener('click', function () {
  console.log('Hola Mundo desde JavaScript');
  alert('Revisa la consola: presiona f12');
});

// Controles para experimentar con CSS
document.getElementById('selFondo').addEventListener('change', function () {
  document.body.style.backgroundColor = this.value; // background-color
});

document.getElementById('fontSize').addEventListener('input', function () {
  document.querySelector('p').style.fontSize = this.value + 'px'; // font-size
});

document.getElementById('selAlign').addEventListener('change', function () {
  document.querySelector('p').style.textAlign = this.value; // text-align
});